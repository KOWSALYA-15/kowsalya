package guvi;
	import java.util.Scanner;
	public class ReverseString {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			String []str1=str.split("\\s");
			for(String str2:str1){
				StringBuffer sb=new StringBuffer(str2);
				System.out.print(sb.reverse().toString()+" ");
			}
			sc.close();
}
}