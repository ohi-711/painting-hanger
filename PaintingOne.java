import java.awt.*;
import hsa.Console;

public class PaintingOne
{
    Console c;

    public PaintingOne (Console con)
    {
	c = con;
    }


    Color mountain = new Color (40, 53, 147);
    Color mountainOutline = new Color (48, 63, 159);
    Color sky = new Color (69, 39, 160);
    Color moon = new Color (230, 238, 156);
    Color frame = new Color (115, 82, 56);

    public void display (int x, int y)
    {
	c.setColor (frame);
	c.fillRect (x, y, 220, 10);
	c.fillRect (x, y + 150, 220, 10);
	c.fillRect (x, y, 10, 150);
	c.fillRect (x + 220, y, 10, 160);
	c.setColor (sky);
	c.fillRect (x + 10, y + 10, 210, 130);
	c.setColor (mountain);
	c.fillRect (10 + x, 140 + y, 140, 10);
	c.fillRect (170 + x, 140 + y, 50, 10);
	c.fillRect (20 + x, 130 + y, 90, 10);
	c.fillRect (120 + x, 130 + y, 10, 10);
	c.fillRect (180 + x, 130 + y, 40, 10);
	c.fillRect (30 + x, 120 + y, 20, 10);
	c.fillRect (60 + x, 120 + y, 40, 10);
	c.fillRect (200 + x, 120 + y, 20, 10);
	c.fillRect (70 + x, 110 + y, 30, 10);
	c.setColor (mountainOutline);
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
	c.setColor (moon);
	c.fillRect (80 + x, 20 + y, 50, 10);
	c.fillRect (110 + x, 30 + y, 30, 10);
	c.fillRect (120 + x, 40 + y, 30, 10);
	c.fillRect (130 + x, 50 + y, 20, 30);
	c.fillRect (120 + x, 80 + y, 30, 10);
	c.fillRect (110 + x, 90 + y, 30, 10);
	c.fillRect (100 + x, 100 + y, 30, 10);
    }
}