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
        c = new Console();
        finalScore = score;
        draw();
    }

    public void run(){
        ArrayList<String> scores = new ArrayList<>();
        // Create
        try{
            BufferedReader in;
            String line;
            in = new BufferedReader (new FileReader ("scoreboard.txt")); // reads from scoreboard.txt
            while (true) // loops through each line
            {
                line = in.readLine ();
                scores.add(line);
                if (line == null) // breaks if it reads an empty line (no more scores)
                    break;
            }
            in.close ();
            PrintWriter pw = new PrintWriter(new FileWriter("scoreboard.txt"));
            pw.println(finalScore);
            for(int i = 0; i < scores.size(); i++){
                pw.println(scores.get(i));
            }
            pw.close();
        } catch (IOException e){}
    }

    public void draw(){
        c.setColor(Colours.cTop);
        c.fillRect(0, 0, 640,500);
        c.setColor(Colours.white);
        c.setFont(new Font("Ariel", Font.BOLD, 64));
        c.drawString("Congratulations!", 150, 100);
        c.setFont(new Font("Ariel", Font.PLAIN, 20));
        c.drawString("Your score: "+finalScore, 200, 200);
    }
}
