import hsa.Console;
import hsa.*;
import java.io.*;
import java.awt.*;
import java.awt.Font;
import java.util.ArrayList;

public class HangingPainting
{
    Console c;
    // what the current painting being hung is
    int currentPainting = 0;
    // current score
    int currentScore = 0;
    int currentX = 0;
    int currentY = 0;
    String currentPhase;

    // the array with current paintings on the wall, each sub array being
    // painting id, x, y
    int[] [] hanging = new int [5] [3];

    int[] scores = {400, 300, 200, 500, 100};

    public HangingPainting (Console con)
    {
        c = con;
        currentPhase = "select";
    }


    public void run ()
    {
        while (true)
        {
            if (currentPhase.equals ("select"))
            {
                PaintingSelection ps = new PaintingSelection (c, '1');
                ps.run ();
                currentPainting = ps.selection;
                currentPhase = "move";
            }
            if (currentPhase.equals ("move"))
            {
                movePainting ();
            }
            if (currentPhase.equals ("look"))
            {
                char pressed = c.getChar ();
                if (pressed == 'z')
                {
                    break;
                }
                else if (pressed == 'r')
                {
                    currentPhase = "select";
                }
            }


        }

    }


    public void movePainting ()
    {
        draw ();
        char pressed = c.getChar ();

        if (pressed == 'w' && currentY > 10)
        {
            currentY -= 10;
        }
        else if (pressed == 'a' && currentX > 0)
        {
            currentX -= 10;
        }
        else if (pressed == 's' && currentY < 500 - 40)
        {
            currentY += 10;
        }
        else if (pressed == 'd' && currentX < 640 - 40)
        {
            currentX += 10;
        }
        else if (pressed == 'z')
        {
            savePainting ();
            currentPhase = "look";
        }



    }


    public void savePainting ()
    {
        for (int i = 0 ; i < hanging.length ; i++)
        {
            if (hanging [i] [0] != 0)
            {
                hanging [i] [0] = currentPainting;
                hanging [i] [1] = currentX;
                hanging [i] [2] = currentY;
                currentScore += scores [currentPainting - 1];
                System.out.println (currentScore);
                System.out.println (currentPainting);
                break;
            }
        }
        currentX = 0;
        currentY = 0;

    }


    public void draw ()
    {
        LivingRoomNone l = new LivingRoomNone (c);
        l.display ();
        c.setFont (new Font ("Ariel", Font.PLAIN, 20));
        c.drawString ("Press z to confirm, r to select another painting, and w,a,s,d to move", 20, 470); // writes instructions on how to use hang the painting
        for (int i = 0 ; i < hanging.length ; i++)
        {
            System.out.println (hanging [i] [0]);
            if (hanging [i] [0] != 0)
            {
                if (hanging [i] [0] == 1)
                {
                    PaintingOne p1 = new PaintingOne (c);
                    p1.display (hanging [i] [1], hanging [i] [2]);
                }
                else if (hanging [i] [0] == 2)
                {
                    PaintingTwo p2 = new PaintingTwo (c);
                    p2.display (hanging [i] [1], hanging [i] [2]);
                }
                else if (hanging [i] [0] == 3)
                {
                    PaintingThree p3 = new PaintingThree (c);
                    p3.display (hanging [i] [1], hanging [i] [2]);
                }
                else if (hanging [i] [0] == 4)
                {
                    PaintingFour p4 = new PaintingFour (c);
                    p4.display (hanging [i] [1], hanging [i] [2]);
                }
                else if (hanging [i] [0] == 5)
                {
                    PaintingFive p5 = new PaintingFive (c);
                    p5.display (hanging [i] [1], hanging [i] [2]);
                }
            }

        }
        if (currentPainting == 1)
        {
            PaintingOne p = new PaintingOne (c);
            p.display (currentX, currentY);
        }
        else if (currentPainting == 2)
        {
            PaintingTwo p = new PaintingTwo (c);
            p.display (currentX, currentY);
        }
        else if (currentPainting == 3)
        {
            PaintingThree p = new PaintingThree (c);
            p.display (currentX, currentY);
        }
        else if (currentPainting == 4)
        {
            PaintingFour p = new PaintingFour (c);
            p.display (currentX, currentY);
        }
        else if (currentPainting == 5)
        {
            PaintingFive p = new PaintingFive (c);
            p.display (currentX, currentY);
        }

    }
}


