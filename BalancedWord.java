package guvi;

import java.util.Scanner;

public class BalancedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.length()%2==0){
			System.out.println(str+" is balanced");
		}
		else{
			System.out.println(str+" is not balanced");
		}
		sc.close();
	}
}
