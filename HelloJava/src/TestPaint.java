import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;


public class TestPaint {
	public static void main(String[] args) {
	
		JFrame jf=new MyFrame2();		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());	
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
}
class MyFrame2 extends JFrame{

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.red);
		g.drawRect(100, 100, 50, 50);
		g.drawString("hello", 30, 100);
		
	}
	
}
