package guvi;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		       Scanner sc=new Scanner(System.in);
               int num=123;
               num=sc.nextInt();
               int rev=0;
               while(num!=0){
            	   rev=rev*10;
            	   rev=rev+num%10;
            	   num=num/10;
               }
               System.out.println("Reverse of the number is:"+rev);
               sc.close();
	}

}
