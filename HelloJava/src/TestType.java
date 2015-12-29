import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> al=new ArrayList<String>();
		al.add("value1");
		al.add("value2");
		al.add("value0");
		al.add("value3");
		
		for(String o:al){
			System.out.println(o);
		}*/
		/*Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "v1");
		map.put(2, "v2");*/
		
		BaseDaoI<User> baseDaoI = new BaseDaoImpl<User>();
		User user=new User();
		user.setId("1001");
		user.setName("liming");
		baseDaoI.save(user);
		User u=baseDaoI.get();
		System.out.println(u.getId()+":"+u.getName());
		
		BaseDaoI<Employee> baseDaoI2=new BaseDaoImpl<Employee>();
		Employee employee=new Employee();
		employee.setEid("2001");
		employee.setEname("lili");
		employee.setEno("e101");
		baseDaoI2.save(employee);
		Employee e=baseDaoI2.get();
		System.out.println(e.getEid()+":"+e.getEno()+":"+e.getEname());
	}

}
