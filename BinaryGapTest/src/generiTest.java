
public class generiTest {
	public static void swap(Integer x,Integer y) {
		System.out.println("Swaping...."+x.hashCode()+","+y.hashCode());
		Integer temp=x;
		x=y;
		y=temp;
		System.out.println("Swapped......");  
	}

	public static void main(String[] args) {
		
	Integer x=10;
	Integer y=20;
	System.out.println("main...."+x.hashCode()+","+y.hashCode());
	System.out.println("X:-"+x);
	System.out.println("Y:-"+y);
	
	swap(x,y);
	System.out.println("X:-"+x);
	System.out.println("Y:-"+y);
		
	

	}

}
