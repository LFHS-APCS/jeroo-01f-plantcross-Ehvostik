/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
  intro();
  downTurn();
  leftTurn();
  downTurnLeft();
  leftTurn();
  last();
  
    }
    // Put any helpermethods here
  

public void plop(){
  hop();
  plant();
}
public void intro(){
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
  turn(RIGHT);
  hop();
  hop();
  plop();
}
public void downTurn(){
  plop();
  plop();
  plop();
  turn(RIGHT);
  plop();
  plop();
  plop();
}
public void leftTurn(){
  turn(LEFT);
  plop();
  plop();
  turn(LEFT);
  plop();
  plop();
  plop();
}
public void downTurnLeft(){
  turn(RIGHT);
  plop();
  plop();
  plop();
  turn(LEFT);
  plop();
  plop();
  turn(LEFT);
  plop();
  plop();
  plop();
  turn(RIGHT);
  plop();
  plop();
  plop();
}
public void last(){
  turn(RIGHT);
  plop();
  plop();
  plop();
  turn(LEFT);
  plop();
  hop();
  hop();
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
