package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDigits {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        int i;
        for(i=0;i<size;i++){
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("k digits");
        int k=sc.nextInt();
        for(i=0;i<arr.length-k;i++){
        	System.out.println(arr[i]);
        }
        sc.close();
	}

}
