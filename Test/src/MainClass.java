import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.BooleanUtils;

import static java.lang.Math.*;

public  class MainClass {
	
	
	private MainClass(){
		
	}
	
	public void display(){
		 final int i = 5;
		
		 class Inner{
			void displayMthodVariable(){
				System.out.println("i"+i);
			}
		}
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		System.out.println("list size"+list.size());
		System.out.println("list obj"+list.get(0));
		
		int[] intarr= new int[0];
//		List<String> list = new ArrayList<>();
//		list = null;
//		for(String a : list){
//			System.out.println("inside for");
//		}
		
		Boolean flag1 = null;
		//Boolean flag1 = true;
		System.out.println("boolean "+BooleanUtils.isTrue(flag1));
		
		System.out.println("G".equals(null));
		
		Map<Integer, String> mapSorting = new HashMap<>();
		mapSorting.put(2, "bbb");
		mapSorting.put(1, "ddd");
		mapSorting.put(3, "aaa");
		
		System.out.println(new TreeMap<>(mapSorting));
		
		//Collections.sort(mapSorting);
		
		// TODO Auto-generated method stub
		MainClass main= new MainClass();
		main.display();
		
		System.out.println(sqrt(25));
		ConcurrentHashMap<Integer, String> conmap = new ConcurrentHashMap<>();
		//conmap.put(null, "aaaa");
		conmap.put(1, "aaa");
		
		System.out.println("conmap"+conmap);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "first");
		map.put(2, "sec");
		map.put(3, "three");
		map.put(null, "null");
		System.out.println("put return"+ map.put(1, "first"));
		System.out.println("put return"+ map.put(1, "1st"));
		
		System.out.println("map"+map);
		
		System.out.println(map.get(3));
		
		boolean flag = false;
		String s = "caabbcbaac";
		String s1 = "abc";
		
		for(int i=0; i<s.length()/2; i++){
			if(s.charAt(i) == s.charAt(s.length()-1-i)){
				flag = true;
			}else 
				flag = false;
		}
		System.out.println(flag);
		//System.out.println(new StringBuilder(s1).reverse());
		
		char[] reverse = new char[s.length()];
		for(int i = s1.length()-1; i>=0; i--){
			int j=0;
			reverse[j] = s1.charAt(i);
			j++;
			System.out.println(reverse[j]);
		}
		
		
		
		//System.out.println(reverse[]);
	}

}
