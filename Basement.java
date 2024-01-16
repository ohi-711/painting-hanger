import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class Basement
{
    Console c;
    String option;
    int locationX;
    int locationY;
    char pressed;
    String direction = "front";

    Box[] boxes;



    public Basement (Console con, int x, int y)
    {
        c = con;
        locationX = x;
        locationY = y;
    }

    public void draw(){

        c.setColor(Colours.mBack);
        c.fillRect(0, 0, 640, 500);
        c.setColor(Colours.mWalls);
        boxes = new Box[]{
                new Box(c, 60, 0, 560, 20),
                new Box(c, 0, 60, 20, 460),
                new Box(c, 620, 0, 20, 480),
                new Box(c, 0, 480, 640, 20),
                new Box(c, 80, 60, 500, 20),
                new Box(c, 80, 60, 20, 80),
                new Box(c, 0, 140, 100, 20),
                new Box(c, 560, 60, 20, 120),
                new Box(c, 100, 240, 480, 20),
                new Box(c, 560, 240, 20, 260),
                new Box(c, 340, 120, 20, 120),
                new Box(c, 340, 120, 120, 20),
                new Box(c, 460, 120, 20, 80),
                new Box(c, 180, 120, 20, 120),
                new Box(c, 260, 60, 20, 120),
                new Box(c, 0, 360, 400, 20),
                new Box(c, 460, 240, 20, 140),
                new Box(c, 100, 240, 20, 80),
                new Box(c, 260, 300, 20, 60)
        };
        for(int i = 0; i < boxes.length; i++){
            boxes[i].draw();
        }

        c.setColor (Colours.box);
        c.fillRect(300, 400, 40, 40); // goal

    }


    public void run ()
    {
        draw();
        walk ();
        drawCharacter ();
    }


    public void walk ()
    {
        char pressed = c.getChar ();

        if (pressed == 'w' && locationY - 20 > 0)
        {
            locationY -= 20;
            direction = "front";
        }
        else if (pressed == 'd' && locationX + 20 + 40 < 640) // 40 is character width
        {
            locationX += 20;
            direction = "right";
        }
        else if (pressed == 's' && locationY + 20 + 40 < 500) // 40 is character height
        {
            locationY += 20;
            direction = "back";
        }
        else if (pressed == 'a' && locationX - 20 > 0)
        {
            locationX -= 20;
            direction = "left";
        }
        for(int i = 0; i < boxes.length; i++){
            if(locationX > boxes[i].positionX-40 && locationX < boxes[i].positionX + boxes[i].width && locationY > boxes[i].positionY-40 && locationY < boxes[i].positionY+boxes[i].height){
                if(pressed == 'w'){
                    locationY += 20;
                } else if(pressed == 'd'){
                    locationX -= 20;
                } else if(pressed == 's'){
                    locationY -= 20;
                } else if(pressed == 'a'){
                    locationX += 20;
                }
            }
        }

    }


    public void drawCharacter ()
    {
        drawCharacter d = new drawCharacter (c, locationX, locationY, direction);
        while (true)
        {
            walk ();
            draw();
            d.draw (c, locationX, locationY, direction);
            
            if (locationX >= 300-40 && locationX <= 340 && locationY > 400-40 && locationY <= 440) // fix collision pls
                break;
        }
    }
}
