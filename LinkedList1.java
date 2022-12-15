package example.LinkedList;

public class LinkedList1
{
	public Node head;
	private int size;
	

	void LinkedList1()
	{
		
		this.size =0;
	}


	public static void main(String[] args)
	{
		LinkedList1 MyList=new LinkedList1();
		MyList.addFirst("Rushikesh"+"Sunil"+"Ahire ");
		MyList.addFirst("Ahire");
		MyList.addFirst("Mcs");
		MyList.print();
	MyList.deletFirst();
		MyList.print();
		MyList.deletLast();
		MyList.print();
		System.out.println();

	}
	


class Node{
   String data;
	 Node next;
	
	 Node(String data)
	  {
		 this.data=data;
		 this.next=null;
		 size++;
		}
}

public void addFirst(String data)
{
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
	
}
public void deletFirst()
{
	if(head==null) {
		System.out.println("Already List is Empty Empty List cant be Delete:");
		return;
	}
	size--;
	head=head.next;
	System.out.println("Your First List is deleted from your Linked List");
	
	
}
public void deletLast()
{
	if(head==null) {
		System.out.println("Already List is Empty Empty List cant be Delete:");
		return;
	}
	size--;
	if(head.next==null) {
	System.out.println("Your First List is deleted from your Linked List");
	return;
	}
	Node LastNode=head.next;
	Node SecoundLast=head;
	while(LastNode.next!=null) {
		LastNode=LastNode.next;
		SecoundLast=SecoundLast.next;
	}
    SecoundLast.next=null;
    System.out.println(" Delete Last List ");
	
}


public void  print() {
	Node cuurNode=head;
	if(cuurNode==null) {
		System.out.println("List is Empty.....");
		return;
	}
	while(cuurNode!=null) {
		System.out.println(cuurNode.data);
		cuurNode=cuurNode.next;
		}
	System.out.println("Null");
	
	
	
}
}