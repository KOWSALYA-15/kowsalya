package guvi;

import java.util.Scanner;

public class RepeatedNums {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size:");
       int size=sc.nextInt();
       int []a=new int[size];
	   System.out.println("The elements are");
       for(int i=0;i<size;i++){
    	   a[i]=sc.nextInt();
       }
	   System.out.println("Repeated Nums are:");
       for(int i=0;i<size;i++){
    	   for(int j=i+1;j<size;j++){
    		   if(a[i]==a[j]){
    			   System.out.println(a[i]);
    		   }
    	   }
       }
       sc.close();
	}
}
