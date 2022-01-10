import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mp = new TreeMap<>();
		mp.put("One",10);
		mp.put("Two",20);
//		mp.put("One",30);
		mp.putIfAbsent("One", 30);
		
		
		System.out.println(mp.containsKey("Two"));
		
		System.out.println(mp);
		
//		for(Map.Entry<String, Integer> e : mp.entrySet()) {
////			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
//		for(String key : mp.keySet()) {
//			System.out.println(key);
//		}
		
		for(Integer value : mp.values()) {
			System.out.println(value);
		}
		
		System.out.println(mp.containsValue(10));
		System.out.println(mp.isEmpty());
		mp.clear();
		System.out.println(mp);
		
		
		

	}

}
// .put(key,value)
// .containsKey(key)
// .putIfAbsent(key,value)
// .getKey()
// .getValue()
// .keySet()
// .values()
// .containsValue(value)
// .isEmpty()
// .clear()