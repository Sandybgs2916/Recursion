package recursion;

public class print_n_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}
	public static void print(int n) {
		// base condition
		if(n == 5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		// recursive call
		print(n+1);
	}
} 