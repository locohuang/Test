import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.print.attribute.standard.JobPriority;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jfLogin=new JFrame("用户登录");
		jfLogin.setSize(300, 150);
		JPanel jPanel=new JPanel();	
		jPanel.setLayout(new FlowLayout());
		
		JPanel jp1=new JPanel(new FlowLayout());
		JLabel jlUName=new JLabel("用户名：");
		JTextField jtfUName=new JTextField(20);		
		jp1.add(jlUName);
		jp1.add(jtfUName);
		JPanel jp2=new JPanel(new FlowLayout());
		JLabel jlPwd=new JLabel("密    码：");
		JTextField jtfPwd=new JTextField(20);		
		jp2.add(jlPwd);
		jp2.add(jtfPwd);
		jPanel.add(jp1);
		jPanel.add(jp2);
		jfLogin.add(jPanel);
		
		jfLogin.setVisible(true);
		
	}

}
