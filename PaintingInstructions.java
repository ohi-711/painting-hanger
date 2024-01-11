import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class PaintingInstructions
{
    Console c;
    String option;
    char pressed;

    public PaintingInstructions (Console con)
    {
        c = con;
        c.getChar ();
    }


    public void run ()
    {
        LivingRoom l = new LivingRoom (c);
        l.display ();

        Alice a = new Alice (c);
        a.display (200, 250);
        
        draw ();
    }


    public void draw ()
    {
        c.getChar ();
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("instructions here", 140, 140);


        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
    }
}
