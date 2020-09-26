package JavaSolution;

import java.util.Scanner;

public class Test1 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        int h = sc.nextInt();
	        int n=1;
	        for(int x=0;x<h-1;x++) {
	        	n = n*2;
	        }
	        
	        System.out.println(n);
	       
	        for(int k=0;k<t;k++){
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	            //System.out.println(arr[i]);
	        }
	       
	        int len = arr.length;
	        int res[];
	        while(n!=0) {
	        res = new int[n/2];
	        int j=0;
	        for(int i=1;i<=len;i++){
	            if(arr[i-1]==1 && arr[i]==1)
	            { res[j] = 0; }
	            else
	            { res[j] = 1;  }  
	            i=i+1;
	            System.out.print(res[j]+" ");
	            //System.out.println(i);
	        }
	          n = n/2;
	          len = n;
	          j=0;
	          //System.out.println(res[j]);
	          for(int y=0;y<res.length;y++) {
	        	  arr[y] = res[y];
	        	  System.out.print(arr[y]+" ");
	          }
	        }
	        }
	        
	    }
	}
