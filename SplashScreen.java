import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import sun.audio.*;
import java.awt.Font;

public class MainMenu
{
    Console c;
    String option;
    char pressed;
    AudioStream as; // crediting Colin for his code that plays music

    public MainMenu (Console con)
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
	draw();
      c.getChar();
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
    // add something here later for graphics

    }
}
