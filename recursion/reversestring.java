package recursion;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		printRev(str, str.length()-1);
	}
	public static void printRev(String str, int idx) { // we would have only two parameters
		if(idx == 0) {
			System.out.println(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx)); // at every level we will print
		printRev(str, idx-1); // after print at every level we will call index-1
	}
}