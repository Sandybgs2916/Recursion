package recursion;

public class sumofdigitsofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfD(2335));
	}
	public static int sumOfD(int num) { // whatever we passed here in the arguments it passed to recursion call
		if(num == 0) {
			return 0;
		}
		return (num % 10) + sumOfD(num/10); // recursion call
	}
}