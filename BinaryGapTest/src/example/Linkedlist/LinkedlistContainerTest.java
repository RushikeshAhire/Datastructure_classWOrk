package example.Linkedlist;

import java.util.Iterator;

public class LinkedlistContainerTest {

	public static void main(String[] args) {
		
		
		Kite k1=new Kite("Red","Rushi",50,true); 
		Kite k2=new Kite("Blue","Adnan",70,true);
		Kite k3=new Kite("Green","Asif",60,true);
		Kite k4=new Kite("white","sampada",40,true);
		Kite k5=new Kite("Black","Rohan",100,true);
		
		
		MyLinkedList ml=new MyLinkedList();
		ml.showList();
		
		ml.add(k1);
		ml.add(k2);
        ml.add(k3);	
        ml.add(k4);
      //  ml.add(k5);
        ml.showList();
        ml.addBegining(k5);
        ml.showList();
        
        
        }

}
class MyLinkedList
{
	Kite Start;
	Kite ptr;
	Kite prev;
	
	void showList() {
		if(Start==null) {
			System.out.println("LinkedList is empty:");
			
		}
			else 
			{
				System.out.println("LinkedList is not EMPTY..");
				ptr=Start;
				while(ptr!=null) {
				System.out.println("Data "+ptr);
				ptr=ptr.next;
		 }
			
		}
	}
	
	
	
																//Insert node
	void insertKite(String ownerTofind,Kite newKite)
	{
		boolean found=false;
	ptr=Start;
	if(Start==null) {
	System.out.println("List is empty...");
	 
	   }
	else {
		ptr=Start;
		while(ptr!=null) {
			if(ptr.owner.equals(ownerTofind)) {
				found=true;
				break;
			}
		}
		prev=ptr;
		ptr=ptr.next;
	}
	if(found==true) {
		prev.next=newKite;
		newKite=ptr;
		System.out.println("Object Inserted before."+ownerTofind);
	}
	else
	{
		System.out.println("object not found.");
	}
}
	
		
	
																//Searching the object by Length
	void searchKitebyLength(int lengthtosearch) {
		boolean found=false;
		if(Start==null) {
			System.out.println("List is Empty..");
		}
		else
		{
			System.out.println("List is not Empty.");
			ptr=Start;
			while(ptr!=null) {
				if(ptr.length==lengthtosearch) {
					System.out.println("Kite Foud:"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite is not found. of this length:"+lengthtosearch);
			}
		}
	}
	
	
														//Add beginning
	void addBegining(Kite newKite) {
		if(Start!=null) {
			System.out.println("This is added at the begining of te existing list.");
			newKite.next=Start;
			Start=newKite;
		}
		else {
			System.out.println("you are the first kite .");
			Start=newKite;
		}
	}
	
	
									//Delete Node by Owner Name
	
	void deleteNodebyowner(String ownerName) {
		boolean found=false;
		
		if(Start==null) {
			System.out.println("List is empty.");
		}
		else if(Start.owner.equals(ownerName)) {
			prev=Start;
			Start=Start.next;
			prev.next=null;
			System.out.println("Delete owner from the beginning");
		}
		else
		{
			ptr=Start;
			while(ptr!=null) {
				if(ptr.owner.equals(ownerName)) {
					found=true;
					break;
				}
				prev=ptr;
				ptr=ptr.next;
			}
			if(found== true) {
				prev.next=ptr.next;
				System.out.println("Internal Object deleted");
				ptr.next=null;
				ptr=null;
				
			}
			else
			{
				System.out.println("Owner name is not found");
			}
		}
	}
	
	//Delete Kite
	
	void deleteKite(Kite theKite) {
		boolean found=false;
	
		if(Start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else if(Start == theKite) {
			prev = Start;
			Start = Start.next;
			prev.next = null;
			System.out.println("Deleted Kite from the begining...");
		}
		else {
			ptr=Start;//100
			while(ptr!=null)
			{
				if(ptr == theKite) {
					found=true;
					break;
				}
				prev = ptr; //100
				ptr = ptr.next;
			}
			if(found==true) {
				prev.next = ptr.next;
				System.out.println("Internal Object deleted...by Kite reference.");
				ptr.next = null;
				ptr =null;
			}
			else {
				System.out.println("Kite NOT found....");
			}
		
		}
		}
	  

														//Add NodeAt End
	void add(Kite newKite) {
		if(Start==null) {
			System.out.println("Adding first node.");
		Start=newKite;
		//Start.next=null;
	}
		else {
			System.out.println("Adding inserting node.");
			ptr=Start;
			
			while(ptr!=null) {
				System.out.println("Searching...");
				prev=ptr;
				ptr=ptr.next;
				
					
			}
			prev.next=newKite;
			newKite.next=null;
		}
	}
	
}