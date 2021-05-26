package linkedList;

public class LinklistUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Node<Integer> n1 = new Node<>(10);
//		System.out.println(n1.data);
//		System.out.println(n1.next);
		//Node<Integer> n2 = new Node<>(20);
		
//		System.out.println(n2);
//		System.out.println(n1.next);
	
//		while(head !=null) {
//		System.out.println(head.data+" ");
//		head=head.next;
//		}
//		System.out.println();
		Node<Integer> head = Node.takeInput();
		head=Node.delete(head,0);
		
		Node.print(head);
//		Node.print(head);
//		Node.print(head);
	}

}
