import java.awt.*;
import hsa.Console;

/**
* This program draws Alice, a character in Anne, Daisy and April's ISP for ICS3UP
* @author Anne You
* @teacher Ms. Krasteva
* @assignment ISP
* January 12th, 2024
*/

public class Alice
{
    Console c;

    public Alice (Console con)
    {
        c = con;
    }


    //In display(), the character, Alice, is drawn
    public void display (int x, int y)
    {
        //Face
        c.setColor (Colours.skin);
        c.fillRect (10 + x, 20 + y, 70, 50);
        
        //Shirt
        c.setColor (Colours.shirt);
        c.fillRect (20 + x, 70 + y, 60, 80);
        
        //Pants
        c.setColor (Colours.pants);
        c.fillRect (10 + x, 150 + y, 30, 100);
        c.fillRect (50 + x, 150 + y, 30, 100);
        c.fillRect (40 + x, 150 + y, 10, 30);
        
        //Hair + Eyes
        c.setColor (Colours.brown);
        c.fillRect (20 + x, 30 + y, 10, 20);
        c.fillRect (60 + x, 30 + y, 10, 20);
        c.fillRect (20 + x, 0 + y, 50, 10);
        c.fillRect (10 + x, 10 + y, 70, 10);
        c.fillRect (0 + x, 20 + y, 20, 10);
        c.fillRect (0 + x, 30 + y, 10, 110);
        c.fillRect (10 + x, 70 + y, 20, 10);
        c.fillRect (10 + x, 80 + y, 10, 90);
        c.fillRect (20 + x, 90 + y, 10, 60);
        c.fillRect (80 + x, 20 + y, 10, 130);
        c.fillRect (60 + x, 70 + y, 20, 10);
        c.fillRect (70 + x, 110 + y, 10, 50);
    }
}
