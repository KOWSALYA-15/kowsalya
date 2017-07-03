package guvi;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 for(int i=0;i<=num;i++){
                int count=0;
			 for(int n=1;n<=i;n++){
				 if(i%n==0){
					 count++;
				 }
			 }
		 
		 if(count==2){
			 System.out.println(i);
		 }
	}
	sc.close();
}
}
