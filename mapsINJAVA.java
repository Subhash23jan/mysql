package javacollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class mapsINJAVA {
	public static void main(String[] args) {
		System.out.println("Maps in java");
		Map<Integer,Integer> mp=new HashMap<>();//overriding property 
		
		
		//Map<Integer,Integer> mp=new TreeMap<>();
		mp.put(34, 2);
		mp.put(54, 03);
		mp.put(13, 4);
		mp.put(3, 7);
		//System.out.println(mp.containsValue(2));
		System.out.println(mp);
		System.out.println(mp);
//		for(Map.Entry<String, Integer> e :mp.entrySet())
//			System.out.println(e);
		
		
		
	}
}
