package guvi;

import java.util.Scanner;

public class AddingArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(arr[i]+arr[j]==arr[k]){
						System.out.println(arr[i]+"+"+arr[j]+"="+arr[k]);
					}
				}
			}
		}
		sc.close();
	}

}
