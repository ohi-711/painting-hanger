// Daisy Li
// Scene that shows your final score after the game

import hsa.Console;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;

public class FinalScore {
    Console c;
    public FinalScore(Console con){
        c = new Console();
    }

    public void run(){
        // Create
        try{
            BufferedReader br = new BufferedReader(new FileReader("scoreboard.txt"));



        } catch (IOException e){}
    }

    public void draw(int score){
        c.setColor(Colours.cTop);
        c.fillRect(0, 0, 640,500);
        c.setColor(Colours.white);
        c.setFont(new Font("Ariel", Font.BOLD, 64));
        c.drawString("Congratulations!", 150, 100);
        c.setFont(new Font("Ariel", Font.PLAIN, 20));
        c.drawString("Your score: "+score, 200, 200);
    }
}
