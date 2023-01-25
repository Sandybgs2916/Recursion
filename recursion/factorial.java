package recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(6));
	}
	public static int fact(int num) {
		if(num > 0) {
			return num * fact(num-1);
		}
		else {
			return 1;
		}
	}
}