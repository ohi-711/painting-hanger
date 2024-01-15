/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This is the scoreboard screen of the game. This screen appears after the menu if the user chose to look at the scoreboard
 */

// April
// imports
import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import sun.audio.*;
import java.awt.Font;

public class Scoreboard
{
    Console c;
    AudioStream as; // crediting Colin for his code that plays music

    public Scoreboard (Console con)
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
        c.setColor (Colours.white); // background
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.lightBlue); 
        c.fillRect (135, 100, 355, 330);
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("High Scores", 135, 80); // title
        
        c.setFont (new Font ("Ariel", Font.PLAIN, 35));
        try // reads from the file and displays it on the screen
        {
            BufferedReader in;
            String line;
            int count = 0;
            boolean foundName = false;
            in = new BufferedReader (new FileReader ("scoreboard.txt")); // reads from scoreboard.txt
            while (true) // loops through each line
            {
                count++;
                line = in.readLine ();
                if (count > 8) // only displays the top few scores (so it looks nicer)
                    break;
                if (line == null) // breaks if it reads an empty line (no more scores)
                    break;
                c.drawString (line, 140, 120+count*35); // displays the line of the file
            }
            in.close ();
        }
        catch (IOException e)
        {
        }

        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to return", 140, 450); // prompts the user to enter a key to return
    }
}
