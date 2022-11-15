package doublyLinkedList;



public class DoubbleyLinkedList {
	public static void main(String[] args) {
	
	MySong ms1= new MySong("Zingat","Sairat","Ajay_Atul",1995);
	MySong ms2= new MySong("tanhaya","dil chalta hey","Sonu nigam",1995);
	MySong ms3= new MySong("tadipar","tadipar","mc",2020);
	MySong ms4= new MySong("Just Do iT","CDAC","MYSELF",222);
	MySong ms5= new MySong("My Heart Will Go on","Titanic","Celline",1995);
	
	 DoublyLinkedList1 dlist=new  DoublyLinkedList1();
     	dlist.showAllSongs();
     	dlist.addSong(ms1);
     	dlist.addSong(ms2);
     	dlist.addSong(ms3);
     	dlist.addSong(ms4);
     	dlist.addSong(ms5);
     	
     	dlist.showAllSongs();
     	dlist.deleteSong();
     	dlist.showAllSongs();
     	dlist.DeleteAll(ms3);
     	dlist.showAllSongs();
     	
    
	}
}
class MySong{
	
	
	String title;
	String album;
	String artist;
	int year;
	
	MySong prev;
	MySong next;
	
	public MySong(String title, String album, String artist, int year) {
		
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}

	@Override
	public String toString() {
		return "MySong [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
}
class DoublyLinkedList1
{
	MySong Start=null,ptr;
	MySong prev;
	MySong next;
	
	void addSong(MySong newSong) {
		if(Start==null) {
			System.out.println("juke Box is Empty.");
			Start=newSong;
		Start.prev=null;
		Start.next=null;
	System.out.println("Added th first Song..");	
		
	}
	
	else if(Start.next==null)
	{
		Start.next=newSong;
		newSong.prev=Start;
		newSong.next=null;
		System.out.println("Added the Secound Song");
		
	}
	else {
		ptr=Start.next;
		while(ptr.next!=null) {
			ptr=ptr.next;
			
		}
		ptr.next=newSong;
			newSong.prev=ptr;
			newSong.next=null;
			System.out.println("Added Internal Song.");
		
		}
		
	}
	void showAllSongs() {
		if(Start==null) {
			System.out.println("Juke box is Empty.");
		}
		else {
			ptr=Start;
			while(ptr!=null) {
				System.out.println("Data: "+ptr);
				System.out.println("-----------------------------------------");
				ptr=ptr.next;
				
			}
		}
	}
	void deleteSong()//DELETE FIRST
	{
		
	
		if(Start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else {
			System.out.println("First Song is deleted.");
			if(Start!=null) {
				if(Start.next==null) {
					prev=null;
					next=null;
				}
				else {
					Start.next.prev=null;
					Start=Start.next;
				}
			}
			
		}
}     //DLETE ANY SONG
	void DeleteAll(MySong newSong) {
		
		if(Start==null) {
			System.out.println("List is empty..nothing to delete");
		}
		else {
			
			if(Start==newSong) {
				Start=newSong.next;
				
			}
			if(newSong!=null) {
				newSong.prev.next=newSong.next;
				
			}
			System.out.println("Song node is deleted");
	return;
	}

}
	
	//INSERTING SONG
	
}
	
	
		

