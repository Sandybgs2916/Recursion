package recursion;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbccdaffzz";
		removeDuplicates(str, 0, "");
	}
	public static boolean [] map = new boolean[26]; // size = characters present in eng alphabets 
	public static void removeDuplicates(String str, int idx, String newString) { // map use with static so we 
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);  //didn't put map in parameters we can directly access in recursion
		if(map[currChar - 'a'] == true) { // this will give index value of char in eng aiphabets
			removeDuplicates(str, idx+1, newString); // i.e char already present at correct index 
		} else {
			newString += currChar; // current char not present at correct index
			map[currChar - 'a'] = true; // this indicates if we find same char again at other index
			removeDuplicates(str, idx+1, newString); // then we'll not tract it again
		}	
	} 
}