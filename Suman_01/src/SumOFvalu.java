
public class SumOFvalu {
	public static void main(String[] args) {
		  int arr[]= {3,8,10,5,20,5,9,6,1,18,19};
		  int b=21;
		  for(int n=0;n<arr.length;n++) {
			  for(int a=0;a<arr.length;a++) {
				  for(int j=0;j<arr.length;j++) {
					  if(arr[n]+arr[a]+arr[j]==b) {
						  System.out.println(arr[n]+"+"+arr[a]+"+"+arr[j]+"="+b);
						 
					  }
				  }
				  
				  
		   }
	}

}
}
