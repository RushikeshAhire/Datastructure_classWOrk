package example.Linkedlist;

public class linkedlistAddAtfirst {
	
		public static void main(String[] args) {
			
			Kite k1=new Kite("Red","Rushi",50,true);
			Kite k2=new Kite("Blue","Adnan",70,true);
			Kite k3=new Kite("Green","Asif",60,true);
			
			
			MyLinkedList1 ml=new MyLinkedList1();
			ml.showList();
			
			ml.add(k1);
			ml.add(k2);
	        ml.add(k3);	
	        ml.showList();
	        
	        
	        Kite k4=new Kite("White","umer",78,true);
	        ml.Addfirst(k4);
	        System.out.println("______________________");
	        ml.showList();
	        
			/*
	         LinkedList myList1 = new LinkedList();
	        
			myList1.
			myList1.add(k2);
			myList1.add(k3);
			
			
			Iterator iter =  myList1.iterator();
			while(iter.hasNext()) {
				Kite k = (Kite) iter.next();
				System.out.println("k "+k);
			}*/
	        
		}

}
	class MyLinkedList1
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
		
		
		void Addfirst(Kite newKite) {
			if(Start!=null) {
				System.out.println("This lite is added at the beginning of the Linkedlist");
				newKite.next=Start;
				Start=newKite;
			}
			else
			{
				while(ptr!=null) {
					System.out.println("Searching...");
					prev=ptr;
					ptr=ptr.next;
					
						
				}
				prev.next=newKite;
				newKite.next=null;
			}
				
			
			}
		
		
		  
		
		
		
		
		void add(Kite newKite) {
			if(Start==null) {
			Start=newKite;
			Start.next=null;
		}
			else {
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
	
	
	//the height of your success cannot exceed the height of your personal development
	//you cannot decide your future but you can decide your habit and your habit will decide your future
	//habit=neural network
	
	
	//