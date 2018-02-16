import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.collections4.map.MultiValueMap;


public class DemoClass {

	
	public static void main(String[] args) {
		MultiValueMap<Integer, String> map = new MultiValueMap<>();
		map.put(1, "aaa");
		map.put(4, "aaaa");
		map.put(1, "aaa");
		map.put(1, "bbb");
		
		System.out.println(map);
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap< Integer,String>();
		map1.put(1, "aaa");
		map1.put(1, "bbb");
		
		System.out.println(map1);
		
		HashMap<String, String> map2 = new HashMap<>();
		System.out.println(map2.put("a", "b"));
		System.out.println(map2.put("a", "c"));
		
		
		String s1 = "a";
		String s2 = new String("a");
		String s3 = s2.intern();
		System.out.println("string check"+s1==s2);
		System.out.println("string check"+s1==s3);
		
		IdentityHashMap<String, String> idMap = new IdentityHashMap<>();
		idMap.put(new String("a"), "aaa");
		idMap.put(new String("a"), "bbb");
		System.out.println("idMap"+idMap);
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(null, "aaa");
//		System.out.println(treeMap);
		
//		TreeSet<String> treeSet = new TreeSet<>();
//		treeSet.add(null);
	}
}
