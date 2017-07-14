package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class UserId {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str1=sc.next();
		     String str2=sc.next();
		     int l1=str1.length();
		     int l2=str2.length();
		     String smaller=" ";
		     String higher=" ";
		     String userId=" ";
		     if(l1>l2){
		    	 smaller=str2;
		    	 higher=str1;
		     }else if(l1<l2){
		    	 smaller=str1;
		    	 higher=str2;
		     }else if(l1==l2){
		    	 String[] a=new String[2];
		    	 a[0]=str1;
		    	 a[1]=str2;
		    	 Arrays.sort(a);
		    	 higher=a[0];
		    	 smaller=a[1];
		    	  }
		     System.out.println("Enter the pint number");
		     int pin=sc.nextInt();
		     System.out.println("Enter the number");
		     int num1=sc.nextInt();
		     int num2=0;
		     int num3=0;
		     String str3=Integer.toString(pin);
		     int len3=str3.length();
		     for(int i=0;i<len3;i++){
		    	 if((num1-1)==i){
		    		 num2=Integer.parseInt(str3.substring(i,i+1));
		    	 }
		     }
		     System.out.println(num2);
		     int j=0;
		     for(int i=len3-1;i>=0;i--){
		    	 j=j+1;
		    	 if((num1)==j){
		    		 num3=Character.getNumericValue(str3.charAt(i));
		    	 }
		     }
		     System.out.println(num3);
		     userId=userId+higher.charAt(0)+smaller+num2+num3;
		     System.out.println(userId);
		     sc.close();
		}

	}


