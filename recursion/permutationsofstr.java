package recursion;

public class permutationsofstr {

	public static void main(String[] args) {
		permutations("", "abc");
	}
	public static void permutations(String p, String up) {
		// p means process nd up means unprocess
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
			// here if we choose 'a' at first then next start with "bc" if 'b' then "ac" nd so on
			for(int i = 0; i <= p.length(); i++) {
				char ch = up.charAt(0);
				String f = p.substring(0,i);
				String s = p.substring(i, p.length());
			    permutations(f+ch+s, up.substring(1));  
		} 
	}
}
// time complexity = O(n!)