package JavaSolution;

import java.util.HashMap;

public class nonRepeatingCharacter {
	
	public static void main(String[] args) {
		String input = "traccarfe";
		char ch[] = new char[input.length()];
		ch = input.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : ch) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		char result = 0;
		for(char c : ch) {
			if(map.containsKey(c)) {
				if(map.get(c)==1)
				{
					 result = c; 
					break;
				}
			}
		}
		System.out.println(result);
		
	}
}

