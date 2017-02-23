package ejerciciopoo;

import ch.aplu.turtle.Turtle;

public class POO {
   public  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(int a, int b){
     joe.setPos(a, b);
     joe.forward(150);
     joe.right(90);
     joe.forward(250);
     joe.right(90);
     joe.forward(150);
     joe.right(90);
     joe.forward(250);
     joe.right(90);
        
             
   } 
   
    public static void main(String[] args) {
       POO e = new POO();
       
       Triangle t= new Triangle();
       Rectangle r= new Rectangle();
       Polygon p= new Polygon();
       t.drawtriangle();
       p.drawpolygon();
       
       
    }
    
}
