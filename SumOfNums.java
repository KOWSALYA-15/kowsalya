package logicPrograms;

import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0,n,sum=0,sum1=0,a=0;
        while(num!=0){
        	rev=rev*10;
        	rev=rev+num%10;
        	num/=10;
        }
        n=rev;
        while(n>0){
        	a=n%10;
        	sum=sum+a;
        	sum1=sum1+sum;
        	n/=10;  	
        }
        System.out.println(sum1);
        sc.close();
	}
}