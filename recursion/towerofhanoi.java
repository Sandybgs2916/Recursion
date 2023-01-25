package recursion;

public class towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		towerOfHanoi(n, "S", "H", "D"); // calling our function where source is s tower, helper is
		                                // H tower and destination is D tower
	}
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if(n == 0) {
			return;
		}
		towerOfHanoi(n-1, src, dest, helper);// 1st step h use as dest and dest use as helper
		System.out.println(" Transfer disk from " +src+" to "+ dest); // 2nd step
		towerOfHanoi(n-1, helper, src, dest); // last step	
	}
}