package guvi;

public class SingleInteger {

	public static void main(String[] args) {
		int a[]=new int[]{12,44,15,12,44,22,34,22,34,12};
		int count=0;
		for(int i=0;i<a.length;i++){
			count=0;
			for(int j=0;j<a.length;j++){
			if(a[i]==a[j]){
				count++;
			}
			}
			if(count==1){
			System.out.println(a[i]);
		}
		}
	}

}
