import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import sun.audio.*;
import java.awt.Font;

public class Scoreboard
{
    Console c;
    String option;
    char pressed;
    AudioStream as; // crediting Colin for his code that plays music

    public Scoreboard (Console con)
    {
        c = con;
        draw ();
        try // crediting Colin for his code that plays music
        {
            //as = new AudioStream (new FileInputStream ("music.wav"));
            //AudioPlayer.player.start (as);
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
        c.setColor (Colours.lightBlue);
        c.fillRect (135, 100, 355, 330);
        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("High Scores", 135, 80);
        
        c.setFont (new Font ("Ariel", Font.PLAIN, 35));
        try
        {
            BufferedReader in;
            String line;
            int count = 0;
            boolean foundName = false;
            in = new BufferedReader (new FileReader ("scoreboard.txt"));
            while (true)
            {
                count++;
                // if the store name is found:
                line = in.readLine ();
                if (count > 8)
                    break;
                if (line == null)
                    break;
                c.drawString (line, 140, 120+count*35);
            }
            in.close ();
        }
        catch (IOException e)
        {
        }

        c.setFont (new Font ("Ariel", Font.BOLD, 25));
        c.drawString ("Press any key to return", 140, 450);
    }
}
