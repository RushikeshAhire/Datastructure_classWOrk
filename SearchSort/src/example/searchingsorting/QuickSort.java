package example.searchingsorting;

public class QuickSort {

	public static void main(String[] args) {
		int array [] = { 13,18,27,2,19,25};
		
		QuickSort quickSort = new QuickSort();
			quickSort.printArrayContent(array, array.length-1);
			quickSort.performQuickSort(array, 0, array.length-1);
			quickSort.printArrayContent(array, array.length-1);
	}

	private void performQuickSort(int[] array, int i, int j) {

		
	}

	private void printArrayContent(int[] array, int i) {
	
		
	}

}
