package example.stack;

import java.util.Scanner;

class Stack_LL
{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	Node top=null;
	void push(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data");
		int data=sc.nextInt();
		Node newNode=new Node(data);
		if(top==null) 
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
		
		
	}
	void pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		else
		{
			top=top.next;
		}
		
	}
	void display() {
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}



public class Stack_Linkedlist {
	public static void main(String[] args) {
		
		Stack_LL sl=new Stack_LL();
		sl.push();
		sl.push();
		sl.display();
		sl.pop();
		sl.display();
	}

}
