/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This program is the splashscreen that plays before the menu. The user can press any key to proceed to the menu
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

public class SplashScreen
{
    Console c;
    String option;
    char pressed;
    BufferedImage splashscreen; // splashscreen image

    public SplashScreen (Console con)
    {
        c = con;
        draw ();
    }


    public void run ()
    {
        draw ();
        c.getChar ();
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
    }


    public void draw ()
    {
        try
        {
            splashscreen = ImageIO.read (new File ("img/splashscreen.png")); // loads image (art drawn by April)
        }
        catch (IOException e)
        {
        }
        c.drawImage (splashscreen, 0, 0, null); // draws splashscreen
    }
}
