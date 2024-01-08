import java.awt.*;
import hsa.Console;

public class LivingRoom
{
    Console c;

    public LivingRoom ()
    {
	c = new Console ("ISP Living Room Background");
    }


    Color wall = new Color (204, 219, 253);
    Color grout = new Color (171, 196, 255);
    Color tile = new Color (182, 204, 254);
    Color lining = new Color (226, 234, 252);
    Color cOpening = new Color (171, 196, 255);
    Color cabinetLeg = new Color (115, 82, 56);
    Color fPot = new Color (255, 196, 214);
    Color lsb = new Color (255, 135, 171);
    Color lst = new Color (255, 166, 193);
    Color lb = new Color (139, 140, 137);
    Color cSide = new Color (142, 148, 242);
    Color cMiddle = new Color (173, 167, 255);
    Color cTop = new Color (129, 135, 220);
    Color gOne = new Color (76, 175, 80);
    Color gTwo = new Color (139, 195, 74);
    Color y = new Color (205, 220, 57);

    public void horizontal (int x, int y, int z)
    {
	try
	{
	    for (int i = 0 ; i < z ; i++)
	    {
		c.fillRect (x + i * 10, y, 10, 10);

		Thread.sleep (2);
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void vertical (int x, int y, int w, boolean p)
    {
	try
	{
	    for (int i = 0 ; i < w ; i++)
	    {
		c.fillRect (x, y - i * 10, 10, 10);

		Thread.sleep (2);
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void vertical (int x, int y, int w)
    {
	try
	{
	    for (int i = 0 ; i < w ; i++)
	    {
		c.fillRect (x, y + i * 10, 10, 10);

		Thread.sleep (2);
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void diagonal (int x, int y, int z)
    {
	try
	{
	    for (int i = 0 ; i < z ; i++)
	    {
		c.fillRect (x - i * 10, y - i * 10, 10, 10);
		Thread.sleep (2);
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void diagonal (int x, int y, int z, boolean p)
    {
	try
	{
	    for (int i = 0 ; i < z ; i++)
	    {
		c.fillRect (x + i * 10, y - i * 10, 10, 10);
		Thread.sleep (2);
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void square (int x, int y)
    {
	try
	{
	    c.fillRect (x, y, 10, 10);
	    Thread.sleep (2);
	}
	catch (Exception e)
	{
	}
    }


    public void rectangle (int x, int y, int z, int w)
    {
	try
	{
	    for (int i = y ; i <= w ; i += 10)
	    {
		for (int j = x ; j <= z ; j += 10)
		{
		    c.fillRect (j, i, 10, 10);

		    Thread.sleep (1);
		}
	    }
	}
	catch (Exception e)
	{
	}
    }


    public void display ()
    {
	c.setColor (wall);
	rectangle (0, 0, 640, 350);
	c.setColor (lining);
	rectangle (0, 360, 640, 370);
	c.setColor (tile);
	rectangle (0, 380, 640, 490);
	c.setColor (grout);
	horizontal (0, 380, 64);
	horizontal (0, 420, 64);
	horizontal (0, 460, 64);
	diagonal (0, 410, 3, true);
	diagonal (0, 480, 2, true);
	vertical (30, 450, 2, true);
	square (40, 430);
	square (60, 410);
	vertical (70, 400, 2, true);
	square (50, 490);
	vertical (60, 480, 2, true);
	square (80, 450);
	vertical (90, 440, 2, true);
	square (110, 410);
	vertical (120, 400, 2, true);
	vertical (110, 490, 2, true);
	square (120, 470);
	diagonal (130, 450, 3, true);
	square (160, 410);
	vertical (170, 400, 2, true);
	square (170, 490);
	vertical (180, 480, 2, true);
	square (190, 450);
	vertical (200, 440, 2, true);
	square (210, 410);
	vertical (220, 400, 2, true);
	vertical (240, 490, 2, true);
	square (250, 470);
	square (250, 450);
	vertical (260, 440, 2, true);
	vertical (270, 410, 3, true);
	vertical (320, 380, 12);
	vertical (400, 490, 2, true);
	square (390, 470);
	square (390, 450);
	vertical (380, 440, 2, true);
	vertical (370, 410, 3, true);
	square (470, 490);
	vertical (460, 480, 2, true);
	square (450, 450);
	vertical (440, 440, 2, true);
	square (430, 410);
	vertical (420, 400, 2, true);
	vertical (530, 490, 2, true);
	square (520, 470);
	diagonal (510, 450, 3);
	square (480, 410);
	vertical (470, 400, 2, true);
	square (590, 490);
	vertical (580, 480, 2, true);
	square (560, 450);
	vertical (550, 440, 2, true);
	square (530, 410);
	vertical (520, 400, 2, true);
	square (630, 470);
	vertical (610, 450, 2, true);
	square (600, 430);
	square (580, 410);
	vertical (570, 400, 2, true);
	diagonal (630, 400, 2);

	c.setColor (cabinetLeg);
	horizontal (40, 300, 9);
	horizontal (40, 380, 9);
	vertical (40, 390, 10, true);
	vertical (120, 390, 10, true);
	c.setColor (cOpening);
	rectangle (50, 310, 110, 370);
	c.setColor (fPot);
	horizontal (50, 260, 7);
	horizontal (60, 270, 5);
	horizontal (60, 280, 5);
	horizontal (70, 290, 3);
	c.setColor (cabinetLeg);
	vertical (80, 250, 10, true);
	square (90, 150);
	vertical (100, 140, 2, true);
	square (110, 120);
	square (30, 160);
	horizontal (40, 170, 2);
	horizontal (60, 180, 2);
	c.setColor (gOne);
	square (120, 110);
	square (100, 120);
	vertical (110, 130, 2);
	square (90, 140);
	square (90, 160);
	diagonal (30, 170, 2);
	square (40, 160);
	square (50, 180);
	c.setColor (gTwo);
	diagonal (120, 120, 2);
	square (90, 130);
	square (80, 150);
	horizontal (20, 150, 2);
	square (40, 180);
	c.setColor (y);
	square (100, 150);
	diagonal (60, 170, 2);

	c.setColor (cabinetLeg);
	horizontal (520, 280, 11);
	horizontal (520, 310, 11);
	horizontal (520, 340, 11);
	horizontal (520, 380, 11);
	vertical (520, 280, 12);
	vertical (620, 280, 12);
	c.setColor (cOpening);
	rectangle (530, 290, 610, 300);
	rectangle (530, 320, 610, 330);
	rectangle (530, 350, 610, 370);
	c.setColor (lb);
	horizontal (560, 270, 3);
	vertical (570, 260, 4, true);
	c.setColor (lsb);
	horizontal (550, 220, 5);
	c.setColor (lst);
	horizontal (550, 210, 5);
	horizontal (560, 200, 3);
	horizontal (560, 190, 3);
	square (570, 180);

	c.setColor (cabinetLeg);
	horizontal (180, 390, 2);
	square (180, 400);
	horizontal (450, 390, 2);
	square (460, 400);
	c.setColor (cSide);
	rectangle (160, 360, 480, 380);
	horizontal (150, 350, 4);
	horizontal (460, 350, 4);
	rectangle (150, 330, 170, 340);
	rectangle (470, 330, 490, 340);
	rectangle (140, 300, 180, 320);
	rectangle (460, 300, 500, 320);
	rectangle (130, 280, 170, 290);
	rectangle (470, 280, 510, 290);
	c.setColor (cMiddle);
	rectangle (180, 330, 460, 340);
	horizontal (190, 350, 27);
	c.setColor (cTop);
	horizontal (180, 240, 14);
	horizontal (330, 240, 14);
	rectangle (170, 250, 470, 270);
	rectangle (180, 280, 460, 290);
	rectangle (190, 300, 450, 320);
    }


    public static void main (String[] args)
    {
	LivingRoom l = new LivingRoom ();
	l.display ();
    }
}
