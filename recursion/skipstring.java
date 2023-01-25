package recursion;

public class skipstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(skipApple("baccappled"));
	}
	public static String skipApple(String up) {
		if(up.isEmpty()) {
			// System.out.println(p);
			return "";
		}
		if(up.startsWith("apple")) {
			return skipApple(up.substring(5));
		} else {
			return up.charAt(0) + skipApple(up.substring(1));
		}
	}
}