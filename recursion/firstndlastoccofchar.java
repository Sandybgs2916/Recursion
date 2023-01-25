package recursion;

public class firstndlastoccofchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaacdaefaah";
		findOccurence(str, 0, 'a');
	}
	public static int first = -1; // global scope
	public static int last = -1;
	public static void findOccurence(String str, int idx, char element) {
		if(idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currChar = str.charAt(idx);
		if(currChar == element) {
			if(first == -1) { // that means we are excessing element first time
				first = idx; // first will update to index value
			} else {
				last = idx;  // last will update to last index of the occurence of element
			}
		}
		findOccurence(str, idx+1, element);
	}
}