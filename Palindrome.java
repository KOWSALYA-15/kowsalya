package guvi;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		while(n!=0){    
           sum+=n%10;
			n/=10;
		}
		int sum1=sum;
		System.out.println(sum);
		int rem=0;
		while(sum1>0){
			rem=sum1*10;
			rem=rem+sum1%10;
			sum1/=10;
		}
		if(sum==rem){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
