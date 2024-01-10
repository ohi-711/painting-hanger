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

    public void draw ()
    {
        // options
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.orange);
        if (option.equals ("start"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 130, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("instructions"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 210, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("scoreboard"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 290, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("quit"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 370, 370, 60);

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Painting Hanger", 140, 80);
    }
}
