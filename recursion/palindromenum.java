package recursion;

public class palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int temp = rev(n,0); // passing parameters it means in rev func val actual value is 0 and n is 121
		if(temp == n) {     // temp will store the value given by rev function
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("No Palindrome");
		}
	}
	public static int rev (int n , int val) {
		if(n == 0) { // base case
			return val;
		}
		val = (val * 10) + (n % 10); // stores the reverse of num
		return rev(n/10, val);
	}
}