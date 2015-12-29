import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class TestEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame();
		f.setSize(300, 200);
		f.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getKeyChar());
			}
			
		});
		/*Button b=new Button("退出");
		b.setVisible(true);
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});*/
		/*f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton()==e.BUTTON1){
					System.out.println("你点击了左键");
				}
				if(e.getButton()==e.BUTTON2){
					System.out.println("你点击了滚轮");
				}
				if(e.getButton()==e.BUTTON3){
					System.out.println("你点击右键");
				}
			}
			
		});*/		
		f.setVisible(true);
	}

}
