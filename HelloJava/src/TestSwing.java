import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sql.rowset.JdbcRowSet;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TestSwing {

	public static void main(String[] args) {		
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		final JTextField jtf=new JTextField();
		jtf.setColumns(30);
		JButton jbtn=new JButton("获取");
		final JDialog jdg=new JDialog(jf, "对话框");
		jdg.setSize(300, 200);
		final JLabel jlbl=new JLabel();
		jbtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				jdg.setModal(true);
				jdg.add(jlbl);
				jlbl.setText(jtf.getText());
				jdg.setVisible(true);
			}
		});
		jf.add(jtf);
		jf.add(jbtn);
		jf.setVisible(true);
	}
}
