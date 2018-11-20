import java.util.LinkedList; 
import java.util.Queue; 

public class Resource {
	protected int id ;
	protected String title ;
	protected int year;
	protected String thumbnail;
	protected int numCopies;
	protected int availableCopiesNum;
//	protected Queue<User> requestQ = new LinkedList<>();
	
	public Resource (int id, String title , int year, String thumbnail ) {
		this.id= id;
		this.title= title;
		this.year=year;
		this.thumbnail=thumbnail;
		//to-do add numcopies and availablecopies
	}
	
	public  void setID (int id) {
		this.id=id;
		this.update();
	}
	public  void setTitle (String title) {
		this.title=title;
		this.update();
	}
	public  void setYear (int year) {
		this.year=year;
		this.update();
	}
	public  void setThumbnail (String thumbnail) {
		this.thumbnail=thumbnail;
		this.update();
	}
	
	public  int getID () {
		return this.id;
	}
	public  String getTitle () {
		return this.title;
	}
	public  int getYear () {
		return this.year;
	}
	public  String getThumbnail () {
		return this.thumbnail;
	}
	
//	public void addToQueue (User a) {
//	}
	
	public void removeFromQueue () {
	}
	
	public int checkQueue () {
		return 0;
	}
	
	public Resource peekQueue() {
		return null;
	}
	
	public void update () {
	}
	
	public void create () {
	}
	
	public void delete () {
	}
}
