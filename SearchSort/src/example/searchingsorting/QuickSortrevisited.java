package example.searchingsorting;

public class QuickSortrevisited {
	public static void main(String[] args) {
		
		int a[]= {50,25,92,16,76,30,43,54,19};
		int low=0 ,high=a.length-1;
		System.out.println("Array before printing:");
		for(int i=0;i<9;i++) {
			System.out.println(a[i]);
			}
		QuickSort(a,low,high);
		System.out.println("Array after Quick Sort");
		for(int i=0;i<9;i++) {
			System.out.println(a[i]);
			
		}
		
		
		
	}
	public static void QuickSort ( int a[] ,int low, int high) {
	
		int pivot;
		if(high>low)
		{
			pivot= partion(a,low,high);
			QuickSort(a,low,pivot-1);
			QuickSort(a,pivot+1,high);
			
			}
		}
	private static int partion(int a[],int low ,int high) {
		
		int left,right,pivote_item=a[low];
		left=low;
		right=high;
		
		while(left<right) {
			while(a[left]<=pivote_item) 
				left++;
			while(a[right] >pivote_item)
				right--;
			if(left<right)
				swap(a,left,right);
		}
			a[low]=a[right];
			a[right]=pivote_item;
			
			return right;
		
	}


		private static void swap(int a[],int left, int right) {
			int temp=0;
			temp=a[left];
			a[left]=a[right];
			a[right]=temp; 
		
		
		
	}
		
}
		


