import java.awt.Point;
import java.awt.Toolkit;


public class MyUtils {
	public static Point getPoint(int width,int height){
		return new Point(Toolkit.getDefaultToolkit().getScreenSize().width/2-width/2, Toolkit.getDefaultToolkit().getScreenSize().height/2-height/2);
	}
}
