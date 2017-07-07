package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOrder {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int count=0;
          int arr[]=new int[n];
          int a[]=new int[n];
          for(int i=0;i<n;i++){
        	  arr[i]=sc.nextInt();
          }
          for(int i=0;i<n;i++){
        	  a[i]=arr[i];
          }
          for(int i=0;i<4;i++){
        		if(a[i]!=arr[i]){
        			count++;
          }
          }
          if(count==0){
        	  System.out.println("Arrays is Sorted order");
          }
          else{
        	  System.out.println("Arrays is not in Sorted order");
	}
sc.close();
          }
	}

