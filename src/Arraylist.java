import java.util.*;

import java.util.Iterator;
import java.util.LinkedList;


// n -> n + n/2 + 1
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new LinkedList<>();
//		ArrayList<String> newarr = new ArrayList<>();
//		newarr.add("Papaya");
		arr.add("Mango");
		arr.add("Orange");
		
		arr.add(0,"Banana");
		
//		arr.addAll(newarr);
//		System.out.println(arr);
//		System.out.println(arr.get(1));
//		System.out.println(arr.remove(2));
//		System.out.println(arr);
//		System.out.println(arr.remove(String.valueOf("Papaya")));
//		System.out.println(arr);
//		arr.set(1, "Papaya");
//		System.out.println(arr);
//		System.out.println(arr.contains("Papaya"));
//		arr.clear();
//		System.out.println(arr);
		
//		for(String ss  : arr) {
//			System.out.println(ss+"1");
//		}
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

// .add(value)
// .add(index,value)
// .addAll(list)
// .get(index)
// .remove(index)
// .remove(Datatype.valueOf())
// .clear()
// .set(index,value)
// .contains(value)
