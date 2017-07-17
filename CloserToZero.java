package programs;
public class CloserToZero {
	public static void main(String[] args) {
       int a[]=new int[]{1,2,3,-2,4};
       try{
       for(int i=0;i<a.length;i++){
    	   for(int j=i+1;j<a.length;j++){
    		   if(a[i]+a[j]==0){
    			   System.out.println("The elemerents are closer to zero:"+a[i]+" "+a[j]);
    		   }
    		  }
       }
       }
       catch(ArrayIndexOutOfBoundsException e){
       }
   	}

}
