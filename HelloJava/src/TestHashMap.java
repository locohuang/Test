import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		//Map map = new LinkedHashMap();
		map.put(1, "stu1");
		map.put(2, "stu2");
		map.put(3, "stu3");
		map.put(4, "stu4");
		map.remove(2);
		map.put(3, "stu5");
		//System.out.println(map.containsKey(4));
		//System.out.println(map.containsValue("stu2"));
		//System.out.println(map);
		//System.out.println(map.get(4));
		Set keySet=map.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()){
			System.out.println(map.get(it.next()));
		}
		/*Set entrySet=map.entrySet();
		Iterator it=entrySet.iterator();
		while(it.hasNext()){
			Entry entry=(Entry)it.next();
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}*/
		/*Collection col=map.values();
		Iterator it=col.iterator();
		while (it.hasNext()) {
			System.out.println( it.next());			
		}*/
	}

}
