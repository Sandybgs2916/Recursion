package recursion;

public class print_n_to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}
	public static void print(int n) {
		if(n == 1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		print(n-1);
	}
}