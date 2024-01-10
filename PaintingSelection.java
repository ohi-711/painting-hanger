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
        draw ();
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
        // options
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        
        if (pressed == '1')
        {
            arrow (0, 100); 
        }
        if (pressed == '2')
        {
            arrow (0, 300); 
        }
        if (pressed == '3')
        {
            arrow (100, 100); 
        }
        if (pressed == '4')
        {
            arrow (100, 200); 
        }
        if (pressed == '5')
        {
            arrow (100, 300); 
        }

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Painting Hanger", 140, 80);
    }
}
