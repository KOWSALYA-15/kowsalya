package guvi;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String num=sc.nextLine();
         int n=Integer.parseInt(num);
         System.out.println(n);
         sc.close();
	}

}
