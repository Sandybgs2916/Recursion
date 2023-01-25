package recursion;

public class permutationscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutationsCount("", "abc"));
	}
	public static int permutationsCount(String p, String up) {
		// p means process nd up means unprocess
		if(up.isEmpty()) {
			return 1;
		}
		    int count = 0;
			char ch = up.charAt(0);
			// here if we choose 'a' at first then next start with "bc" if 'b' then "ac" nd so on
			for(int i = 0; i <= p.length(); i++) {
				String f = p.substring(0,i);
				String s = p.substring(i, p.length());
			    count += permutationsCount(f+ch+s, up.substring(1)); // newStr will replace str 
		}
			return count;
	}
}