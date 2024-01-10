import java.awt.*;
import hsa.Console;

public class PaintingFive
{
    Console c;

    public PaintingFive ()
    {
	c = new Console ();
    }


    Color grayDark = new Color (55, 71, 79);
    Color grayLight = new Color (69, 90, 100);
    Color orange = new Color (255, 110, 64);
    Color orangeLight = new Color (255, 171, 0);
    Color yellow = new Color (255, 202, 40);
    Color frame = new Color (115, 82, 56);

    public void display (int x, int y)
    {
	c.setColor (frame);
	c.fillRect (0 + x, 0 + y, 330, 10);
	c.fillRect (0 + x, 250 + y, 330, 10);
	c.fillRect (0 + x, 0 + y, 10, 250);
	c.fillRect (320 + x, 0 + y, 10, 250);
	c.setColor (yellow);
	c.fillRect (10 + x, 10 + y, 310, 70);
	c.setColor (orangeLight);
	c.fillRect (90 + x, 50 + y, 40, 10);
	c.fillRect (30 + x, 60 + y, 110, 10);
	c.fillRect (10 + x, 70 + y, 140, 10);
	c.fillRect (310 + x, 70 + y, 10, 10);
	c.fillRect (10 + x, 80 + y, 310, 50);
	c.setColor (orange);
	c.fillRect (120 + x, 100 + y, 40, 10);
	c.fillRect (70 + x, 110 + y, 150, 10);
	c.fillRect (20 + x, 120 + y, 220, 10);
	c.fillRect (10 + x, 130 + y, 310, 70);
	c.setColor (grayLight);
	c.fillRect (90 + x, 150 + y, 30, 100);
	c.fillRect (120 + x, 180 + y, 10, 30);
	c.fillRect (230 + x, 140 + y, 10, 60);
	c.fillRect (240 + x, 110 + y, 10, 90);
	c.fillRect (250 + x, 100 + y, 10, 110);
	c.fillRect (260 + x, 90 + y, 10, 130);
	c.fillRect (270 + x, 80 + y, 10, 160);
	c.fillRect (280 + x, 120 + y, 10, 130);
	c.setColor (grayDark);
	c.fillRect (10 + x, 200 + y, 30, 50);
	c.fillRect (30 + x, 190 + y, 10, 10);
	c.fillRect (40 + x, 130 + y, 50, 120);
	c.fillRect (100 + x, 240 + y, 180, 10);
	c.fillRect (100 + x, 230 + y, 170, 10);
	c.fillRect (110 + x, 220 + y, 160, 10);
	c.fillRect (120 + x, 210 + y, 140, 10);
	c.fillRect (130 + x, 200 + y, 120, 10);
	c.fillRect (150 + x, 190 + y, 80, 10);
	c.fillRect (170 + x, 180 + y, 40, 10);
	c.fillRect (170 + x, 110 + y, 10, 70);
	c.fillRect (160 + x, 100 + y, 30, 10);
	c.fillRect (150 + x, 90 + y, 50, 10);
	c.fillRect (150 + x, 80 + y, 50, 10);
	c.fillRect (160 + x, 70 + y, 30, 10);
	c.fillRect (170 + x, 20 + y, 10, 50);
	c.fillRect (290 + x, 130 + y, 10, 120);
	c.fillRect (300 + x, 120 + y, 20, 130);
    }


    public static void main (String[] args)
    {
	PaintingFive l = new PaintingFive ();
	l.display (0, 0);
    }
}
