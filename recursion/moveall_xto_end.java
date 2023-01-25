package recursion;

public class moveall_xto_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "axbcxxd";
		moveAllX(str, 0, 0, "");
	}
	public static void moveAllX(String str, int idx, int count, String newString) {
		if(idx == str.length()) {
			for(int i = 0; i < count; i++) {
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(currChar == 'x') {
			count++;
			moveAllX(str, idx+1, count, newString);
		} else {
			newString += currChar;
			moveAllX(str, idx+1, count, newString);
		}
	}
}