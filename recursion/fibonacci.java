package recursion;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(6));
	}
	public static int fibo(int n) {
		if(n < 2) {
			return n; 
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
}