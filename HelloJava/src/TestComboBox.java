import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class TestComboBox {

	public static void main(String[] args) {
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());		
		JLabel jlbl=new JLabel("选择城市：");	
		Vector<String> list=new Vector<String>();
		list.add("北京市0");
		list.add("上海市1");
		list.add("广州市2");
		list.add("深圳市3");
		final JComboBox cmb=new JComboBox(list);
		/*String[] items=new String[]{"北京市","上海市","广州市","深圳市"};
		final JComboBox cmb=new JComboBox(items);*/
		/*
		final JComboBox cmb=new JComboBox();
		cmb.addItem("北京市");
		cmb.addItem("上海市");
		cmb.addItem("广州市");
		cmb.addItem("深圳市");
		cmb.addItem("重庆市");*/
		cmb.setSelectedIndex(2);
		JButton jbtn=new JButton("选择");		
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cmb.getSelectedItem());
			}
		});		
		jf.add(jlbl);
		jf.add(cmb);		
		jf.add(jbtn);
		jf.setVisible(true);
	}
}
