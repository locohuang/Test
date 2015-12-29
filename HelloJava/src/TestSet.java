import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set set=new HashSet();
		set.add("优秀");
		set.add("良好");
		set.add("良好");
		set.add("中等");
		set.add("及格");
		set.add("不及格");
		set.add("不及格");
		set.add("缺考");
		//System.out.println(set);
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}*/
		HashSet hSet=new HashSet();
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();		
		st2.setAge(21);
		st2.setName("Zhang");
		st3.setAge(18);
		st3.setName("Li");
		st1.setAge(19);
		st1.setName("Wang");
		hSet.add(st1);
		hSet.add(st2);
		hSet.add(st3);
		System.out.println(hSet);
	}
}
class Student{
	private Integer age;
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
	public int hashCode(){
		return age.hashCode();
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(!(obj instanceof Student)){
			return false;
		}
		Student stu=(Student)obj;
		return this.age.equals(stu.age);
	}	
	
}
