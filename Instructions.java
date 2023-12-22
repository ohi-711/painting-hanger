import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import sun.audio.*;
import java.awt.Font;

public class Instructions
{
    Console c;
    String option;
    char pressed;
    AudioStream as; // crediting Colin for his code that plays music

    public Instructions (Console con)
    {
        c = con;
        draw ();
        try // crediting Colin for his code that plays music
        {
            as = new AudioStream (new FileInputStream ("88. Lost Library.wav"));
            AudioPlayer.player.start (as);
        }
        catch (Exception e)
        {
        }
    }


    public void run ()
    {
        draw ();
    }


    public void draw ()
    {
        char pressed = c.getChar ();
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Painting Hanger", 140, 80);

        c.setFont (new Font ("Ariel", Font.PLAIN, 35));
        c.drawString ("Go through the", 140, 140);
        c.drawString ("basement to get", 140, 180);
        c.drawString ("the paintings,", 140, 220);
        c.drawString ("and then put the", 140, 260);
        c.drawString ("paintings up on the", 140, 300);
        c.drawString ("living room wall!", 140, 340);

        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to return", 140, 450);
    }
}
