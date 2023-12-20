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
    c.setColor (Colours.black);
    c.setFont (new Font ("Ariel", Font.BOLD, 45));
    c.drawString ("Painting Hanger", 140, 80);
    c.drawString ("Go through the basement", 140, 80);
    c.drawString ("to get the paintings,", 140, 90);
    c.drawString ("and then put the", 140, 100);
    c.drawString ("paintings up on the", 140, 110);
    c.drawString ("living room wall!", 140, 120);
    // add more here later for graphics

}
}
