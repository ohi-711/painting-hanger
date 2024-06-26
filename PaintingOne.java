import java.awt.*;
import hsa.Console;

/**
* This program draws the first painting of Anne, Daisy and April's ISP for ICS3UP
* @author Anne You
* @teacher Ms. Krasteva
* @assignment ISP
* January 12th, 2024
*/

public class PaintingOne extends Painting // inherits the Painting parent class
{

    public PaintingOne (Console con)
    {
        super(con);
        width = 220;
        height = 150;
    }


    //In display(), Painting number one, a moon and sky image, is drawn
    public void display (int x, int y)
    {
        //Frame
        c.setColor (Colours.frame);
        c.fillRect (x, y, 220, 10);
        c.fillRect (x, y + 150, 220, 10);
        c.fillRect (x, y, 10, 150);
        c.fillRect (x + 220, y, 10, 160);
        
        //Sky(Background Colour)
        c.setColor (Colours.sky);
        c.fillRect (x + 10, y + 10, 210, 130);
        
        //Mountains/Ground
        c.setColor (Colours.mountain);
        c.fillRect (10 + x, 140 + y, 140, 10);
        c.fillRect (170 + x, 140 + y, 50, 10);
        c.fillRect (20 + x, 130 + y, 90, 10);
        c.fillRect (120 + x, 130 + y, 10, 10);
        c.fillRect (180 + x, 130 + y, 40, 10);
        c.fillRect (30 + x, 120 + y, 20, 10);
        c.fillRect (60 + x, 120 + y, 40, 10);
        c.fillRect (200 + x, 120 + y, 20, 10);
        c.fillRect (70 + x, 110 + y, 30, 10);
        c.setColor (Colours.mountainOutline);
        c.fillRect (10 + x, 130 + y, 10, 10);
        c.fillRect (20 + x, 120 + y, 10, 10);
        c.fillRect (30 + x, 110 + y, 10, 10);
        c.fillRect (40 + x, 110 + y, 10, 10);
        c.fillRect (50 + x, 120 + y, 10, 10);
        c.fillRect (60 + x, 110 + y, 10, 10);
        c.fillRect (70 + x, 100 + y, 10, 10);
        c.fillRect (80 + x, 100 + y, 10, 10);
        c.fillRect (90 + x, 100 + y, 10, 10);
        c.fillRect (100 + x, 110 + y, 10, 10);
        c.fillRect (100 + x, 120 + y, 10, 10);
        c.fillRect (110 + x, 130 + y, 10, 10);
        c.fillRect (120 + x, 120 + y, 10, 10);
        c.fillRect (130 + x, 130 + y, 20, 10);
        c.fillRect (150 + x, 140 + y, 20, 10);
        c.fillRect (170 + x, 130 + y, 10, 10);
        c.fillRect (180 + x, 120 + y, 20, 10);
        c.fillRect (200 + x, 110 + y, 20, 10);
        
        //Moon
        c.setColor (Colours.moon);
        c.fillRect (80 + x, 20 + y, 50, 10);
        c.fillRect (110 + x, 30 + y, 30, 10);
        c.fillRect (120 + x, 40 + y, 30, 10);
        c.fillRect (130 + x, 50 + y, 20, 30);
        c.fillRect (120 + x, 80 + y, 30, 10);
        c.fillRect (110 + x, 90 + y, 30, 10);
        c.fillRect (100 + x, 100 + y, 30, 10);
    }
}
