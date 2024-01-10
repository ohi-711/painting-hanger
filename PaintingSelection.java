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
        // draw arrow here
    }

    public void draw ()
    {
        // clears background
        c.setColor (Colours.white);
        c.fillRect (0, 0, 640, 500);
        
        // draws paintings
        PaintingOne l = new PaintingOne ();
            l.display (0, 0);

        PaintingTwo l2 = new PaintingTwo ();
            l2.display (100, 100);

        PaintingThree l3 = new PaintingThree ();
            l3.display (0, 200);

        PaintingFour l4 = new PaintingFour ();
            l4.display (100, 200);

        PaintingFive l5 = new PaintingFive ();
            l5.display (200, 200);
        
        // draws an arrow next to the selected painting
        if (pressed == '1')
        {
            arrow (0, 100); 
            paintingPoints = 100; // gives a value to paintingPoints depending on the choice of painting
        }
        if (pressed == '2')
        {
            arrow (100, 100); 
            paintingPoints = 200;
        }
        if (pressed == '3')
        {
            arrow (0, 200); 
            paintingPoints = 100;
        }
        if (pressed == '4')
        {
            arrow (100, 200); 
            paintingPoints = 100;
        }
        if (pressed == '5')
        {
            arrow (200, 200); 
            paintingPoints = 100;
        }

        c.setColor (Colours.black);
        c.setFont (new Font ("Ariel", Font.BOLD, 42));
        c.drawString ("Select a painting!", 110, 80);
    }
}
