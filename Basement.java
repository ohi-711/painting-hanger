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

    public Basement (Console con, int locationX, int locationY)
    {
	c = con;
	locationX = locationX;
	locationY = locationY;
	walk ();
    }


    public void run ()
    {
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
	else if (pressed == 'd' && locationX + 20 + 50 < 640) // 50 is character width
	{
	    locationX += 20;
	    direction = "right";
	}
	else if (pressed == 's' && locationY + 20 + 50 < 500) // 50 is character height
	{
	    locationY += 20;
	    direction = "back";
	}
	else if (pressed == 'a' && locationX - 20 > 0)
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
	    d.draw (c, locationX, locationY, direction);
	}
    }
}
