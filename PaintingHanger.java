import hsa.Console;
import java.lang.*;
import java.awt.*;
import sun.audio.*;
import java.io.*;

public class PaintingHanger
{
    Console c;
    String menuOption = "start";
    int locationX;
    int locationY;

    public PaintingHanger ()
    {
        c = new Console ("Painting Hanger");
    }
    
    public void basement ()
    {
        Basement b = new Basement (c, locationX, locationY);
        b.run ();
    }

    public void livingRoom ()
    {
        LivingRoom l = new LivingRoom (c);
        l.display ();
    }

    public void splashScreen ()
    {
        SplashScreen s = new SplashScreen (c);
        s.run ();
    }

    public void menu ()
    {
        MainMenu m = new MainMenu (c, menuOption);
        m.run ();
        menuOption = m.option;
    }

    public void gameIntro ()
    {
        GameIntro a = new GameIntro (c);
        a.run ();
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


    public static void main (String[] args)
    {
        PaintingHanger p = new PaintingHanger ();
        p.splashScreen ();
        try // crediting Colin for his code that plays music
        {
            AudioStream as = new AudioStream (new FileInputStream ("audio/music.wav"));
            AudioPlayer.player.start (as);
        }
        catch (Exception e)
        {
        }
        while (true)
        {
            p.menu ();
            if (p.menuOption.equals ("start"))
            {
                p.gameIntro ();
                p.basement ();
                p.livingRoom ();
            }
            if (p.menuOption.equals ("instructions"))
            {
                p.instructions ();
            }
            if (p.menuOption.equals ("scoreboard"))
            {
                p.scoreboard ();
            }
            if (p.menuOption.equals ("quit"))
            {
                p.goodbye ();
                break;
            }
        }

    }
}
