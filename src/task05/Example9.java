package task05;

import java.util.*;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;

public class Example9 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		int target = 6;
		
		ArrayList<Integer> result = sum_for_two_nums(arr,target);
		
		for(int i : result)
			System.out.println("Index: " + i + " ");
		

	}

	public static ArrayList<Integer> sum_for_two_nums(final List<Integer> a, int b) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result.add(0);
		result.add(1);
		for(int i=0; i<a.size(); i++) {
			if(map.containsKey(a.get(i))) {
				int index = map.get(a.get(i));
				result.set(0, index);
				result.set(1, i);
				break;
			}
			else {
				map.put(b - a.get(i),i);
			}
		}
		

		return result;
	}

}
