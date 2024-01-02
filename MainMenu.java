import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class MainMenu
{
    Console c;
    String option;
    char pressed;

    public MainMenu (Console con, String menuOption)
    {
        c = con;
        option = menuOption;
        draw ();
    }


    public void run ()
    {
        while (true)
        {
            
            draw ();
            pressed = c.getChar ();
            
            if (pressed == '1')
            {
                option = "start";
            }
            if (pressed == '2')
            {
                option = "instructions";
            }
            if (pressed == '3')
            {
                option = "scoreboard";
            }
            if (pressed == '4')
            {
                option = "quit";
            }
            if (pressed == 'z')
            {
                break;
            }
        }
    }

    public void draw ()
    {
        // options
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.orange);
        if (option.equals ("start"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 130, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("instructions"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 210, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("scoreboard"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 290, 370, 60);

        c.setColor (Colours.orange);
        if (option.equals ("quit"))
        {
            c.setColor (Colours.darkOrange);
        }
        c.fillRect (130, 370, 370, 60);

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 45));
        c.drawString ("Painting Hanger", 140, 80);

        c.setColor (Colours.white);
        c.setFont (new Font ("Ariel", Font.BOLD, 35));
        c.drawString ("Play", 280, 170);
        c.drawString ("Instructions", 220, 250);
        c.drawString ("Scoreboard", 220, 330);
        c.drawString ("Quit", 280, 410);


    }
}
