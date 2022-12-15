package example.stack;

import java.util.Scanner;

class Stack{
	int top=-1;
	int size=10;
	int a[]=new int[size];
	void push() {
		if(top==size-1) {
			System.out.println("Stack is overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Data");
			int i=sc.nextInt();
			top++;
			a[top]=i;
			System.out.println("item inserted");
			
		}
		
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack is underflow");
		}
		else
		{
			top--;
			System.out.println("element deleted succefully");
		}
		
	}
	void display() {
		System.out.println("Item's Are:");
		for(int j=top;j>=0;j--) {
			System.out.println(a[j]);
		}
		
	}
}



public class Stack_Array {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Stack s=new Stack();
	s.push();
	s.push();
	s.push();
	s.push();
	s.display();
	s.pop();
	s.display();
	}
}
