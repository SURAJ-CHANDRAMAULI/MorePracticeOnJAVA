package oops;
import java.util.Scanner;
class ComplexNumbers{
	int real;
	int img;
	public ComplexNumbers(int real,int img) 
	{
		this.real=real;
		this.img=img;
	}
	void plus(ComplexNumbers c2)
	{
		this.real=this.real+c2.real;
		this.img=this.img+c2.img;
	}
	void multiply(ComplexNumbers c2)
	{
		this.real=this.real*c2.real+this.img*c2.img;
		this.img=this.real*c2.img+c2.real*this.img;
	}
	
	void print()
	{
		System.out.println(this.real+"+ i"+this.img);
	}
}
public class Oops1 {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			int real1 = s.nextInt();
			int imaginary1 = s.nextInt();

			int real2 = s.nextInt();
			int imaginary2 = s.nextInt();

			ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
			ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

			int choice = s.nextInt();
			 
			if(choice == 1) {
				// Add
				c1.plus(c2);
				c1.print();
			}
			else if(choice == 2) {
				// Multiply
				c1.multiply(c2);
				c1.print();
			}
			else {
				return;
			}
		}

}
