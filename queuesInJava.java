package javacollections;
import java.util.Comparator;
//import java.util.*;
//import java.util.*;
//import java.io.*;
//import java.lang.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
public class queuesInJava {
	public static void main(String[] args)
	{
		System.out.println("Queue operations");
		Queue<Integer> q= new LinkedList<Integer>();
		q.offer(2);
		q.offer(23);
		//q.peek();
		
//		q.element(),q.add(null),q.remove these functions throew the exceptions hence we doesn't prefer these three
		System.out.println(q.poll());
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//default work as minimum heap 
		pq.offer(2);
		pq.offer(23);
		pq.offer(34);
		pq.offer(12);
		pq.offer(17);
		pq.comparator();
		System.out.println(pq);
		for(int i=0;i<=4;i++)
		System.out.println(pq.poll());
	}
}
