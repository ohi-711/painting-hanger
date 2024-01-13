import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class GameIntro
{
    Console c;
    String option;
    char pressed;

	String[] dialogue = {
			"Thanks for agreeing to help...",
			"me hang up paintings!",
			"However, the box of paintings is...",
			"in the basement!",
			"Could you get it for me?",
			"Thanks so much!"
	};

    public GameIntro (Console con)
    {
		c = con;
		LivingRoom l = new LivingRoom (c);
		l.display ();
		Alice a = new Alice (c);
		a.display (200, 250);
    }

	public void run ()
	{
		dialogue ();
	}

	public void dialogue ()
	{
		LivingRoomNone l2 = new LivingRoomNone (c);
		Alice a2 = new Alice (c);
		c.setColor (Colours.black);
		c.setFont (new Font ("Ariel", Font.PLAIN, 30));
		c.drawString ("Hi Salad!", 130, 140);
		c.setFont (new Font ("Ariel", Font.BOLD, 25));
		c.drawString ("Press any key to continue", 140, 450);
		for(int i = 0; i < dialogue.length; i++){
			c.getChar();
			l2.display();
			a2.display(200, 250);
			c.setColor (Colours.black);
			c.setFont (new Font ("Ariel", Font.PLAIN, 30));
			c.drawString (dialogue[i], 130, 140);
			c.setFont (new Font ("Ariel", Font.BOLD, 25));
			c.drawString ("Press any key to continue", 140, 450);
		}

		c.clear();
		c.setColor(Colours.black);


	}
}
