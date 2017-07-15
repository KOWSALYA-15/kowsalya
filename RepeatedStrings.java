package guvi;

import java.util.Scanner;

public class RepeatedStrings {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String str1=str.substring(0,str.length()/2);
       String str2=str.substring(str.length()/2);
    	   if(str1.equals(str2)){
    		   System.out.println("Strings are double strings"); 
    	   }
    	   else{
    		   System.out.println("Strings are not double strings"); 

    	   }
       
       sc.close();
	}

}
