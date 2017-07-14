package guvi;

import java.util.Scanner;

public class LongestPalindrome {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           String str=sc.next();
           int max=0;
           StringBuffer a=new StringBuffer(str);
           StringBuffer b=new StringBuffer();
           StringBuffer c=new StringBuffer();
           StringBuffer d=new StringBuffer();
           for(int i=0;i<a.length();i++){
        	   for(int j=i+1;j<=a.length();j++){
        		   b=new StringBuffer(a.substring(i,j));
        		   c=new StringBuffer(a.substring(i,j)).reverse();
                   if(b.toString().equals(c.toString())&&b.length()>max){
                	   max=b.length();
                	   d=b;    	   
                   }
        	   }
           }
           System.out.println(d);
           sc.close();
	}

}
