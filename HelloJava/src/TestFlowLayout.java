import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestFlowLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("FlowLayout");
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		f.setSize(500, 400);
		f.setLocation(MyUtils.getPoint(500, 400));
		//f.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/2-250, Toolkit.getDefaultToolkit().getScreenSize().height/2-200);
		Button b1=new Button("第1个按钮");
		f.add(b1);
		b1.addActionListener(new ActionListener() {			
			private int n=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.add(new Button("第"+(++n)+"个按钮"));
				f.setVisible(true);
			}
		});
		f.setVisible(true);
	}

}
