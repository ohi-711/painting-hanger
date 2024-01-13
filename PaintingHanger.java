/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This program runs all the methods in the correct order
 */

// April
// imports
import hsa.Console;
import java.lang.*;
import java.awt.*;
import sun.audio.*;
import java.io.*;

public class PaintingHanger
{
    Console c;
    String menuOption = "start"; // the menu option selected (the default selected option is 'start')
    char paintingOption = '1'; // the painting selected (the default selected painting is 1)
    int paintingPoints = 0; // number of points the player gets
    int locationX; // locationX of character
    int locationY; // locationY of character
    AudioStream as; // music

    String[] dialogueBasement = { // dialogue for the basement instructions
        "Thanks for agreeing to help...",
        "me hang up paintings!",
        "However, the box of paintings is...",
        "in the basement!",
        "Could you get it for me?",
        "Thanks so much!"
        };

    String[] dialogueHanging = { // dialogue for the hanging painting instructions
        "Thanks for getting paintings!",
        "Could you help me hang them up?",
        "Pick which one looks the best...",
        "...with my living room!",
        "And then hang it up!",
        "Thank you so much!"
        };

    public PaintingHanger ()
    {
        c = new Console ("Painting Hanger"); // creates a new console
    }


    public void basement ()
    {
        Basement b = new Basement (c, 0, 0);
        b.run ();
    }


    public void splashScreen ()
    {
        SplashScreen s = new SplashScreen (c);
        s.run ();
    }


    public void paintingSelection ()
    {
        PaintingSelection ps = new PaintingSelection (c, paintingOption);
        ps.run ();
        paintingOption = ps.pressed; // updates the paintingOption variable
        paintingPoints = ps.paintingPoints; // updates the paintingPoints variable
    }


    public void menu ()
    {
        MainMenu m = new MainMenu (c, menuOption);
        m.run ();
        menuOption = m.option; // updates the menuOption variable
    }


    public void dialogue (String[] dialogue)
    {
        Dialogue d = new Dialogue (c, dialogue);
        d.run ();
    }


    public void instructions ()
    {
        Instructions i = new Instructions (c);
        i.run ();
    }


    public void scoreboard ()
    {
        Scoreboard s = new Scoreboard (c);
        s.run ();
    }


    public void goodbye ()
    {
        Goodbye g = new Goodbye (c);
        g.run ();
    }


    // Daisy
    private void playMusic (String music) // plays music
    {
        try
        {
            as = new AudioStream (new FileInputStream ("audio/" + music + ".wav"));
        }
        catch (Exception e)
        {

        }
        AudioPlayer.player.start (as);
    }


    private void stopMusic ()
    {
        AudioPlayer.player.stop (as);
    }

    // April and Daisy
    public static void main (String[] args)
    {
        PaintingHanger p = new PaintingHanger ();
        p.splashScreen ();
        p.playMusic ("music");
        while (true)
        {
            p.menu ();
            if (p.menuOption.equals ("start")) // if the user chooses to play the game
            {
                p.stopMusic ();
                p.playMusic ("instructions"); // plays different music for each area of the game (Daisy)
                p.dialogue (p.dialogueBasement); // shows the dialogue for the basement
                p.stopMusic ();
                p.playMusic ("maze");
                p.basement (); // basement scene
                p.stopMusic ();
                p.playMusic ("instructions");
                p.dialogue (p.dialogueHanging); // shows the dialogue for the hanging painting part
                p.stopMusic ();
                p.paintingSelection (); // painting selection scene
                p.playMusic ("music");
            }
            if (p.menuOption.equals ("instructions")) // if the user chooses to view instructions
            {
                p.instructions ();
            }
            if (p.menuOption.equals ("scoreboard")) // if the user chooses to view the scoreboard
            {
                p.scoreboard ();
            }
            if (p.menuOption.equals ("quit")) // if the user chooses to exit the game
            {
                p.goodbye ();
                break; // breaks out of while loop
            }
        }

    }
}
