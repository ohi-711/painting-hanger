import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;

public class PaintingSelection
{
    Console c;
    char pressed;
    int paintingPoints;

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
            pressed = c.getChar ();
            if (pressed == 'z')
                break;
        }
    }

    private void arrow (int locationX, int locationY)
    {
        c.setColor (Colours.red);
        c.fillRect (locationX, locationY, 20, 20);
        // draw arrow here
    }

    public void draw ()
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
            paintingPoints = 400; // gives a value to paintingPoints depending on the choice of painting
        }
        if (pressed == '2')
        {
            arrow (240, 90); 
            paintingPoints = 300;
        }
        if (pressed == '3')
        {
            arrow (380, 90); 
            paintingPoints = 200;
        }
        if (pressed == '4')
        {
            arrow (0, 260); 
            paintingPoints = 500;
        }
        if (pressed == '5')
        {
            arrow (300, 260); 
            paintingPoints = 100;
        }

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 42));
        c.drawString ("Select a painting!", 148, 65);
    }
}
