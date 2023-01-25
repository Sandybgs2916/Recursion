 package recursion;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr, 0, n-1);
		// printing our original array
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public static void divide(int [] arr, int si, int ei) {
		if(si >= ei) {
			return;
		}
		int mid = si + (ei-si)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		// after divide process end then we start our conquer process
		conquer(arr, si, mid, ei);
	}
	public static void conquer(int [] arr, int si, int mid, int ei) {
		int [] merged = new int[ei - si + 1]; // ei - si + 1 will give size of array we take as input
		// merged array created for putting sorted element in it
		int idx1 = si; // idx1 tracking first index element of 1st sorting array after divide
		int idx2 = mid+1; // idx2 tracking first index element of 2nd sorting array after divide
		int x = 0; // x is used to track our merged array index.
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x] = arr[idx1];
				x++; idx1++;
			}
			else {
				merged[x] = arr[idx2]; // if arr 2nd sorted element is less than first sorted element
				x++; idx2++;
			}			
		}
		// below 2 while loop for if any element left after divide especially when we would have odd element
		while(idx1 <= mid) {
			merged[x] = arr[idx1]; // if this while loop run then below will not run
			x++; idx1++;
		}
		while(idx2 <= ei) {   // if this while loop run then just above will not run
			merged[x] = arr[idx2];
			x++; idx2++;
	}
		// now in original array we will copy merged array element
		for(int i = 0, j = si; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
}
}