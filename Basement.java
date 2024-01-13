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
        draw();
        walk ();
    }

    public void draw(){

        c.setColor(Colours.frame);
        c.fillRect(0, 0, 640, 500);
        c.setColor(Colours.darkOrange);
        boxes = new Box[]{
                new Box(c, 60, 0, 560, 20),
                new Box(c, 0, 60, 20, 460),
                new Box(c, 620, 0, 20, 480),
                new Box(c, 0, 480, 640, 20),
                new Box(c, 80, 80, 500, 20),
                new Box(c, 80, 80, 20, 80),
                new Box(c, 0, 140, 80, 20),
                new Box(c, 560, 80, 20, 120),
                new Box(c, 100, 260, 600, 20)
        };
        for(int i = 0; i < boxes.length; i++){
            boxes[i].draw();
        }

    }


    public void run ()
    {
        drawCharacter ();
    }


    public void walk ()
    {
        char pressed = c.getChar ();
        boolean colliding = false;


        if (pressed == 'w' && locationY - 20 > 0 && !colliding)
        {
            locationY -= 20;
            direction = "front";
        }
        else if (pressed == 'd' && locationX + 20 + 40 < 640 && !colliding) // 40 is character width
        {
            locationX += 20;
            direction = "right";
        }
        else if (pressed == 's' && locationY + 20 + 40 < 500 && !colliding) // 40 is character height
        {
            locationY += 20;
            direction = "back";
        }
        else if (pressed == 'a' && locationX - 20 > 0 && !colliding)
        {
            locationX -= 20;
            direction = "left";
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
