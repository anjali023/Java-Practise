package JavaSolution;

public class LengthOfEachChar {

	public static void main(String[] args) {
		
	String input = "wwwwaaadexxxxxxt";
	char[] ch = new char[input.length()];
	ch = input.toCharArray();
	int count =1;
	for(int i=0;i<ch.length; ) {
		if(ch[i]==ch[i+1]) {
			//System.out.println(ch[i]+""+ch[j]);
			//System.out.println(i+""+j);
			count++;
			i++;
		}	
		else {
			System.out.print(ch[i]+""+count);
			count=1;
			i++;
		}
	  
	}
	}
	
}
	

