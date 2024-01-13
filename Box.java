import hsa.Console;
public class Box {
    Console c;
    int positionX;
    int positionY;
    int width;
    int height;
    public Box(Console con, int x, int y, int w, int h){
        c = con;
        positionX = x;
        positionY = y;
        width = w;
        height = h;
        draw();
    }

    public void draw(){
        c.fillRect(positionX, positionY, width, height);
    }

}
