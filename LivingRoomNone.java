import java.awt.*;
import hsa.Console;

/**
* This program displays the living room for Anne, Daisy & April's ISP for ICS3UP
* @author Anne You
* @teacher Ms. Krasteva
* @assignment ISP
* January 12th, 2024
* Credits: https://www.freepik.com/free-vector/cartoon-living-room-interior-background-template-cozy-house-apartment-concept_2238509.htm
*/

public class LivingRoomNone
{
    Console c;

    public LivingRoomNone (Console con)
    {
        c = con;
    }


    //In horizontal(), the x and y coordinates and the distance (left to right) (z * 10)
    public void horizontal (int x, int y, int z)
    {
        c.fillRect (x, y, 10 * z, 10);
    }


    //In vertical(), the x and y coordinates and the distance (down to up) (z * 10)
    public void vertical (int x, int y, int z, boolean p)
    {
        c.fillRect (x, y - (z * 10 - 10), 10, z * 10);
    }


    //In vertical(), the x and y coordinates and the distance (up to down) (z * 10)
    public void vertical (int x, int y, int z)
    {
        c.fillRect (x, y, 10, z * 10);
    }


    //In diagonal(), the x and y coordinates and the number of 10 by 10 squares (z) diagonally upwards and to the left from (x,y)[top left corner of the square]
    public void diagonal (int x, int y, int z)
    {
        for (int i = 0 ; i < z ; i++)
        {
            c.fillRect (x - i * 10, y - i * 10, 10, 10);
        }
    }


    //In diagonal(), the x and y coordinates and the number of 10 by 10 squares (z) diagonally upwards and to the right from (x,y)[top left corner of the square]
    public void diagonal (int x, int y, int z, boolean p)
    {
        for (int i = 0 ; i < z ; i++)
        {
            c.fillRect (x + i * 10, y - i * 10, 10, 10);
        }
    }

