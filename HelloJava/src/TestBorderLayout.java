import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Toolkit;


public class TestBorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		f.setSize(500, 400);
		f.setLocation(MyUtils.getPoint(500, 400));
		f.setVisible(true);
		Button b1=new Button("east");
		b1.setSize(200, 250);
		Button b2=new Button("south");
		Button b3=new Button("west");
		Button b4=new Button("north");
		Button b5=new Button("center");
		
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.WEST);
		f.add(b4,BorderLayout.NORTH);
		f.add(b5,BorderLayout.CENTER);		
	}
	/*
	private static int getCenterPointX(int xWidth){
		return Toolkit.getDefaultToolkit().getScreenSize().width/2-xWidth/2;
	}
	private static int getCenterPointY(int xHeight){
		return Toolkit.getDefaultToolkit().getScreenSize().height/2-xHeight/2;
	}*/
}
