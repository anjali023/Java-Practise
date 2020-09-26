package JavaSolution;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for(int k=0;k<t;k++){
	         int h = sc.nextInt();
	         int[] l = new int[h];
	         for(int m=0;m<h;m++){
	          l[m] = sc.nextInt();
	         }
	         
	        for(int i =0;i<=h;i++){
	            if(l.length==0){
	                for(int j=0;j<l[0];j++){
	                    if(i==0 && j==0){
	                        System.out.print("*"+" ");
	                    }
	                    else if (i>=0)
	                    System.out.println("*");
	                }
	            }else
	            {
	                for(int j=0;j<=l[0];j++){
	                    if(i==0)
	                    System.out.print("*"+" ");
	                    else
	                    {
	                    if(j==l[0]){
	                      System.out.println("*"+"\n"+"*");
	                    }else
	                    
	                    System.out.println("*");
	                    }
	                }
	            }
	         }
	         System.out.println("");
	        }
	    }

}
