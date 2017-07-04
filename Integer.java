package guvi;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int count=0;
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("The array elements are");
      for(int i=0;i<size;i++){
    	  a[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
    	  count=0;
    	  for(int j=0;j<size;j++){
    	  if(a[i]==a[j]){
    		  count++;
    	  }
    	  }
    	  if(count==1){
    		  System.out.println(a[i]);
    	  }
      }
      sc.close();
	}

}
