package oops;

public class Recursion {

public static int fact(int n) {
	if(n==0)
		return 1;
	//int smallans=fact(n-1);
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(fact(3));

	}

}
