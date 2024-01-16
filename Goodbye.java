/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This program runs after the user chooses to exit. It plays a brief transition animation before displaying an ending message
 */

// April
// imports
import hsa.Console;
import hsa.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Font;

public class Goodbye
{
    Console c;
    BufferedImage goodbye; // ending image

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


    public void draw () // ending screen
    {
        try
        {
            goodbye = ImageIO.read (new File ("img/goodbye.png")); // loads image (art drawn by April)
        }
        catch (IOException e)
        {
        }
        c.drawImage (goodbye, 0, 0, null); // draws ending image

    }
}
