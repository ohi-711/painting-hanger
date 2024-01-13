import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class Dialogue
{
    Console c;
    String option;
    char pressed;

    String[] dialogue = {};

    public Dialogue (Console con, String[] dialogue)
    {
        c = con;
        dialogue = dialogue;
        LivingRoom l = new LivingRoom (c);
        l.display ();
        Alice a = new Alice (c);
        a.display (200, 250);
    }


    public void run ()
    {
        dialogue ();
    }


    public void dialogue ()
    {
        LivingRoomNone l2 = new LivingRoomNone (c);
        Alice a2 = new Alice (c);
        c.getChar();
        c.getChar();
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("Hi Salad!", 130, 140);
        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
        for (int i = 0 ; i < dialogue.length ; i++)
        {
            c.getChar ();
            l2.display ();
            a2.display (200, 250);
            c.setColor (Colours.black);
            c.setFont (new Font ("Ariel", Font.PLAIN, 30));
            c.drawString (dialogue [i], 130, 140);
            c.setFont (new Font ("Ariel", Font.BOLD, 25));
            c.drawString ("Press any key to continue", 140, 450);
        }

        c.clear ();
        c.setColor (Colours.black);


    }
}
