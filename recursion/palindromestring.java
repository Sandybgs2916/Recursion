package recursion;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcba";
		if(isPalindrome(str)) {
			System.out.println(str + " is Palindrome");
		}
		else {
			System.out.println(str + " is not Palindrome");
		}
	}
	public static boolean isPalindrome(String str) {
		int n = str.length();
		// if string is empty, then it is palindrome
		if(n == 0) {
			return true;
		}
			return checkPalindrome(str, 0, n-1);
		}
	public static boolean checkPalindrome(String str, int s, int e) {
		if(s == e) { // if there is only one character
			return true;
		}
		// if first and last characters do not match
		if((str.charAt(s)) != (str.charAt(e))) {
			return false;
		}
		// if there are multiple characters, check if middle substring is also palindrome or not.
		if(s < e+1){
			return checkPalindrome(str, s+1, e-1);
		}
			return true;
		}
	}