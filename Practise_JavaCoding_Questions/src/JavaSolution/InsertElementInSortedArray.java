package JavaSolution;

public class InsertElementInSortedArray {

	public static void main(String[] args) {
		
	int[] array = new int[]{ 12, 16, 20, 40, 50, 70 ,90};
	int len = array.length+1;
	int[] result = new int[len];
	int insertValue = 52;
	int j=0;
	int count=0;
		for(int i=0;i<array.length;i++) {
		  if(array[i]<insertValue) {
			  result[j] = array[i];
			  j++;
		  }
		  else if((array[i]>insertValue) && count==1)
		  {
			  
			  result[j] = array[i];
			  j++;
		  }
		  else
		  {
			  result[j] = insertValue;
			  count++;
			  j++;
			  i--;
		  }
		  
		}
		
		
		for(int k=0;k<len;k++) {
			System.out.print(result[k]+" ");
		}
		
	}
}
