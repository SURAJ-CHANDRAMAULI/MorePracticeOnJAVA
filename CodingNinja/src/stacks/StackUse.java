package stacks;

import linkedList.StackUsingLL;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
StackUsingLL<Integer> stack = new StackUsingLL<>();
stack.push(5);
stack.push(7);
stack.push(11);
System.out.println(stack.size());
System.out.println(stack.isEmpty());
while(!stack.isEmpty()) {
	System.out.print(stack.pop()+" ");
	
}
System.out.println();
System.out.println(stack.size());
System.out.println(stack.isEmpty());

   
//   for(int i=1 ;i<=5;i++)
//	stack.push(i);
//
//while(!stack.isEmpty()) {
//		try {
//			System.out.println(stack.pop());
//		}catch(StackEmptyException e) {
//	}
//
//  }
}

	
}
