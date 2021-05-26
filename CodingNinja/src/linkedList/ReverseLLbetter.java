package linkedList;

import java.util.Scanner;

public class ReverseLLbetter {	
	
	
	public static DoubleNode reverseLLbetter(Node<Integer> head){
		
		if(head==null || head.next==null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head; 
			return ans;
		}
		
		DoubleNode smallans = reverseLLbetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		//DoubleNode ans = new DoubleNode();
	smallans.tail=head;
		
		return smallans;
	}

	
	public static Node<Integer>takeInput() {
		Node<Integer> head=null,tail=null;
			Scanner s = new Scanner(System.in);
			
			int data = s.nextInt();
			while(data!=-1) {
				Node<Integer> newnode = new Node<>(data);
			if(head==null) {
				head = newnode;
				tail=newnode;
			}
			else
			{
//			Node<Integer> temp = head;
//				while(temp.next!=null)
//				{
//					temp=newnode;
//				}
//				temp.next=newnode;
			tail.next=newnode;
			tail=newnode;   //tail=tail.next;
			}
			data=s.nextInt();
					
			}
			return head;
			}
	

public  static  void print(Node<Integer> head) {

	Node<Integer> temp = head;
	while(temp !=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
	System.out.println(); 
    }

public static void main(String[] args) {
	
	Node<Integer> head = takeInput();
	DoubleNode ans = reverseLLbetter(head);
	//Node<Integer> headfinal = ans.head;
	print(ans.head);

}

}
