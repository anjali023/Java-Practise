package JavaSolution;

import java.util.ArrayList;
import java.util.List;

public class InsertElementInSortedArray2 {

	public static void main(String[] args) {
		
	int[] arr = new int[]{ 12, 16, 20, 40, 50, 70 ,90};
	List<Integer> finalList = new ArrayList<>();
	
	int num = 58;
	int check = 0;
	
	for(int i = 0; i < arr.length; i++) {
		if(num > arr[i]) {
			finalList.add(arr[i]);
		}else if(num < arr[i] && check == 0) {
			finalList.add(num);
			finalList.add(arr[i]);
			check = 1;
		}else {
			finalList.add(arr[i]);
		}
		
	}
	
	System.out.println(finalList);
	
	
		
	}
}
