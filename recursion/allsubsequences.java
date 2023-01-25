package recursion;

public class allsubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subseq("", "abc");
	}
	public static void subseq(String p, String up) {
		// p means process nd up means unprocess
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
			char ch = up.charAt(0);
			subseq(p + ch, up.substring(1)); // character added in p
			subseq(p, up.substring(1)); // character not added in p
		}
	}  