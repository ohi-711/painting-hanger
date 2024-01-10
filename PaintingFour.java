import java.awt.*;
import hsa.Console;

public class PaintingFour
{
    public PaintingFour (Console con)
    {
	c = con;
    }


    Color dogMain = new Color (171, 196, 255);
    Color dogSub = new Color (63, 81, 181);
    Color background = new Color (204, 219, 253);
    Color eyes = new Color (0, 0, 0);
    Color tongue = new Color (233, 30, 99);
    Color frame = new Color (115, 82, 56);

    public void display (int x, int y)
    {
	c.setColor (frame);
	c.fillRect (0 + x, 0 + y, 290, 10);
	c.fillRect (0 + x, 160 + y, 290, 10);
	c.fillRect (0 + x, 0 + y, 10, 160);
	c.fillRect (280 + x, 0 + y, 10, 160);
	c.setColor (background);
	c.fillRect (10 + x, 10 + y, 270, 150);
	c.setColor (dogMain);
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
	c.setColor (dogSub);
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
	c.setColor (eyes);
	c.fillRect (150 + x, 30 + y, 10, 10);
	c.fillRect (170 + x, 30 + y, 10, 10);
	c.setColor (tongue);
	c.fillRect (160 + x, 70 + y, 20, 10);
	c.fillRect (170 + x, 80 + y, 10, 10);
    }
}
