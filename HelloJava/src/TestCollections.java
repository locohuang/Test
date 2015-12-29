import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list= new ArrayList<Integer>();
		Collections.addAll(list, 3,4,9,2,10);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);*/
		
		int[] iValue=new int[] {1,2,3,4,5,6,7,9};
		int[] newValue=Arrays.copyOfRange(iValue, 2, 6);
		for(int i:newValue){
			System.out.println(i);
		}
	}

}
