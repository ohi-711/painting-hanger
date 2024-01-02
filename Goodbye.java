import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class Goodbye
{
    Console c;
    String option;
    char pressed;

    public Goodbye (Console con)
    {
        c = con;
    }


    public void run ()
    {
        // clears screen using transition
        c.setColor (Colours.black);
        for (int i = 0 ; i <= 840 ; i++)
        {
            c.drawLine (0, i, 840, i);
            try
            {
                Thread.sleep (3);
            }
            catch (Exception e)
            {
            }
        }

        c.setColor (Colours.white);
        for (int i = 0 ; i <= 840 ; i++)
        {
            c.drawLine (0, i, 840, i);
            try
            {
                Thread.sleep (3);
            }
            catch (Exception e)
            {
            }
        }
        draw ();
    }


    public void draw ()
    {
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Thank you for playing!", 90, 80);
        // add more here later for graphics

    }
}
