import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
public class TestCollection {
	public static void main(String[] args) {		
		//数组-长度不可变   学生班级：14软件3班  14软件2班...
		//学生：学生学号-学生姓名、出生日期....
		//collection:单列集合   Map：双列集合		
		ArrayList al=new ArrayList();//ArrayList 增加数据删除数据效率低，查询速度快
		Random r=new Random();
		String[] str={"优秀","良好","中等","及格","不及格"};
		for(int i=1;i<=5;i++){
			al.add(str[r.nextInt(5)]);
		}
		al.add(0, "缺考");
		System.out.println(al);
		/*Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		/*for(int k=0;k<al.size();k++){
			System.out.println(al.get(k));
		}*/
		/*for(Object s:al){
			System.out.println(s);
		}
		*/		
		LinkedList ll=new LinkedList();//LinkedList  增加删除元素效率高，查询效率低
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add(0, "e");		
		System.out.println(ll);
		/*for (Object o : ll) {
			System.out.println(o);
		}*/
	}
}
