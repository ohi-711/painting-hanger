// Daisy Li
// This file runs the painting hanging game

import hsa.Console;
import java.awt.Font;
import java.util.ArrayList;

public class HangingPainting
{
    Console c;
	// what the current painting being hung is
	int currentPainting;
	// current score
	int currentScore;
	// hanging painting's position
	int currentX;
	int currentY;
	String currentPhase;

	// ArrayLists
	// They are like arrays, but their size is changeable
	// One to store Painting objects, the other to store coordinates
	// Both are updated in sync
	// Source: Java Documentation, ArrayList
	Painting[] currentHanging = new Painting[1000];
	int[][] coords = new int[1000][2];

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
		for(int i = 0; i < currentHanging.length; i++){
			if(currentHanging[i] == null){
				System.out.println("running");
				if(currentPainting == 1){
					currentHanging[i] = new PaintingOne(c);
				} else if(currentPainting == 2){
					currentHanging[i] = new PaintingTwo(c);
				} else if(currentPainting == 3){
					currentHanging[i] = new PaintingThree(c);
				} else if(currentPainting == 4){
					currentHanging[i] = new PaintingFour(c);
				} else if(currentPainting == 5){
					currentHanging[i] = new PaintingFive(c);
				}
				coords[i] = new int[]{currentX, currentY};
				break;
			}

		}
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
		for(int i = 0; i < currentHanging.length; i++){
			if(currentHanging[i] != null)
				currentHanging[i].display(coords[i][0], coords[i][1]);
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


