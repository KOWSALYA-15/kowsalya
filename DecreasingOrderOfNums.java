package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class DecreasingOrderOfNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int i=0,j=0,temp=0;
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		for(j=i+1;j<n;j++)
		{
		if(a[i]<a[j])
		 {
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		}
	    }
		System.out.println(a[i]);
		}
		sc.close();
		}
}
