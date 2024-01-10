import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class PaintingSelection
{
    Console c;
    char pressed;
    int paintingPoints;

    public PaintingSelection (Console con, char menuOption)
    {
        c = con;
        pressed = menuOption;
    }


    public void run ()
    {
        while (true)
        {
            draw ();
            pressed = c.getChar ();
        }
    }

    private void arrow (int locationX, int locationY)
    {
        c.setColor (Colours.red);
        // draw arrow here
    }

    public void draw ()
    {
	// clears background
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        
        // draws paintings
        PaintingOne l = new PaintingOne ();
	    l.display (0, 0);

        PaintingTwo l = new PaintingTwo ();
	    l.display (100, 100);

        PaintingThree l = new PaintingThree ();
	    l.display (0, 200);

        PaintingFour l = new PaintingFour ();
	    l.display (100, 200);

        PaintingFive l = new PaintingFive ();
	    l.display (200, 200);
        
        // draws an arrow next to the selected painting
        if (pressed == '1')
        {
            arrow (0, 100); 
	    paintingPoints = 100; // gives a value to paintingPoints depending on the choice of painting
        }
        if (pressed == '2')
        {
            arrow (100, 100); 
            paintingPoints = 200;
        }
        if (pressed == '3')
        {
            arrow (0, 200); 
	    paintingPoints = 100;
        }
        if (pressed == '4')
        {
            arrow (100, 200); 
	    paintingPoints = 100;
        }
        if (pressed == '5')
        {
            arrow (200, 200); 
	    paintingPoints = 100;
        }
	if (pressed == 'z')
	{
	    break;
	}

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 42));
        c.drawString ("Select a painting!", 110, 80);
    }
}
