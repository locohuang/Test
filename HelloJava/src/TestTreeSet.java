import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TestTreeSet {

	public static void main(String[] args) {
		/*Set set=new TreeSet();
		set.add("yx");
		set.add("lh");
		set.add("lh");
		set.add("zd");
		set.add("jg");
		set.add("bjg");
		set.add("bjg");
		set.add("qk");
		System.out.println(set);*/
		
		TreeSet set = new TreeSet();
		Stu s1 = new Stu();
		s1.setAge(18);
		s1.setName("Li");
		Stu s2 = new Stu();
		s2.setAge(18);
		s2.setName("Wang");
		Stu s3 = new Stu();
		s3.setAge(19);
		s3.setName("Zhang");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
class Stu implements Comparable{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return "name:"+name+"  age:"+age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Stu s=(Stu)o;
		if(this.age>s.age){
			return 1;
		}
		if(this.age==s.age){
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}