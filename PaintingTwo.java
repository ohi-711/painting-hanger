import java.awt.*;
import hsa.Console;

/**
* This program draws the second painting of Anne, Daisy and April's ISP for ICS3UP 
* @author Anne You
* @teacher Ms. Krasteva
* @assignment ISP
* January 12th, 2024
*/

public class PaintingTwo
{
    Console c;

    public PaintingTwo (Console con)
    {
        c = con;
    }

    //In display(), Painting number two, an abstract painting, is drawn
    public void display (int x, int y)
    {
        //Frame
        c.setColor (Colours.frame);
        c.fillRect (0 + x, 0 + y, 130, 10);
        c.fillRect (0 + x, 120 + y, 130, 10);
        c.fillRect (0 + x, 0 + y, 10, 130);
        c.fillRect (120 + x, 0 + y, 10, 130);
        //White Background
        c.setColor (Colours.twobackground);
        c.fillRect (10 + x, 10 + y, 110, 110);
        //Grey
        c.setColor (Colours.twogrey);
        c.fillRect (10 + x, 30 + y, 10, 10);
        c.fillRect (20 + x, 20 + y, 20, 10);
        c.fillRect (40 + x, 30 + y, 10, 10);
        c.fillRect (50 + x, 40 + y, 10, 20);
        c.fillRect (10 + x, 60 + y, 10, 10);
        c.fillRect (20 + x, 70 + y, 20, 10);
        c.fillRect (40 + x, 60 + y, 10, 10);
        c.fillRect (80 + x, 100 + y, 10, 20);
        c.fillRect (100 + x, 80 + y, 20, 10);
        c.fillRect (90 + x, 90 + y, 10, 10);
        //Yellow
        c.setColor (Colours.twoyellow);
        c.fillRect (30 + x, 40 + y, 10, 10);
        c.fillRect (30 + x, 50 + y, 20, 10);
        //Dark Blue
        c.setColor (Colours.twoblueDark);
        c.fillRect (30 + x, 90 + y, 10, 10);
        c.fillRect (40 + x, 80 + y, 20, 10);
        c.fillRect (50 + x, 60 + y, 10, 20);
        c.fillRect (60 + x, 50 + y, 20, 20);
        c.fillRect (70 + x, 30 + y, 10, 20);
        c.fillRect (80 + x, 40 + y, 10, 20);
        c.fillRect (90 + x, 60 + y, 10, 10);
        c.fillRect (100 + x, 40 + y, 10, 10);
        c.fillRect (70 + x, 80 + y, 10, 20);
        c.fillRect (80 + x, 90 + y, 10, 10);
        //Light Blue
        c.setColor (Colours.twoblueLight);
        c.fillRect (30 + x, 80 + y, 10, 10);
        c.fillRect (40 + x, 70 + y, 10, 10);
        c.fillRect (70 + x, 20 + y, 10, 10);
        c.fillRect (80 + x, 30 + y, 10, 10);
        c.fillRect (90 + x, 50 + y, 20, 10);
        c.fillRect (90 + x, 100 + y, 10, 10);
        //Purple
        c.setColor (Colours.twopurple);
        c.fillRect (100 + x, 100 + y, 20, 10);
        c.fillRect (110 + x, 110 + y, 10, 10);
    }
}
