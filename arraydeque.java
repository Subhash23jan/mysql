package javacollections;
import java.util.ArrayDeque;
public class arraydeque {
	public static void main(String[] args)
	{
		System.out.println("Array deque opearations");//same as deque in c++
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		dq.offer(45);
		dq.offer(54);
		dq.offerFirst(60);
		dq.offerLast(32);
		System.out.println(dq);
		System.out.println(dq.peekLast());
		
	}
}
