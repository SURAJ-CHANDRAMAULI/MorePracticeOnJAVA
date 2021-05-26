package generics;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pair<Character,Integer> p = new Pair<>('R',2*3);
     // p.setfirst("Maui");
      //p.setsecond("Krishna ");
      System.out.println(p.getfirst()+" "+p.getsecond());
      Pair<Integer,String> p2 = new Pair<>(8,"hello");
     // p2.getfirst();
     // p2.getsecond();
      System.out.println(p2.getfirst()+" "+p2.getsecond());
      Pair<String,String> p3 = new Pair<>("Chandra","Mauli");
      //p3.getfirst();
      //p3.getsecond();
      System.out.println(p3.getfirst()+" "+p3.getsecond());
      
      
      int a=10;
      int b=20;
      int c=30;
      Pair<Integer,Integer> internalpair = new Pair<>(a,b);
      
      Pair<Pair<Integer,Integer>,Integer> p4 = new Pair<>(internalpair,c);
      System.out.println(p4.getfirst().getfirst()+" "+p4.getfirst().getsecond()+" "+p4.getsecond());
	}

}
