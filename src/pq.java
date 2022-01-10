import java.util.Comparator;
import java.util.PriorityQueue;

public class pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pp = new PriorityQueue<>(Comparator.reverseOrder());
		pp.offer(13);
		pp.offer(23);
		pp.offer(03);
		
		System.out.println(pp);
		System.out.println(pp.poll());
		System.out.println(pp);
		
		System.out.println(pp.peek());

	}

}


