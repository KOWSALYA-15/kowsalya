package guvi;	
import java.util.Scanner;
public class  ReversedString{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str1=sc.nextLine();
			String[] str=str1.split(" ");
			int l=str.length;
			String str3=" ";
			String str5="";
			StringBuffer str6=new StringBuffer(str[0]);
			str6.reverse();
			String str7=str6.toString();
			str5=str5+str7;
			for(int i=1;i<l;i++){
		       if(i%2==0){
	        StringBuffer str2=new StringBuffer(str[i]);
				str2.reverse();
				 str3=str2.toString();
				 }
		       if(i%2!=0){
		    	   str3=str[i];
		       }
				str5=str5+" "+str3;
			}
			System.out.println(str5);
			sc.close();
		}
	}


