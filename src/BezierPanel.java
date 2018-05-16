import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.Timer;

public class BezierPanel extends JPanel implements MouseListener, MouseMotionListener, ActionListener{
	private Color color;
	private final int FRAMERATE = 10;
	private PointDraggable[] bezPoints = new PointDraggable[4];
	
	public BezierPanel(){
		bezPoints[0] = new PointDraggable(new Vector(10, 10));
		bezPoints[1] = new PointDraggable(new Vector(50, 10));
		bezPoints[2] = new PointDraggable(new Vector(10, 50));
		bezPoints[3] = new PointDraggable(new Vector(50, 50));
		
		this.setDoubleBuffered(true);
		color = Color.black;
		addMouseMotionListener(this);
		setLayout(null);
		setVisible(true);
		Timer timer = new Timer(FRAMERATE, new ActionListener(){
			public void actionPerformed(ActionEvent e){
				repaint();
			}
		});
		timer.start();
	}
	public void paintComponent(Graphics g){
		for(PointDraggable point : bezPoints){
			point.draw(g);
		}
		/*
		for(int i = 1; i < bezPoints.length + 1; i++){
			line(g, bezPoints[i - 1].position, bezPoints[i].position);
		}*/
		line(g, bezPoints[0].position, bezPoints[1].position);
	}
	private void line(Graphics g, Vector start, Vector end){
		g.drawLine((int) start.x,(int) start.y,(int) end.x,(int) end.y);
	}
	public void mouseDragged(MouseEvent e){
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}
	public void actionPerformed(ActionEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
}