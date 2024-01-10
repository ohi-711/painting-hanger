import java.awt.*;
import hsa.Console;

public class PaintingThree
{
    Console c;

    public PaintingThree (Console con)
    {
	c = con;
    }


    Color background = new Color (76, 175, 80);
    Color blue = new Color (0, 145, 234);
    Color purple = new Color (103, 58, 183);
    Color orange = new Color (255, 167, 38);
    Color yellow = new Color (255, 235, 59);
    Color pink = new Color (239, 154, 154);
    Color frame = new Color (115, 82, 56);

    public void display (int x, int y)
    {
	c.setColor (frame);
	c.fillRect (0 + x, 0 + y, 250, 10);
	c.fillRect (0 + x, 170 + y, 250, 10);
	c.fillRect (0 + x, 0 + y, 10, 170);
	c.fillRect (240 + x, 0 + y, 10, 170);
	c.setColor (background);
	c.fillRect (10 + x, 10 + y, 230, 160);
	c.setColor (blue);
	c.fillRect (10 + x, 50 + y, 10, 10);
	c.fillRect (10 + x, 40 + y, 30, 10);
	c.fillRect (30 + x, 30 + y, 20, 10);
	c.fillRect (50 + x, 20 + y, 40, 10);
	c.fillRect (80 + x, 10 + y, 30, 10);
	c.fillRect (10 + x, 80 + y, 20, 10);
	c.fillRect (20 + x, 70 + y, 30, 10);
	c.fillRect (50 + x, 60 + y, 20, 10);
	c.fillRect (60 + x, 50 + y, 20, 10);
	c.fillRect (80 + x, 40 + y, 20, 10);
	c.fillRect (90 + x, 30 + y, 20, 10);
	c.fillRect (110 + x, 20 + y, 30, 10);
	c.fillRect (130 + x, 10 + y, 20, 10);
	c.fillRect (10 + x, 110 + y, 40, 10);
	c.fillRect (50 + x, 100 + y, 30, 10);
	c.fillRect (80 + x, 90 + y, 10, 10);
	c.fillRect (90 + x, 80 + y, 10, 10);
	c.fillRect (110 + x, 70 + y, 30, 10);
	c.fillRect (140 + x, 60 + y, 10, 10);
	c.fillRect (150 + x, 50 + y, 30, 10);
	c.fillRect (170 + x, 40 + y, 20, 10);
	c.fillRect (180 + x, 30 + y, 20, 10);
	c.fillRect (190 + x, 20 + y, 10, 10);
	c.setColor (purple);
	c.fillRect (50 + x, 30 + y, 20, 10);
	c.fillRect (40 + x, 40 + y, 40, 10);
	c.fillRect (40 + x, 50 + y, 20, 10);
	c.setColor (orange);
	c.fillRect (30 + x, 140 + y, 10, 10);
	c.fillRect (40 + x, 130 + y, 10, 10);
	c.fillRect (120 + x, 130 + y, 30, 10);
	c.fillRect (50 + x, 120 + y, 70, 10);
	c.fillRect (150 + x, 120 + y, 40, 10);
	c.fillRect (100 + x, 110 + y, 40, 10);
	c.fillRect (180 + x, 110 + y, 20, 10);
	c.fillRect (90 + x, 90 + y, 10, 20);
	c.fillRect (100 + x, 70 + y, 10, 20);
	c.fillRect (110 + x, 50 + y, 10, 20);
	c.fillRect (120 + x, 50 + y, 30, 10);
	c.fillRect (150 + x, 60 + y, 10, 20);
	c.fillRect (160 + x, 70 + y, 10, 30);
	c.fillRect (140 + x, 100 + y, 20, 10);
	c.fillRect (190 + x, 100 + y, 10, 10);
	c.fillRect (200 + x, 90 + y, 10, 20);
	c.fillRect (210 + x, 40 + y, 10, 50);
	c.fillRect (200 + x, 10 + y, 10, 40);
	c.fillRect (210 + x, 10 + y, 10, 10);
	c.setColor (pink);
	c.fillRect (50 + x, 150 + y, 10, 10);
	c.fillRect (60 + x, 140 + y, 10, 20);
	c.fillRect (80 + x, 130 + y, 10, 10);
	c.fillRect (90 + x, 100 + y, 10, 10);
	c.fillRect (120 + x, 120 + y, 20, 10);
	c.fillRect (110 + x, 130 + y, 10, 10);
	c.fillRect (90 + x, 140 + y, 30, 10);
	c.fillRect (90 + x, 150 + y, 130, 10);
	c.setColor (yellow);
	c.fillRect (230 + x, 30 + y, 10, 120);
	c.fillRect (220 + x, 40 + y, 10, 110);
	c.fillRect (210 + x, 90 + y, 10, 50);
	c.fillRect (200 + x, 110 + y, 10, 20);
	c.fillRect (200 + x, 50 + y, 10, 40);
	c.fillRect (190 + x, 60 + y, 10, 40);
	c.fillRect (180 + x, 70 + y, 10, 40);
	c.fillRect (170 + x, 80 + y, 10, 30);
	c.fillRect (150 + x, 90 + y, 10, 10);
    }
}
