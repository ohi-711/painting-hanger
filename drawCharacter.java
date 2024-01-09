import hsa.Console;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.*;

public class drawCharacter
{
    Console c;
    String option;
    char pressed;
    BufferedImage character;

    public drawCharacter (Console con, int locationX, int locationY, String direction)
    {
        c = con;
        draw (c, locationX, locationY, direction);
    }


    public void draw (Console con, int locationX, int locationY, String direction)
    {
        c = con;
        // imports image
        try
        {
            if (direction.equals ("front"))
            {
                character = ImageIO.read (new File ("img/front_character.jpg"));
            }
            else if (direction.equals ("back"))
            {
                character = ImageIO.read (new File ("img/back_character.jpg"));
            }
            else if (direction.equals ("left"))
            {
                character = ImageIO.read (new File ("img/left_character.jpg"));
            }
            else if (direction.equals ("right"))
            {
                character = ImageIO.read (new File ("img/right_character.jpg"));
            }
        }
        catch (IOException e)
        {
        }


        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        c.setColor (Colours.black);
        c.fillRect(300, 400, 40, 40); // goal
        c.drawImage (character, locationX, locationY, null);

    }
}
