package guvi;
public class ReverseOrder {
       public static String output;
	public static void main(String[] args) {
       reverseWord("Hello World");
       System.out.println(output);
	}
	public static void reverseWord(String input){
		String[] str=input.split(" ");
		output=str[1]+" "+str[0];	
	}

}
