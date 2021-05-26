package oops;

class Fraction {
	
private int num;
private int den;

public Fraction(int num,int den)
{
this.num=num;

this.den=den;

simplify();
}

public int getnum(){
	return num;
	
}
public void setnum(int n) {
	this.num=n;
	simplify();
}
public int getden() {
	return den;
}

public void setden(int d) throws ZeroDenException{
	if(den==0) {
		ZeroDenException e = new ZeroDenException();
		throw e;
	}
		
	this.den=d;
	simplify();
}
private void simplify()
{
	int gcd=1;
   for(int i=1;i<=Math.min(num, den)/2;i++) {
	   
	   if(num%i==0 && den%i==0)
	   {
		   gcd=i;
	   }
   }
	   this.num=this.num/gcd;
	   this.den=this.den/gcd;
	   
   }
   
   public void add(Fraction f2)
   {
	   this.num=this.num*f2.den+this.den*f2.num;
	   this.den=this.den*f2.den;
	   simplify();
   }
   public void multiply(Fraction f2)
   {
	   this.num=this.num*f2.num;
	   this.den=this.den*f2.den;
	   simplify();
   }
   public static Fraction add(Fraction f1, Fraction f2) 
   {
	 
	   int newnum=f1.num*f2.den+f1.den*f2.num;
	   int newden=f1.den*f2.den;
	   Fraction f3 = new Fraction(newnum,newden);
	   return f3;
   }
   void print() 
   {
	   System.out.println(num+"/"+den);
   }
}
 class ZeroDenException extends Exception
 {
	 
 }


class Main1 {
 public static void temp() throws ZeroDenException
 {
	Fraction f1=new Fraction(3,4);
	Fraction f2=new Fraction(6,10);
	//Fraction f3 = new Fraction(11,33);
	f1.add(f2);
	try {
	f1.setden(0);
	}
	catch(ZeroDenException e)
	{
		System.out.println("hey dont set denominator=0");
	}
	finally {
		int i=10;
	}
	f1.print();
	f1.multiply(f2);
	Fraction.add(f1,f2);
	
 }

}