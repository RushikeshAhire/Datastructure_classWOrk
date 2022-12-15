package example.queue;

import java.util.Scanner;

class QueueLL{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node f=null;
	Node r=null;
	
	public void enqueue(Scanner sc)
	{
		int data=sc.nextInt();
		Node new_node= new Node(data);
		if(f==null)
		{
			f=new_node;
			r=new_node;
		}
		else
		{
			r.next=new_node;
			r=new_node;
		}
		
	}
	public void dequeue() {
		if(f==null) {
			System.out.println("underflow");
		}
		else
		{
			f=f.next;
		}
	}
	public void display() {
		
		Node temp=f;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}





public class queueLL {

	public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		 QueueLL lq=new  QueueLL();
		do {
			System.out.println("\n1.Enqueue\t2.dequeue\t3.display");
			int d=sc.nextInt();
			switch(d)
			{
			case 1:lq.enqueue(sc);
				break;
			case 2:lq.dequeue();
				break;
			case 3:lq.display();
				break;
			}
			System.out.println("Adding data press 0");
		l=sc.nextInt();	
			} while(l==0);
		
	}
}
