package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class HeightOfStudent {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[50];
		for(int i=0;i<50;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("4th tallest:"+a[3]);
		int k=sc.nextInt();
		System.out.println("kth tallest:"+a[k-1]);
		sc.close();
	}
}