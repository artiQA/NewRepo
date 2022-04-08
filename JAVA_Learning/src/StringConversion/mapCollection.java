package StringConversion;

import java.util.HashMap;
import java.util.Map;

public class mapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Advikaakkk";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		    System.out.println(s.charAt(i)+"--"+cnt);
		  } else {
		    map.put(c, 1);
		  
		  }
		}
	}
}
