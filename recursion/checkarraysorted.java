package recursion;

public class checkarraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 3, 5};
		System.out.println(isSorted(arr, 0));
	}
	public static boolean isSorted(int [] arr, int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		if(arr[idx] < arr[idx+1]) {
			return isSorted(arr, idx+1);
		}
		else {
			return false;
		}
	}
}