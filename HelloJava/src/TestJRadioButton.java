import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.spi.SelectorProvider;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class TestJRadioButton {
	static String selected="";
	public static void main(String[] args) {
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());		
		JLabel jlbl=new JLabel("选择性别：");		
		final JRadioButton jrbtn1=new JRadioButton("男");		
		final JRadioButton jrbtn2=new JRadioButton("女");
		final ButtonGroup btnGroup =new ButtonGroup();
		btnGroup.add(jrbtn1);
		btnGroup.add(jrbtn2);		
		JButton jbtn=new JButton("选择");		
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*if(jrbtn1.isSelected()){					
					selected=jrbtn1.getText();
				}
				if(jrbtn2.isSelected()){
					selected=jrbtn2.getText();
				}
				System.out.println(selected);	
				*/				
				Enumeration<AbstractButton> js=btnGroup.getElements();
				while(js.hasMoreElements()){
					JRadioButton o=(JRadioButton)js.nextElement();
					if(o.isSelected()){
						selected=o.getText();
					}					
				}
				System.out.println(selected);
			}
		});		
		
		jf.add(jlbl);
		jf.add(jrbtn1);
		jf.add(jrbtn2);
		
		jf.add(jbtn);
		jf.setVisible(true);
	}

}
