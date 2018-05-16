import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
	

	public static void main(String[] args) {
		Main main = new Main();
		main.init();
	}
	public void init(){
		JFrame frame = new JFrame("Bezier");
		BezierPanel bP = new BezierPanel();
		frame.add(bP);
		bP.setSize(500, 500);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
