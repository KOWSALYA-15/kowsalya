package guvi;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String str1=str.substring(0,1).toUpperCase();
       String str2=str.substring(1).toLowerCase();
       System.out.println(str1+str2);
       sc.close();
	}

}
