package example.searchingsorting;

public class bubbleSort {

	public static void main(String[] args) {
	 int a[]= {10,8,9,20,39,54};
	 System.out.println("Array before Sort: ");
	 for(int i=0;i<6;i++) {
		 System.out.println(a[i]);
		 
	 }
	 Bubbles(a);
	 System.out.println("Array After Bubble Sort");
	 for(int i=0;i<6;i++) {
		 System.out.println(a[i]);
	 }
	 
		
	}

	public static void Bubbles(int a[]){
		for(int i=a.length-1;i>=0;i--) {
			for(int j=0;j<i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
}
