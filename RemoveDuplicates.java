package guvi;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer sb=new StringBuffer(str);
        char[] str1=str.toCharArray();
        for(int i=0;i<str1.length;i++){
        	for(int j=i+1;j<str1.length;j++){
        if(str1[i]==str1[j]){
        	sb.deleteCharAt(j);
        }
        }
        }
        System.out.println(sb);
       sc.close();
	}
}
