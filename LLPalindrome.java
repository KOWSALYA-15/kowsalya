package guvi;
import java.util.*;
public class LLPalindrome {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     LinkedList<Character> l=new LinkedList<Character>();
     for(int i=0;i<n;i++){
    	 char ch=sc.next().charAt(0);
    	 l.add(ch);
     }
     LinkedList<Character> l1=new LinkedList<Character>(l);
     Collections.reverse(l1);
     if(l1.equals(l)){
    	 System.out.println("The LinkedList is Palindrome");
     }
     else{
    	 System.out.println("The LinkedList is not Palindrome");
     }
     sc.close();
	}
}
