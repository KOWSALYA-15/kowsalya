package guvi;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		String str2[]=str.split(" ");
		for(int i=str2.length-1;i>=0;i--)
		{
			str1=str1+str2[i]+" ";
		}
      System.out.println(str1+" ");
      sc.close();
	}
}
