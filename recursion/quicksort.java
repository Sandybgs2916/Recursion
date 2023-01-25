package recursion;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6, 3, 9, 5, 2, 8};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		// print quick sort
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void quickSort(int [] arr, int low, int high) {
		if(low < high) {
			int pidx = partition(arr, low, high); 
			// this will return correct pivot index  
			quickSort(arr, low, pidx-1);  // for all the element less than pivot
			quickSort(arr, pidx+1, high); // for all the element greater than pivot
		}
	}
	public static int partition(int [] arr, int low, int high) {
		int pivot = arr[high]; // taking last element as pivot
		int i = low-1; // initially we will assume none of element smaller than pivot
		for(int j = low; j < high; j++) { // here j last index would be high-1 as we take last index as pivot
			if(arr[j] < pivot) {
				i++; // i will track the element and make space for smaller element than pivot
				// swap
				int temp = arr[i]; 
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// for putting pivot at its correct index
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i; // pivot index
	}
}