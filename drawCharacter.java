import hsa.Console;

import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

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
                character = ImageIO.read (new File ("img/back_character.png"));
            }
            else if (direction.equals ("back"))
            {
                character = ImageIO.read (new File ("img/front_character.png"));
            }
            else if (direction.equals ("left"))
            {
                character = ImageIO.read (new File ("img/left_character.png"));
            }
            else if (direction.equals ("right"))
            {
                character = ImageIO.read (new File ("img/right_character.png"));
            }
        }
        catch (IOException e)
        {
        }


        c.setColor (Colours.black);
        c.fillRect(300, 400, 40, 40); // goal
        c.drawImage (character, locationX, locationY, null);

    }
}
