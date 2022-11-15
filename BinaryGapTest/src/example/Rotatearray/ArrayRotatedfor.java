package example.Rotatearray;

public class ArrayRotatedfor {

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6};
		int n=3;
		for(int i=0;i<arr.length;i++)//original Array 
		{
			System.out.println("Original Array List:-"+arr[i]);
			
		}
	  	
		
	    for(int i=0 ;i<n;i++)
	    {
		int j,last;
		last=arr[arr.length-1];
		
		for(j=arr.length-1;j>0;j--) //Array
		{
			arr[j]=arr[j-1];
		}
			arr[0]=last;
			
		
		
	}

	for(int i=0;i<arr.length;i++) {
		System.out.println("Rotated Array :- "+arr[i]);
	}

	}

}
