package linkedList;
import java.util.*;
public class Node<T>{
	T data;
Node<T> next;
	
	Node(T data){
   this.data=data;
  next=null;
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
//		Node<Integer> temp = head;
//			while(temp.next!=null)
//			{
//				temp=newnode;
//			}
//			temp.next=newnode;
		tail.next=newnode;
		tail=newnode;   //tail=tail.next;
		}
		data=s.nextInt();
				
		}
		return head;
		}
		
public  static Node<Integer> insert(Node<Integer> head, int data,int pos){
Node<Integer> newNode = new Node<>(data);
  int count=0; 
  Node<Integer> temp = head;
  if(pos==0)
  {
	  
	  newNode.next=temp;
	  
	  return newNode;
  }
while(count<pos-1)
{
	temp=temp.next;
		count++;
}
newNode.next=temp.next;
temp.next=newNode;
return head;
	}

public static Node<Integer> delete(Node<Integer> head,int pos){
	Node<Integer> temp = head;
	int count=0;
	  if(pos==0)
	  {
		  
		 head=temp.next;
		  
		  return head;
	  }
	while(count<pos-1) {
		temp=temp.next;
		count++;
	}
	temp.next=temp.next.next;
	
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

}
