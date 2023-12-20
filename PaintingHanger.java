import hsa.Console;
import java.lang.*;
import java.awt.*;

public class PaintingHanger {
    Console c;
    String menuOption = "play";
    

    public PaintingHanger(){
	c = new Console("Painting Hanger");
    }

    public void menu(){
	MainMenu m = new MainMenu(c, menuOption);
	m.run();
	
    }

    public static void main(String[] args) {
	PaintingHanger p = new PaintingHanger();
	p.menu();

    }
}
