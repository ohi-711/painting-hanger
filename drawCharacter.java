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

    public drawCharacter (Console con, int locationX, int locationY)
    {
	c = con;
	draw (locationX, locationY);
    }


    public void draw (int locationX, int locationY)
    {
	try
	{ // imports image
	   BufferedImage menuBackground = ImageIO.read (new File ("character.png"));
	   c.drawImage (menuBackground, locationX, locationY, null);
	}
	catch (IOException e)
	{
	}
    }
}
