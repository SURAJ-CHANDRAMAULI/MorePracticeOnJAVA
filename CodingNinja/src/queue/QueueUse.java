package queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException{
		// TODO Auto-generated method stub
QueueUsingLL<Integer> q = new QueueUsingLL<>();
for(int i = 1; i<=5;i++)
	q.enqueue(i);
while(!q.isEmpty())
	System.out.print(q.dequeue()+" ");
	}

}
