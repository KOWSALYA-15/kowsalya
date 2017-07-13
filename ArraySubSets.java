package guvi;

import java.util.Scanner;

public class ArraySubSets {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int count=0;
	   System.out.println("size of a:");
	   int a=sc.nextInt();
	   System.out.println("size of b:");
	   int b=sc.nextInt();
	   int a1[]=new int[a];
       int a2[]=new int[b];
       System.out.println("a1 values:");
       for(int i=0;i<a;i++){
    	   a1[i]=sc.nextInt();
       }
       System.out.println("a2 values:");
       for(int i=0;i<b;i++){
    	   a2[i]=sc.nextInt();
       }
       for(int i=0;i<a;i++){
    	   for(int j=0;j<b;j++){
    		   if(a1[i]==a2[j]){
    			   count++;
    		   }
    	   }
       }
       if(count==a1.length){
    	   System.out.println("a1 is the subset of a2");
       }
       else{
    	   System.out.println("a1 is not subset of a2");
       }
       sc.close();
	}

}
