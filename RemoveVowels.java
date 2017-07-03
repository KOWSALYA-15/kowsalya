package guvi;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      StringBuffer str1=new StringBuffer(str);
      String str2=str1.reverse().toString();
      String str3=str2.replaceAll("[aeiouAEIOU]", "");
      System.out.println(str3);
      sc.close();
	}

}
