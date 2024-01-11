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
        
        dialogue ();
    }


    public void dialogue ()
    {
        LivingRoomNone l2 = new LivingRoomNone (c);
        Alice a2 = new Alice (c);
        
        c.getChar ();
        c.getChar ();
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("instructions here", 140, 140);
        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
        c.getChar ();
        
        l2.display();
        a2.display (200, 250);
        
        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("more instructions here", 140, 140);
        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
        c.getChar ();

        l2.display();
        a2.display (200, 250);

        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("thank you for your help!!!!", 140, 140);
        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
        
        c.getChar ();
    }
}
