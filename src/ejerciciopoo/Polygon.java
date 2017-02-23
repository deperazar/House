
package ejerciciopoo;
import ch.aplu.turtle.Turtle;
public class Polygon {
    
    private Turtle joe;
    public int x;
    public int y;
    public Triangle nem;
     public Polygon(){
        this.joe =  new Turtle(); 
    }
    public void drawpolygon(){
      this.joe.left(10);
      int i= 0;
      do{
          this.joe.forward(40);
          this.joe.right(30);
          i++;
      }
      while(i<12);
      this.joe.right(10);
        
    }
    
}
