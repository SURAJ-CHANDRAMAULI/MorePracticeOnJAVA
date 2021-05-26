package generics;

public class GenricPrint {
	
	public static<T> void print(T arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a[] = new String [10];
	for(int i=0;i<10;i++)
		a[i]="abc";
	print(a);

	}

}
