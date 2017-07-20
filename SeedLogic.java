package guvi;
public class SeedLogic {
      public static int output;
	public static void main(String[] args) {
         seedSum(123);
         System.out.println(output);
	}
	public static void seedSum(int input){
	   int sum=input;
	   while(input!=0){
		  int n=input%10;
		  input/=10;
		  sum=sum*n;
	   }
		output=sum;
	}
}
