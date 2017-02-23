
package ejerciciopoo;
import ch.aplu.turtle.Turtle;

public class Triangle {
    public Turtle joe;
    public int x;
    public int y;
    public Triangle(){
        this.joe =  new Turtle(); 
    }
    public void drawtriangle(){
        this.joe.setPos(x, y);
        this.joe.right(30);
        for (int i=0;i<3;i++){
            this.joe.forward(100);
            this.joe.right(120);
        }
        this.joe.left(30);
    }
}
