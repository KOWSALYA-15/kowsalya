package guvi;

import java.util.Scanner;

public class StringMultiply {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        int num=num1*num2;
        String str=Integer.toString(num);
        System.out.println(str);
        sc.close();
	}

}
