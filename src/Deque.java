import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offerFirst(13);
		ad.offerFirst(23);
		ad.offerLast(03);
		ad.offerFirst(10);
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
		ad.pollFirst();
		ad.pollLast();
		System.out.println(ad);
		
		
		

	}

}
// .offerFirst()
// .offerLast()
// .peekFirst()
// .peekLast()
// .pollLast()
// .pollFirst()