package guvi;

import java.util.Scanner;

public class PosiibleSubsetsOfString {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str="programming";
      char ch[]=str.toCharArray();
      int n=3;
      try{
      for(int i=1;i<str.length();i++){
    	  System.out.print(str.substring(0,1));
    	  for(int j=0;j<n-1;j++){
    		  System.out.print(ch[i+j]);
    	  }
		  System.out.println();
      }
      }
      catch(ArrayIndexOutOfBoundsException e){
      }
	}
}
