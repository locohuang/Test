import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.util.Observable;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class TestMenu {

	public static void main(String[] args) {
		JFrame jf=new JFrame("我的JFrame");		
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());	
		jf.setLocationRelativeTo(null);
		JMenuBar menuBar=new JMenuBar();
		JMenu menu =new JMenu("文件");		
		JMenuItem menuItem1=new JMenuItem("新建",new ImageIcon("icons/new.gif"));		
		JMenuItem menuItem2=new JMenuItem("打开");
		JMenuItem menuItem3=new JMenuItem("保存");
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator();
		menu.add(menuItem3);
		menuBar.add(menu);
		jf.setJMenuBar(menuBar);
		final JPopupMenu popupMenu = new JPopupMenu("弹出菜单");
		JMenuItem menuItem4=new JMenuItem("新建",new ImageIcon("icons/new.gif"));		
		JMenuItem menuItem5=new JMenuItem("打开");
		JMenuItem menuItem6=new JMenuItem("保存");
		menuItem1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("执行打开命令");
			}
		});
		popupMenu.add(menuItem4);
		popupMenu.add(menuItem5);
		popupMenu.add(menuItem6);
		jf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==e.BUTTON3){
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}			
		});
		jf.setVisible(true);	
	}

}
