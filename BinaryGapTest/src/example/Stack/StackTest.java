package example.Stack;

public class StackTest {

	public static void main(String[] args) {
		
	MyStack theStack= new MyStack(5);
	
	 theStack.push(10);
	 theStack.push(20);
	 theStack.push(30);
	 theStack.push(40);
	 theStack.push(50);
	 System.out.println("Element of Top is:"+theStack.peek());
	
	
		System.out.println(theStack.pop());
		System.out.println("The top Element is:- "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("The top Element is:- "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("The top Element is:- "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("The top Element is:- "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("The top Element is:- "+theStack.peek());
		

	}

	
	

}
class MyStack{
	int index=-1;
	int size;
	int array[];
	
	
	class MyStackOverflowException extends RuntimeException{
		MyStackOverflowException(String str){
			super(str);
			
		}
		
	}
	class MyStackEmptyException extends RuntimeException{
		MyStackEmptyException(String str){
			super(str);
			
		}
		
	}
	
	MyStack(int size){
		System.out.println("My Stack is created "+size);
		this.size=size;
		array=new int [size];
	}
	void push(int item) {
		System.out.println("Pushing the element "+item);
		if(index==0) {
			throw new MyStackOverflowException("Th array is Overflow....");
		}
		
		array[++index]=item;
		
	}
	int pop() {
		System.out.println("Poping the item ");
	if(index<0) {
		throw new MyStackEmptyException("The Array is Empty...."); 
	}
		return array[ index--];
		
		
	}
int peek() {
		
		return array [index];
	}
}
