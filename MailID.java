package guvi;

import java.util.Scanner;

public class MailID {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int c=0;
		int c1=0;
		if(str.contains("@")&&str.contains("."))
		{
			for(int i=0;i<str.length();i++)
			{
				if((str.charAt(i)=='@'))
				{
					c++;
				}
				if((str.charAt(i)=='.'))
				{
					c1++;
				}
			}
			if((c==1)&&(c1==1))
			{
				
				int m=str.indexOf("@");
				int n=str.indexOf(".");
				if(str.substring(m+1,n).length()==5)
				{
					if(str.endsWith("com"))
					{
						if(str.substring(0,m).length()>=3)
						{
							System.out.println("Valid email id");
						}
					}
				}
						
			}
		}
		else
		{
			System.out.println("not valid email id");
		}
        sc.close();
	}


}

