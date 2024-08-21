package Demo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class SampleOfCollection {

	public static void main(String[] args) {
//		List<Integer> iList=new ArrayList<Integer>();
//		iList.add(12);
//		iList.add(34);
//		iList.add(22);
//		iList.add(44);
//	
//		Iterator it=iList.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		String str="hello";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		if(map.containsKey( str.charAt(i))) {
			map.put(str.charAt(i),map.get(str.charAt(i))+1);
		}
		else {
			map.put(str.charAt(i),1);
		}
		}
		
		for(Entry<Character,Integer> set:map.entrySet()) {
			
			System.out.println(set.getKey()+" "+set.getValue());
			
		}
		//Enumeration<Integer> ei=VList.elements();
	}
}
