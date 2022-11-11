package javacollections;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Stacks 
{
	public static void main(String args[])
	{
		System.out.println("Stack programming");
		Stack<Integer> st=new Stack<>();
		st.push(2);
		st.push(3);
		st.push(1);
		st.push(198);
		System.out.println(st.size());
		System.out.println(st);
	}
	
}