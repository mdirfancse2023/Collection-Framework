import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Integer> ss = new HashSet<>(); Random Order uses Hashing // Unordered Set in C++
//		Set<Integer> ss = new LinkedHashSet<>(); Order maintained uses LinkedList
		Set<Integer> ss = new TreeSet<>(); // According to max or min uses tree //Ordered Set in C++
		ss.add(23);
		
		ss.add(23);
		ss.add(45);
		ss.add(43);
		ss.add(72);
		System.out.println(ss);
		
		ss.remove(72);
		System.out.println(ss);
		System.out.println(ss.contains(23));
		System.out.println(ss.isEmpty());

		ss.clear();
		System.out.println(ss);
		
//		Arrays.sort(ss);

	}

}
// .add(value)
// .remove(value)
// .contains(value)
// .isEmpty()
// .size()
// .clear()
