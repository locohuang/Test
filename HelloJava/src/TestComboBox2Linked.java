import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestComboBox2Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());	
		Vector<String> listProvince=new Vector<String>();
		listProvince.add("北京市");
		listProvince.add("上海市");
		listProvince.add("广东省");		
		listProvince.add("辽宁省");		
		JLabel lblProvince=new JLabel("省份：");			
		final JComboBox cmbProvince=new JComboBox(listProvince);	
		JLabel lblCity=new JLabel("城市：");	
		final JComboBox cmbCity=new JComboBox();	
		cmbCity.addItem("北京市");
		cmbProvince.addItemListener(new ItemListener() {			
			@Override
			public void itemStateChanged(ItemEvent e) {
				switch(e.getItem().toString()){				
				case "北京市":
					cmbCity.removeAllItems();
					cmbCity.addItem("北京市");
					break;
				case "上海市":
					cmbCity.removeAllItems();
					cmbCity.addItem("上海市");
					break;
				case "广东省":
					cmbCity.removeAllItems();					
					cmbCity.addItem("广州市");
					cmbCity.addItem("深圳市");
					cmbCity.addItem("珠海市");		
					cmbCity.addItem("佛山市");					
					break;
				case "辽宁省":
					cmbCity.removeAllItems();					
					cmbCity.addItem("沈阳市");
					cmbCity.addItem("大连市");
					cmbCity.addItem("锦州市");		
					cmbCity.addItem("鞍山市");					
					break;
				default :
					cmbCity.removeAllItems();
					break;
				}
			}
		});				
		JButton jbtn=new JButton("选择");		
		jbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(cmbProvince.getSelectedItem()+"  "+ cmbCity.getSelectedItem());
			}
		});		
		jf.add(lblProvince);
		jf.add(cmbProvince);
		jf.add(lblCity);
		jf.add(cmbCity);
		jf.add(jbtn);
		jf.setVisible(true);
	}

}
