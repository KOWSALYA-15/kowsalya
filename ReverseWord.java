package guvi;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2[]=str.split(" ");
		for(int i=str2.length-1;i>=0;i--)
		{
			System.out.print(str2[i]+" ");

		}
            sc.close();
	}
}
