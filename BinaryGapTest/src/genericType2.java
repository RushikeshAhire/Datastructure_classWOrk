
public class genericType2 {

	public static void main(String[] args) {
		
		Myclass<Integer> mc=new Myclass<Integer>(10 ,  20);
		mc.print();
		mc.swap();
		mc.print();
		System.out.println("-----------------------------------------");
		Myclass<Float> mc1=new Myclass<Float>(20.05f,50.0f);
		mc1.print();
		mc1.swap();
		mc1.print();
		System.out.println("-----------------------------------------");
		
		Song s1=new Song("xyz","abc","qwe",2016);
		Song s2= new Song("rty","dfg","hjk",2017);
		Myclass<Song> jukebox=new Myclass<Song>(s1,s2);
		jukebox.print();
		jukebox.swap();
		jukebox.print();
		
		

	}

}
class Myclass<AnyType>
{
	
		AnyType x;
		AnyType y;
		
		Myclass(AnyType x,AnyType y){
			this.x=x;
			this.y=y;
		}
		void print() {
			System.out.println("X "+x);
			System.out.println("Y "+y);
			
		}
		void swap() {
			System.out.println("Sawapping......"+x.hashCode()+","+y.hashCode());
			AnyType temp=x;
			x=y;
			y=temp;
			System.out.println("Swapped.....");
			
		}
}	

	
class Song{
	String title;
	String album;
	String artist;
	int year;
	
	public Song(String title, String album, String artist, int year) {
		
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
		
		
	}

	@Override
	public String toString() {
		return "song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
}


