package recursion;

public class countanydigitsinnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12005;
		int k = 0;
		System.out.println(countdigits(n,k)); 
	}
	public static int countdigits (int n , int k) {
		if(n == 0) { // base case
			return 0;
		}
		int digit = n % 10;
		if(digit == k) {
			return 1 + countdigits(n/10,k);
		}
		return countdigits(n/10,k);
	} 
} 