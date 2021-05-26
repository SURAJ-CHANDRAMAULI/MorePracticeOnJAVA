package trees;


public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	QueueUsingLL(){
		front = null;
		rear = null;
		size =0;
	}
	
   public int size() {
	   return size;
   }
   
   public boolean isEmpty() {
	   return (size==0);
		  
   }
   
   public T front() {
	   return front.data;
   }
   
   public void enqueue(T data) {
	   Node <T> newnode = new Node<>(data);
	      if(front==null){
	            front=newnode;
	            rear=newnode;
	        }
	        else{
	            rear.next = newnode;
	            rear = newnode;
	        }
	   size++;
	   
   }
   
   public T dequeue() throws QueueEmptyException {
	   
	      if(size==0){
	            throw new QueueEmptyException();
	        }
	    	T temp=front.data;
	        if(size==1){
	            front=rear=null;
	            size--;
	            return temp;
	        }
	        else{
	            front = front.next;
	            size--;
	            return temp;
	        }
   
     }
}
