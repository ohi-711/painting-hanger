/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This program draws the character on the screen based off of the fields locationX and locationY. It also changes the appearance of the character based on the direction they are facing.
 */

// April
// imports
import hsa.Console;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

public class drawCharacter
{
    Console c;
    char pressed; // current key the user is pressing down on
    BufferedImage character; // character image

    public drawCharacter (Console con, int locationX, int locationY, String direction)
    {
        c = con;
        draw (c, locationX, locationY, direction);
    }

    // draws the character based on locationX, locationY, and the direction they are facing
    public void draw (Console con, int locationX, int locationY, String direction) 
    {
        c = con;
        try
        {
            if (direction.equals ("front")) // checks the direction the player is facing
            {
                character = ImageIO.read (new File ("img/back_character.png")); // loads the according image for the direction
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
