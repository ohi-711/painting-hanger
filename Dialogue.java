/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This program displays the dialogue line by line by looping through an array of strings. 
 */

// Daisy (with additions by April)
// imports
import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class Dialogue
{
    // April
    Console c;
    String[] dialogue = {}; // string array of the dialogue
    
    public Dialogue (Console con, String[] d)
    {
        c = con;
        dialogue = d;
        LivingRoom l = new LivingRoom (c);
        l.display (); // displays the living room as the background
        Alice a = new Alice (c);
        a.display (200, 250); // displays the character talking to the player
    }


    public void run ()
    {
        dialogue ();
    }

    // Daisy
    public void dialogue () // displays the dialogue
    {
        LivingRoomNone l2 = new LivingRoomNone (c);
        Alice a2 = new Alice (c);
        c.getChar();
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.PLAIN, 30));
        c.drawString ("Hi Salad!", 130, 140);
        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to continue", 140, 450);
        c.getChar();
        for (int i = 0 ; i < dialogue.length; i++) // loops through the string array of the dialogue
        {
            l2.display ();
            a2.display (200, 250);
            c.setColor (Colours.black);
            c.setFont (new Font ("Ariel", Font.PLAIN, 30));
            c.drawString (dialogue [i], 130, 140);
            c.setFont (new Font ("Ariel", Font.BOLD, 25));
            c.drawString ("Press any key to continue", 140, 450);
            c.getChar ();
        }

        c.clear ();
        c.setColor (Colours.black);


    }
}
