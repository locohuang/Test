import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;



public class TestGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("GridLayout");
		f.setLayout(new GridLayout(3,4));
		f.setSize(500, 400);
		f.setLocation(MyUtils.getPoint(500, 400));
		
		for(int i=1;i<=12;i++){
			f.add(new Button("btn"+i));
		}
		f.setVisible(true);
	}
	
	

}
