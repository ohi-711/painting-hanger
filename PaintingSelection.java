/*
 * Name: April Sun, Daisy Li, Anne You
 * Date: January 13th 2023
 * Teacher: Ms. Krasteva
 * Description: This is the painting selection part of the game. The user can press 1, 2, 3, 4, or 5 and then 'z' to select the paintings
 */

// April
// imports
import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class PaintingSelection
{
    Console c;
    char pressed; // the key the user is pressing
    int paintingPoints; // number of points based on the selection of the painting
    int selection; // number to identify the selection of the painting

    public PaintingSelection (Console con, char menuOption)
    {
        c = con;
        pressed = menuOption;
    }


    public void run ()
    {
        while (true)
        {
            draw ();
            pressed = c.getChar (); // gets user input
            if (pressed == 'z') // keeps running until the user confirms their selection by pressing 'z'
                break;
        }
    }

    private void arrow (int locationX, int locationY) // draws the arrow that shows the user what painting they are selecting
    {
        c.setColor (Colours.red);
        c.fillRect (locationX-20, locationY-20, 10, 10);
        c.fillRect (locationX-10, locationY-10, 10, 10);
        c.fillRect (locationX, locationY, 10, 10);
        c.fillRect (locationX+10, locationY+10, 10, 10);
        c.fillRect (locationX+20, locationY, 10, 10);
        c.fillRect (locationX, locationY+20, 10, 10);
        c.fillRect (locationX+20, locationY+20, 10, 10);
        c.fillRect (locationX+20, locationY+10, 10, 10);
        c.fillRect (locationX+10, locationY+20, 10, 10);
    }

    public void draw () // draws the painting options
    {
        // clears background
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        
        // draws paintings
        PaintingOne l = new PaintingOne (c);
            l.display (0, 90);

        PaintingTwo l2 = new PaintingTwo (c);
            l2.display (240, 90);

        PaintingThree l3 = new PaintingThree (c);
            l3.display (380, 90);

        PaintingFour l4 = new PaintingFour (c);
            l4.display (0, 260);

        PaintingFive l5 = new PaintingFive (c);
            l5.display (300, 260);
        
        // draws an arrow next to the selected painting
        if (pressed == '1')
        {
            arrow (0, 90);
            selection = 1;
        }
        if (pressed == '2')
        {
            arrow (240, 90);
            selection = 2;
        }
        if (pressed == '3')
        {
            arrow (380, 90);
            selection = 3;
        }
        if (pressed == '4')
        {
            arrow (0, 260);
            selection = 4;
        }
        if (pressed == '5')
        {
            arrow (300, 260);
            selection = 5;
        }

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 42));
        c.drawString ("Select a painting!", 148, 65); // title
        c.setFont (new Font ("Ariel", Font.PLAIN, 20));
        c.drawString ("Press z to enter and 1,2,3,4,5 for choices", 140, 470); // writes instructions on how to use menu

    }
}
