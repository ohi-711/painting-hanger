import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;
import java.util.ArrayList;

public class HangingPainting
{
    Console c;
	// what the current painting being hung is
	int currentPainting;
	// current score
	int currentScore;
	int currentX;
	int currentY;
	String currentPhase;

	// the array with current paintings on the wall, each sub array being
	// painting id, x, y
	int[][] hanging = new int[5][3];
	ArrayList<Painting> currentHanging= new ArrayList<>();
	ArrayList<int[]> coords = new ArrayList<>();

	int[] scores = {400, 300, 200, 500, 100};

    public HangingPainting (Console con)
    {
		currentScore = 0;
		currentX = 0;
		currentY = 0;
        c = con;
        currentPhase = "select";
    }


    public void run ()
    {
		while(true){
			if(currentPhase.equals("select")){
				PaintingSelection ps = new PaintingSelection(c, '1');
				ps.run();
				currentPainting = ps.selection;
				currentPhase = "move";
			}
			if(currentPhase.equals("move")){
				movePainting();
			}
			if(currentPhase.equals("look")){
				char pressed = c.getChar();
				if(pressed == 'z'){
					break;
				} else if(pressed == 'r'){
					currentPhase = "select";
				}
			}


		}

    }


    public void movePainting ()
    {
			draw();
			char pressed = c.getChar();

			if(pressed == 'w' && currentY > 10){
				currentY -= 10;
			} else if(pressed == 'a' && currentX > 0){
				currentX -= 10;
			} else if(pressed == 's' && currentY < 500-40){
				currentY += 10;
			} else if(pressed == 'd' && currentX < 640-40){
				currentX += 10;
			} else if(pressed == 'z'){
				savePainting();
				currentPhase = "look";
			}
    }

	public void savePainting(){
		if(currentPainting == 1){
			currentHanging.add(new PaintingOne(c));
		} else if(currentPainting == 2){
			currentHanging.add(new PaintingTwo(c));
		} else if(currentPainting == 3){
			currentHanging.add(new PaintingThree(c));
		} else if(currentPainting == 4){
			currentHanging.add(new PaintingFour(c));
		} else if(currentPainting == 5){
			currentHanging.add(new PaintingFive(c));
		}
		coords.add(new int[]{currentX, currentY});
		currentScore += scores[currentPainting-1];
		currentX = 0;
		currentY = 0;
	}

    public void draw ()
    {
		LivingRoomNone l = new LivingRoomNone(c);
		l.display();
		c.setFont (new Font ("Ariel", Font.PLAIN, 20));
		c.drawString ("Press z to confirm, r to select another painting, and w,a,s,d to move", 20, 470); // writes instructions on how to use hang the painting
		c.setColor(Colours.black);
		c.setFont(new Font("Ariel", Font.PLAIN, 20));
		c.drawString("Score: "+currentScore, 530, 20);
		for(int i = 0; i < currentHanging.size(); i++){
			currentHanging.get(i).display(coords.get(i)[0], coords.get(i)[1]);
		}
		if(currentPainting == 1){
			PaintingOne p = new PaintingOne(c);
			p.display(currentX, currentY);
		} else if(currentPainting == 2){
			PaintingTwo p = new PaintingTwo(c);
			p.display(currentX, currentY);
		} else if(currentPainting == 3){
			PaintingThree p = new PaintingThree(c);
			p.display(currentX, currentY);
		} else if(currentPainting == 4){
			PaintingFour p = new PaintingFour(c);
			p.display(currentX, currentY);
		} else if(currentPainting == 5){
			PaintingFive p = new PaintingFive(c);
			p.display(currentX, currentY);
		}

    }
}


