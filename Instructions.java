/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This is the instructions screen of the game. This screen appears after the menu if the user chose to read the instructions
 */

// April
// imports
import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class Instructions
{
    Console c;

    public Instructions (Console con)
    {
        c = con;
        draw ();
    }


    public void run ()
    {
        draw ();
    }


    public void draw ()
    {
        c.getChar (); // gets the user to enter a key before returning to the menu
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500); // background
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Painting Hanger", 140, 80); // title

        c.setFont (new Font ("Ariel", Font.PLAIN, 35));
        c.drawString ("Go through the", 140, 140); // instructions
        c.drawString ("basement to get", 140, 180);
        c.drawString ("the paintings,", 140, 220);
        c.drawString ("and then put the", 140, 260);
        c.drawString ("paintings up on the", 140, 300);
        c.drawString ("living room wall!", 140, 340);

        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to return", 140, 450); // prompt to explain to the user how to return
    }
}
