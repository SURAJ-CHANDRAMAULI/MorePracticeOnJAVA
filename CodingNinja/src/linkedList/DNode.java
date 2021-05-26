package linkedList;

import java.util.Scanner;

public class DNode<T> {
	T data;
	DNode<T> next;
	DNode<T> pre;
	
	DNode(T data){
		this.data=data;
		next=null;
		pre=null;
	}
	
	public static DNode<Integer> takeInput(){
		
		DNode<Integer> head=null,tail=null;
		Scanner s = new Scanner(System.in);
		
		int data = s.nextInt();
		
		while(data!=-1) {
			DNode<Integer> newnode = new DNode<>(data);
		if(head==null) {
			head = newnode;
			tail=newnode;
		}
		else
		{
         newnode.pre=tail;
		tail.next=newnode;
		tail=newnode;   //tail=tail.next;
		}
	
		data=s.nextInt();
				
		} 
		
			
		tail.next=head;
		head.pre=tail;
		
		return head;
		
		
	}
	
	public  static  void print(DNode<Integer> head) {
		DNode<Integer> temp = head;
		while(temp !=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			}
		System.out.println(); 
	}
	
	public static void main(String[] args) {
		
		DNode<Integer> head = takeInput();
		//print(head);
		System.out.print(head.pre.data);
		
		
	}

}
