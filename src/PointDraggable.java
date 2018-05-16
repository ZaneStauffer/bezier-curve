import java.awt.*;
import javax.swing.*;

public class PointDraggable {
	public Vector position;
	private final Vector SIZE = new Vector(20, 20);
	
	public PointDraggable(Vector pos){
		position = pos;
	}
	public Vector getSize(){
		return SIZE;
	}
	
	public void draw(Graphics g){
		g.setColor(Color.black);
		g.fillOval((int) position.x,(int) position.y,(int) SIZE.x,(int) SIZE.y);
	}
}
