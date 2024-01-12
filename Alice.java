import java.awt.*;
import hsa.Console;

public class Alice
{
    Console c;

    public Alice (Console con)
    {
        c = con;
    }

    public void display (int x, int y)
    {
        c.setColor (Colours.skin);
        c.fillRect (10 + x, 20 + y, 70, 50);
        c.setColor (Colours.shirt);
        c.fillRect (20 + x, 70 + y, 60, 80);
        c.setColor (Colours.pants);
        c.fillRect (10 + x, 150 + y, 30, 100);
        c.fillRect (50 + x, 150 + y, 30, 100);
        c.fillRect (40 + x, 150 + y, 10, 30);
        c.setColor (Colours.brown);
        c.fillRect (20 + x, 30 + y, 10, 20);
        c.fillRect (60 + x, 30 + y, 10, 20);
        c.fillRect (20 + x, 0 + y, 50, 10);
        c.fillRect (10 + x, 10 + y, 70, 10);
        c.fillRect (0 + x, 20 + y, 20, 10);
        c.fillRect (0 + x, 30 + y, 10, 110);
        c.fillRect (10 + x, 70 + y, 20, 10);
        c.fillRect (10 + x, 80 + y, 10, 90);
        c.fillRect (20 + x, 90 + y, 10, 60);
        c.fillRect (80 + x, 20 + y, 10, 130);
        c.fillRect (60 + x, 70 + y, 20, 10);
        c.fillRect (70 + x, 110 + y, 10, 50);
    }
}
