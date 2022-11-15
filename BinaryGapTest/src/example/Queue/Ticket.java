package example.Queue;

public class Ticket {
	public static void main(String[] args) {
		MyQueue MQ=new MyQueue(3);
		
		MQ.add(10);
		MQ.add(20);
		MQ.add(30);
		//MQ.add(40);
		//MQ.add(50);
	
		System.out.println("Remove Element :-"+MQ.remove());
		System.out.println("Remove Element :-"+MQ.remove());
		System.out.println("Remove Element :-"+MQ.remove());
		//System.out.println("Remove Element :-"+MQ.remove());
		//System.out.println("Remove Element :-"+MQ.remove());
	
		
	}

}
class MyQueue{
	int front=-1;
	int index=-1;
	int length;
	int array[];
	
	class MyQueueOverflowException extends RuntimeException{
		MyQueueOverflowException(String str){
			super(str);
			
		}
		
	}
	class MyQueueEmptyException extends RuntimeException{
		MyQueueEmptyException(String str){
			super(str);
			
		}
		
	}
	
	MyQueue(int length) {
		this.length=length;
		array=new int [length];
	}
	void add(int item) {
		if(index> length-2) {
			throw new MyQueueOverflowException("The Queue is overflow:");
			
		}
		System.out.println("Adding Element in Queue: "+item);
		array[++index]=item;
		
	}
	int remove() {
		//if(front >index-1) {
			//throw new MyQueueEmptyException("The Queue is Empty:");
		//}
		//return  array[length - index-- -1];
		return array[++front];
	 
	
}
}
  
