package example.Linkedlist;

public class LinkedList {

	public static void main(String[] args) {
		
		Kite k1=new Kite("Red","Rushi",50,true);
		Kite k2=new Kite("Blue","Adnan",70,true);
		Kite k3=new Kite("Green","Asif",60,true);
		
		
		
		k1.next=k2;
		k2.next=k3;
		
		System.out.println("k1: "+k1);
		System.out.println("k2: "+k1.next);
		System.out.println("k3: "+k1.next.next);
		
		
		System.out.println("------------------------------------------------");
		
		System.out.println("K1:"+k1.next.hashCode());
		System.out.println("K2:"+k2.next.hashCode());
		System.out.println("K3:"+k3.next);
		
		System.out.println("------------------------------------------------");
		
		
		System.out.println("K1:" +k1);
		System.out.println("K2:" +k2);
		System.out.println("K3:" +k3);
		
		
		System.out.println("K1:"+k1.hashCode());
		System.out.println("K2:"+k2.hashCode());
		System.out.println("K3:"+k3.hashCode());
		

}


}
class Kite{
	String color;
	String owner;
	int length;
	boolean flying;
	Kite next;//self refrencial structure
	
	public Kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
	}

	@Override
	public String toString() {
		if(next!=null)
		return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ",\n next="
				+ next+ "]";
	
		else
			return null;
	
	}

}
