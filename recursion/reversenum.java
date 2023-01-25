package recursion;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =  98765;
		 reverse(num);
	}
	public static void reverse(int num) {
		if(num == 0) {
			return;
		}
		else {
			System.out.print(num%10);
			reverse(num/10); 
		}
	}	
}