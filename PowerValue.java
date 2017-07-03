package guvi;

import java.util.Scanner;

public class PowerValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sum=1;
      int rem=0;
      int a=0;
        int sum1=0;
        int count=0;
        while(num!=0){
      	  num=num/10;
      	  count++;
        }
        while(num2!=0){
      	  rem=num2%10;
      	  num2=num2/10;
      	  sum=1;
      	  a=count;
        while(a!=0){
      	  sum=sum*rem;  
      	  a--;
        }
        
        sum1=sum1+sum;
        }
        System.out.println(sum1);
        sc.close();
}
}
