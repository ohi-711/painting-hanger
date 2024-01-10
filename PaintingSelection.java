import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class PaintingSelection
{
    Console c;
    String option;
    char pressed;

    public PaintingSelection (Console con, String menuOption)
    {
        c = con;
        option = menuOption;
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
        c.setColor (Colours.black);
        // draw arrow here
    }

    public void draw ()
    {
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
        
        // options

        if (pressed == '1')
        {
            arrow (0, 100); 
        }
        if (pressed == '2')
        {
            arrow (100, 100); 
        }
        if (pressed == '3')
        {
            arrow (0, 200); 
        }
        if (pressed == '4')
        {
            arrow (100, 200); 
        }
        if (pressed == '5')
        {
            arrow (200, 200); 
        }

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 42));
        c.drawString ("Select a painting!", 110, 80);
    }
}
