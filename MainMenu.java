/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This is the main menu of the game. This screen appears after the splash screen and the user can choose between playing the game, reading the instructions, checking the leaderboard, or exiting the game.
 */

// April
// imports
import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class MainMenu
{
    Console c;
    String option; // option the user selected
    char pressed; // current key pressed by the user

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
            // the player uses 1, 2, 3, 4 to select their option
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
            if (pressed == 'z') // the user presses z to confirm their menu selection
            {
                break;
            }
        }
    }

    public void draw ()
    {
        // draws the boxes for the options
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.orange);
        if (option.equals ("start"))
        {
            c.setColor (Colours.darkOrange); // the current option the user is selecting is darkened to indicate their selection
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
        c.drawString ("Painting Hanger", 140, 80); // writes the title at the top of the menu

        c.setColor (Colours.white);
        c.setFont (new Font ("Ariel", Font.BOLD, 35));
        c.drawString ("Play", 280, 170); // text inside of the menu box options
        c.drawString ("Instructions", 220, 250);
        c.drawString ("Scoreboard", 220, 330);
        c.drawString ("Quit", 280, 410);


    }
}
