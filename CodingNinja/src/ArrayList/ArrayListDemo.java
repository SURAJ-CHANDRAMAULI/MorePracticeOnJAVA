package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		//capacity is 10
		//but size is 0 now
		System.out.println(l1.size());
		l1.add(1);
		l1.add(2);  // to add number
		l1.add(3);
//		System.out.println(l1.size()+" "+l1.get(1));
//		// get function to get the number at any index
//		l1.add(1,50);  // to add number at particular index 
//		//l1.set(1,50);
//		System.out.println(l1.get(1));
//		l1.remove(2);
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+" ");
		System.out.println();
		for(int arr : l1) {
			System.out.print(arr+" ");
		}
	}

}
