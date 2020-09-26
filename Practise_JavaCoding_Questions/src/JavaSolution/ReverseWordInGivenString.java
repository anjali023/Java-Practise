package JavaSolution;

public class ReverseWordInGivenString {
 public static void main(String[] args) {
	String s = "getting good at coding needs a lot of practice";
	String[] str = s.split(" ");
	int j = str.length;
	String[] result = new String[j];
	
	for(int i=0;i<str.length;i++) {
	    result[j-1] = str[i];
	    j--;
	  }
	
	for(int i=0;i<str.length;i++) {
	    System.out.print(result[i]+" ");
	  }
 	}
}
