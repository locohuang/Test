import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestJComponent {

	public static void main(String[] args) {
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());		
		JLabel jlbl=new JLabel("选择个人兴趣：");		
		final JCheckBox jcbk1=new JCheckBox("运动");
		final JCheckBox jcbk2=new JCheckBox("旅游");
		final JCheckBox jcbk3=new JCheckBox("看书");
		final JCheckBox jcbk4=new JCheckBox("购物");
		final StringBuilder sb=new StringBuilder();	
		JButton jbtn=new JButton("选择");		
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jcbk1.isSelected()){					
					sb.append(jcbk1.getText()+"  ");
				}
				if(jcbk2.isSelected()){
					sb.append(jcbk2.getText()+"  ");
				}
				if(jcbk3.isSelected()){
					sb.append(jcbk3.getText()+"  ");
				}
				if(jcbk4.isSelected()){
					sb.append(jcbk4.getText()+"  ");
				}
				System.out.println(sb);
				sb.delete(0, sb.length());
			}
		});			
		jf.add(jlbl);
		jf.add(jcbk1);
		jf.add(jcbk2);
		jf.add(jcbk3);
		jf.add(jcbk4);
		jf.add(jbtn);
		jf.setVisible(true);
	}

}
