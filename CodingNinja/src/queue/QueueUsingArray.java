package queue;

public class QueueUsingArray {
	
	int data[];
	int rear;
	int front;   //index at which rear element is stored
	int size;
	
	QueueUsingArray(){
		data = new int[10];
		front =-1;
		rear=-1;
		size=0;
	}
	QueueUsingArray(int capacity){
		data = new int[capacity];
		front =-1;
		rear=-1;
		size=0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	int front() throws QueueEmptyException{
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	void enqueue(int elem)throws QueueFullException {
		if(size==data.length) {
		doubleCapacity();	
		
		//throw new QueueFullException();
		}
		if(size==0) 
			front =0;
		
		size++;
//		rear++;
		
		rear=(rear+1)%data.length;
//		if(rear==data.length)
//			rear=0;
		data[rear]= elem;
		
		
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[]=data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
			data[i]=temp[i];
		rear=temp.length-1; 
	}
	int dequeue() throws QueueEmptyException{ 
		if(size==0)  {
			throw new QueueEmptyException();
		}
	
		int temp = data[front];
		front=(front+1)%data.length;
//		if(front==data.length)
//			front=0;
//		front++;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
	

}
