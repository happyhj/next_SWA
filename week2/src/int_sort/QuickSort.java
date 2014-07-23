package int_sort;

public class QuickSort implements ISort {

	@Override	
	public int[] Sort(int[] arr) {	
		quickSort(arr, 0, arr.length-1);
	    return arr;
	}
	
	private int partition(int[] arr, int left, int right)
	{
		int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	
	private void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);				
	}
	

}