    //In display(), the living room is drawn
    public void display ()
    {
        //Wall
        c.setColor (Colours.wall);
        c.fillRect (0, 0, 640, 360);
        
        //Wall Trim
        c.setColor (Colours.lining);
        c.fillRect (0, 360, 640, 20);
        
        //Tiles
        c.setColor (Colours.tile);
        c.fillRect (0, 380, 640, 120);
        c.setColor (Colours.grout);
        horizontal (0, 380, 64);
        horizontal (0, 420, 64);
        horizontal (0, 460, 64);
        diagonal (0, 410, 3, true);
        diagonal (0, 480, 2, true);
        vertical (30, 450, 2, true);
        c.fillRect (40, 430, 10, 10);
        c.fillRect (60, 410, 10, 10);
        vertical (70, 400, 2, true);
        c.fillRect (50, 490, 10, 10);
        vertical (60, 480, 2, true);
        c.fillRect (80, 450, 10, 10);
        vertical (90, 440, 2, true);
        c.fillRect (110, 410, 10, 10);
        vertical (120, 400, 2, true);
        vertical (110, 490, 2, true);
        c.fillRect (120, 470, 10, 10);
        diagonal (130, 450, 3, true);
        c.fillRect (160, 410, 10, 10);
        vertical (170, 400, 2, true);
        c.fillRect (170, 490, 10, 10);
        vertical (180, 480, 2, true);
        c.fillRect (190, 450, 10, 10);
        vertical (200, 440, 2, true);
        c.fillRect (210, 410, 10, 10);
        vertical (220, 400, 2, true);
        vertical (240, 490, 2, true);
        c.fillRect (250, 470, 10, 10);
        c.fillRect (250, 450, 10, 10);
        vertical (260, 440, 2, true);
        vertical (270, 410, 3, true);
        vertical (320, 380, 12);
        vertical (400, 490, 2, true);
        c.fillRect (390, 470, 10, 10);
        c.fillRect (390, 450, 10, 10);
        vertical (380, 440, 2, true);
        vertical (370, 410, 3, true);
        c.fillRect (470, 490, 10, 10);
        vertical (460, 480, 2, true);
        c.fillRect (450, 450, 10, 10);
        vertical (440, 440, 2, true);
        c.fillRect (430, 410, 10, 10);
        vertical (420, 400, 2, true);
        vertical (530, 490, 2, true);
        c.fillRect (520, 470, 10, 10);
        diagonal (510, 450, 3);
        c.fillRect (480, 410, 10, 10);
        vertical (470, 400, 2, true);
        c.fillRect (590, 490, 10, 10);
        vertical (580, 480, 2, true);
        c.fillRect (560, 450, 10, 10);
        vertical (550, 440, 2, true);
        c.fillRect (530, 410, 10, 10);
        vertical (520, 400, 2, true);
        c.fillRect (630, 470, 10, 10);
        vertical (610, 450, 2, true);
        c.fillRect (600, 430, 10, 10);
        c.fillRect (580, 410, 10, 10);
        vertical (570, 400, 2, true);
        diagonal (630, 400, 2);
        
        //left Cabinet 
        c.setColor (Colours.cabinetLeg);
        horizontal (40, 300, 9);
        horizontal (40, 380, 9);
        vertical (40, 390, 10, true);
        vertical (120, 390, 10, true);
        c.setColor (Colours.cOpening);
        c.fillRect (50, 310, 70, 70);
        
        //Plant
        c.setColor (Colours.fPot);
        horizontal (50, 260, 7);
        horizontal (60, 270, 5);
        horizontal (60, 280, 5);
        horizontal (70, 290, 3);
        c.setColor (Colours.cabinetLeg);
        vertical (80, 250, 10, true);
        c.fillRect (90, 150, 10, 10);
        vertical (100, 140, 2, true);
        c.fillRect (110, 120, 10, 10);
        c.fillRect (30, 160, 10, 10);
        horizontal (40, 170, 2);
        horizontal (60, 180, 2);
        c.setColor (Colours.gOne);
        c.fillRect (120, 110, 10, 10);
        c.fillRect (100, 120, 10, 10);
        vertical (110, 130, 2);
        c.fillRect (90, 140, 10, 10);
        c.fillRect (90, 160, 10, 10);
        diagonal (30, 170, 2);
        c.fillRect (40, 160, 10, 10);
        c.fillRect (50, 180, 10, 10);
        c.setColor (Colours.gTwo);
        diagonal (120, 120, 2);
        c.fillRect (90, 130, 10, 10);
        c.fillRect (80, 150, 10, 10);
        horizontal (20, 150, 2);
        c.fillRect (40, 180, 10, 10);
        c.setColor (Colours.y);
        c.fillRect (100, 150, 10, 10);
        diagonal (60, 170, 2);

        //Right Cabinet
        c.setColor (Colours.cabinetLeg);
        horizontal (520, 280, 11);
        horizontal (520, 310, 11);
        horizontal (520, 340, 11);
        horizontal (520, 380, 11);
        vertical (520, 280, 12);
        vertical (620, 280, 12);
        c.setColor (Colours.cOpening);
        c.fillRect (530, 290, 90, 20);
        c.fillRect (530, 320, 90, 20);
        c.fillRect (530, 350, 90, 30);

        //Lamp
        c.setColor (Colours.lb);
        horizontal (560, 270, 3);
        vertical (570, 260, 4, true);
        c.setColor (Colours.lsb);
        horizontal (550, 220, 5);
        c.setColor (Colours.lst);
        horizontal (550, 210, 5);
        horizontal (560, 200, 3);
        horizontal (560, 190, 3);
        c.fillRect (570, 180, 10, 10);

        //Couch
        c.setColor (Colours.cabinetLeg);
        horizontal (180, 390, 2);
        c.fillRect (180, 400, 10, 10);
        horizontal (450, 390, 2);
        c.fillRect (460, 400, 10, 10);
        c.setColor (Colours.cSide);
        c.fillRect (160, 360, 330, 30);
        horizontal (150, 350, 4);
        horizontal (460, 350, 4);
        c.fillRect (150, 330, 30, 20);
        c.fillRect (470, 330, 30, 20);
        c.fillRect (140, 300, 50, 30);
        c.fillRect (460, 300, 50, 30);
        c.fillRect (130, 280, 50, 20);
        c.fillRect (470, 280, 50, 20);
        c.setColor (Colours.cMiddle);
        c.fillRect (180, 330, 290, 20);
        horizontal (190, 350, 27);
        c.setColor (Colours.cTop);
        horizontal (180, 240, 14);
        horizontal (330, 240, 14);
        c.fillRect (170, 250, 310, 30);
        c.fillRect (180, 280, 290, 20);
        c.fillRect (190, 300, 270, 30);
    }
}
