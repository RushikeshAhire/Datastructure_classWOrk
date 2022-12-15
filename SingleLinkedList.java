package example.LinkedList;

import java.util.Scanner;

class SingleLinkedList{
	  
	Node head;

	
	
	public void createAnode(int data)
	{
		Node newNode=new Node(data);
		System.out.println("Making a New Node.");
		if(head==null) {
			head=newNode;
			return;
		}else {
		 
		newNode.next=head;
		head=newNode;
		}
	
				
	}
	public void AddOpertaionsonNode( int data)
	{
		Scanner sc=new Scanner(System.in);
		//using Switch Add Node 
		//At begining
		//At Last
		//At Specific position
		System.out.println("please select the number were you want the data");
		System.out.println("1.Additing Data At First position.\n2.Adding Data At Last position. \n3.Adding Data At Specific position. ");
		int n=sc.nextInt();
		switch(n)
		{
		case 1://Adding Data at First position.
				Node newNode=new Node(data);
				System.out.println("Making a New Node.");
					if(head==null) 
					{
							head=newNode;
							return;
					}
					else 
					{
					newNode.next=head;
					head=newNode;
					}
					break;
		case 2: //Adding Data At Last position.
				Node newNode1=new Node(data);
				System.out.println("Making a New Node.");
					if(head==null) 
					{
						head=newNode1;
						return;
					}
					else 
					{
						Node current=head;
						while(null!=current.next) {
							current=current.next;
							
						}
						current=newNode1;
					}			
						break;
		
		case 3://Adding Data At Specific Position.
			break;
		case 4:
			break;
			default: System.out.println("Plese select the Valid number");
		}
		
		
	}
	public void deleteOperationsonNode()
	{
		//using Switch
		//Delete Node At First
		//delete Node at Last
		//delete Node at Specific position
		
	}
	public void Search() 
	{
		//Search Node
	}
	public void print()
	{
	//print The All node
		Node currentNode=head;
		if(currentNode==null)
		{
			System.out.println("List Is Empty..");
			return;
		}
		while(currentNode!=null)
			{
				System.out.print(" --> "+currentNode.data);
				currentNode=currentNode.next;
			 }
			System.out.println(" -->  null");
			
		
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList sl= new SingleLinkedList();
		sl.createAnode(10);
		sl.createAnode(20);
		sl.createAnode(30);
		sl.createAnode(40);
		sl.print();
		System.out.println();
		
		
	}
	

class Node{
	 int data;
	Node next;
	
	 Node(int data) {
	
		this.data = data;
		this.next = null;
	
	}
	
}
}