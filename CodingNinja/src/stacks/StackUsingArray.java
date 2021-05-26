package stacks;

public class StackUsingArray {

	private int data[];
	private int topIndex;  
	
	public StackUsingArray() {
		data = new int[10];
		topIndex=-1;
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		topIndex=-1;
	}
	
	public boolean isEmpty() {
		return (topIndex==-1);
	}
	
	public int size() {
		return topIndex+1;
	}
	
	public int top() throws StackEmptyException{
		
		if(topIndex<0) {
			
		StackEmptyException e = new StackEmptyException();
		throw e;
		
		}
		return data[topIndex];
	}
	
	public void push(int elem) throws StackFullException  {
	
		if(topIndex+1==data.length) {
			
//			StackFullException e = new StackFullException();
//			throw e;
			
			doubleCapacity();
					
					
		}
		topIndex++;
		data[topIndex]=elem;
	}
	
	private void doubleCapacity() {
		
		int temp[] =data;
		data = new int[2*temp.length];
		
		for(int i = 0 ;i<temp.length;i++)
			data[i]=temp[i];
		
		
	}

	public int pop() throws StackEmptyException{
		
		if(topIndex<0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		
		
        int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	
}
