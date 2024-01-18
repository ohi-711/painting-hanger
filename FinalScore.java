// Daisy Li
// Scene that shows your final score after the game

import hsa.Console;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;

public class FinalScore {
    Console c;

    int finalScore;
    public FinalScore(Console con, int score){
        c = con;
        finalScore = score;
        draw();
    }

    public void run(){
        String[] scores = new String[10000];
        // Create
        try{
            BufferedReader in;
            String line;
            int count = 0;
            in = new BufferedReader (new FileReader ("scoreboard.txt")); // reads from scoreboard.txt
            while (true) // loops through each line
            {
                line = in.readLine ();
                if (line == null) // breaks if it reads an empty line (no more scores)
                    break;
                scores[count] = line;
            }
            in.close ();
            PrintWriter pw = new PrintWriter(new FileWriter("scoreboard.txt"));
            pw.println(finalScore);
            for(int i = 0; i < scores.length; i++){
                if(scores[i] == null){
                    break;
                }
                pw.println(scores[i]);
            }
            pw.close();
        } catch (IOException e){}
    }

    public void draw(){
        c.setColor(Colours.cTop);
        c.fillRect(0, 0, 640,500);
        c.setColor(Colours.white);
        c.setFont(new Font("Ariel", Font.BOLD, 50));
        c.drawString("Congratulations!", 50, 100);
        c.setFont(new Font("Ariel", Font.PLAIN, 20));
        c.drawString("Your score: "+finalScore, 200, 200);
        c.drawString("Enter any key to continue", 150, 250);
        c.getChar();
    }
}
