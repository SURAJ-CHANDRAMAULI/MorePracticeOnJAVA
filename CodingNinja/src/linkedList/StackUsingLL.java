package linkedList;

import stacks.StackEmptyException;

public class StackUsingLL<T> {

	private Node<T> head;
	private int size;
	
	
	public StackUsingLL() {
		head = null;
		size = 0;
		
	}
	
	public int size() {
	return size;
	}
	
	T top() throws StackEmptyException{
		
		if(size==0)
		{
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	
	public void push(T element) {
		Node<T> newnode = new Node<>(element);
	newnode.next=head;
		head=newnode;
		size++;
		
	}
	
	public T pop() throws StackEmptyException{
		if(size==0)
			throw new StackEmptyException();
		Node<T> temp=head;
		head=head.next;
		size--;
		return temp.data;
	}
	
	
	
}
