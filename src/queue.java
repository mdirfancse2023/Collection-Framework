import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qq  = new LinkedList<>();
		qq.offer(1);
		qq.offer(2);
		qq.offer(3);
		qq.add(4);
		
		
		
		
		System.out.println(qq.element());
		
		
		System.out.println(qq);

	}

}

// .offer(value) .add()
// .poll() .remove()
// .peek() .element()