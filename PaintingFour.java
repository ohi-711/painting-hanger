import java.awt.*;
import hsa.Console;

/**
* This program draws the fourth painting of Anne, Daisy and April's ISP for ICS3UP 
* @author Anne You
* @teacher Ms. Krasteva
* @assignment ISP
* January 12th, 2024
* Credit: "BLUE'S CLUES" (4000 - Standard Character mark Typeset), trademarked to VIACOM INTERNATIONAL INC.
*/

public class PaintingFour
{
    Console c;
        
    public PaintingFour (Console con)
    {
        c = con;
    }


    //In display(), Painting number four, an image of Blue from Blue's Clues, is drawn 
    public void display (int x, int y)
    {
        //Frame
        c.setColor (Colours.frame);
        c.fillRect (0 + x, 0 + y, 290, 10);
        c.fillRect (0 + x, 160 + y, 290, 10);
        c.fillRect (0 + x, 0 + y, 10, 160);
        c.fillRect (280 + x, 0 + y, 10, 160);
        //Blue Background
        c.setColor (Colours.fourbackground);
        c.fillRect (10 + x, 10 + y, 270, 150);
        //Blue (dog)
        //Main blue dog body colour
        c.setColor (Colours.dogMain);
        c.fillRect (70 + x, 60 + y, 10, 30);
        c.fillRect (80 + x, 70 + y, 10, 30);
        c.fillRect (90 + x, 90 + y, 70, 40);
        c.fillRect (80 + x, 120 + y, 10, 10);
        c.fillRect (70 + x, 130 + y, 30, 20);
        c.fillRect (110 + x, 130 + y, 10, 10);
        c.fillRect (120 + x, 150 + y, 40, 10);
        c.fillRect (130 + x, 140 + y, 10, 10);
        c.fillRect (170 + x, 110 + y, 20, 30);
        c.fillRect (160 + x, 120 + y, 10, 20);
        c.fillRect (140 + x, 80 + y, 40, 10);
        c.fillRect (130 + x, 60 + y, 60, 20);
        c.fillRect (140 + x, 40 + y, 50, 20);
        c.fillRect (140 + x, 20 + y, 30, 20);
        c.fillRect (130 + x, 20 + y, 10, 10);
        c.fillRect (100 + x, 20 + y, 30, 20);
        c.fillRect (120 + x, 40 + y, 10, 10);
        c.fillRect (90 + x, 40 + y, 10, 10);
        c.fillRect (100 + x, 50 + y, 10, 10);
        c.fillRect (190 + x, 10 + y, 10, 20);
        c.fillRect (200 + x, 20 + y, 20, 20);
        c.fillRect (220 + x, 30 + y, 10, 10);
        c.fillRect (230 + x, 40 + y, 10, 20);
        //Contrasting blue dog body colour
        c.setColor (Colours.dogSub);
        c.fillRect (110 + x, 90 + y, 20, 20);
        c.fillRect (100 + x, 90 + y, 10, 10);
        c.fillRect (120 + x, 130 + y, 20, 10);
        c.fillRect (140 + x, 120 + y, 10, 30);
        c.fillRect (180 + x, 110 + y, 10, 10);
        c.fillRect (170 + x, 120 + y, 10, 10);
        c.fillRect (180 + x, 130 + y, 10, 10);
        c.fillRect (160 + x, 50 + y, 20, 10);
        c.fillRect (180 + x, 60 + y, 20, 10);
        c.fillRect (190 + x, 70 + y, 10, 10);
        c.fillRect (100 + x, 40 + y, 20, 10);
        c.fillRect (110 + x, 50 + y, 10, 10);
        c.fillRect (120 + x, 10 + y, 20, 10);
        c.fillRect (170 + x, 10 + y, 20, 10);
        c.fillRect (170 + x, 20 + y, 10, 10);
        c.fillRect (210 + x, 40 + y, 20, 20);
        c.fillRect (200 + x, 40 + y, 10, 10);
        //Eyes
        c.setColor (Colours.eyes);
        c.fillRect (150 + x, 30 + y, 10, 10);
        c.fillRect (170 + x, 30 + y, 10, 10);
        //Tongue
        c.setColor (Colours.tongue);
        c.fillRect (160 + x, 70 + y, 20, 10);
        c.fillRect (170 + x, 80 + y, 10, 10);
    }
}
