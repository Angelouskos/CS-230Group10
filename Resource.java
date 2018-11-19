import java.util.LinkedList; 
import java.util.Queue; 

public class Resource {
	protected int id ;
	protected String title ;
	protected int year;
	protected String thumbnail;
	protected int numCopies;
	protected int availableCopiesNum;
	//protected Queue<User> requestQ = new LinkedList<>();
	
	public Resource (int id, String title , int year, String thumbnail ) {
		this.id= id;
		this.title= title;
		this.year=year;
		this.thumbnail=thumbnail;
		//to-do add numcopies and availablecopies
	}
	
	public  void setID (int id) {
		this.id=id;
	}
	public  void setTitle (String title) {
		this.title=title;
	}
	public  void setYear (int year) {
		this.year=year;
	}
	public  void setThumbnail (String thumbnail) {
		this.thumbnail=thumbnail;
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
}
