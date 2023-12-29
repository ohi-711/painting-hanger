import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import sun.audio.*;
import java.awt.Font;

public class GameIntro
{
    Console c;
    String option;
    char pressed;
    AudioStream as; // crediting Colin for his code that plays music

    public GameIntro (Console con)
    {
	c = con;
	draw ();
	try // crediting Colin for his code that plays music
	{
	    as = new AudioStream (new FileInputStream ("music.wav"));
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

	c.setFont (new Font ("Ariel", Font.PLAIN, 30));
	c.drawString ("Welcome to the game!", 140, 140);

	c.setFont (new Font ("Ariel", Font.BOLD, 25));
	c.drawString ("Press any key to continue", 140, 450);
    }
}
