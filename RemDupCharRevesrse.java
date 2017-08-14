package guvi;

import java.util.*;

public class RemDupCharRevesrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str2=sc.next();
		StringBuffer sb=new StringBuffer(str2).reverse();
		String str=sb.toString();
		String str1=" ",str3=" ";
		LinkedHashSet<Character> ls=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			ls.add(str.charAt(i));
		}
        Iterator<Character> itr=ls.iterator();
        while(itr.hasNext()){
        	str1=String.valueOf(itr.next());
			str3=str3+str1;
        }
        System.out.println(str3);
	}

}
