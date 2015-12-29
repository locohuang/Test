import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestLayout {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FlowLayout    BorderLayout   GridLayout   GridBagLayout
		final Frame f=new Frame("myFrame");
		f.setSize(500,400);
		f.setLocation(300, 400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		Button btn= new Button("click");
		f.add(btn);		
		btn.addActionListener(new ActionListener() {
			int i=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
					f.add(new Button("btn"+i++));		
					f.setVisible(true);
			}
		});	
	}
}
