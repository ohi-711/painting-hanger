import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class HangingPainting
{
    Console c;
    int locationX;
    int locationY;
    char pressed;
    int paintingPoints;
    char paintingOption;

    public HangingPainting (Console con, char paintingOption, int paintingPoints)
    {
	c = con;
	paintingOption = paintingOption;
	paintingPoints = paintingPoints;
	walk ();
    }


    public void run ()
    {
	drawCharacter ();
    }


    public void move ()
    {
	char pressed = c.getChar ();


	if (pressed == 'w' && locationY - 20 > 0)
	{
	    locationY -= 20;
	}
	else if (pressed == 'd' && locationX + 20 + 50 < 640) // 50 is character width
	{
	    locationX += 20;
	}
	else if (pressed == 's' && locationY + 20 + 50 < 500) // 50 is character height
	{
	    locationY += 20;
	}
	else if (pressed == 'a' && locationX - 20 > 0)
	{
	    locationX -= 20;
	}

    }


    public void draw (Console con, int locationX, int locationY, char paintingOption, int paintingPoints)
    {
	c = con;
	if (paintingOption == '1')
	{
	    
	}
	
	LivingRoomNone l = new LivingRoomNone(c);
	l.display();
    }


    public void drawPainting ()
    {
	while (true)
	{
	    walk ();
	    c.draw (c, 300, 300, paintingOption, paintingPoints);

	    if (pressed == 'z')
		break;
	}
    }
}


