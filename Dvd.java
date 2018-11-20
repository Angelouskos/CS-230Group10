import java.util.ArrayList;
public class Dvd extends Resource {
	private String director;
	private int runtime ;
	private String language;
	private ArrayList<String> subLanguages ;
	
	public Dvd (int id, String title , int year, String thumbnail , String director , int runtime ,String language ,ArrayList<String> subLanguages) {
		super(id,title,year,thumbnail);
		this.director=director;
		this.runtime=runtime;
		this.language=language;
		this.subLanguages=subLanguages;
	}
	
	public  void setDirector (String director) {
		this.director=director;
		this.update();
	}
	public  void setRuntime (int runtime) {
		this.runtime=runtime;
		this.update();
	}
	public  void setLanguage (String language) {
		this.language=language;
		this.update();
	}
	public  void setSubLanguages (ArrayList<String> subLanguages) {
		this.subLanguages=subLanguages;
		this.update();
	}
	
	public  String getDirector () {
		return this.director;
	}
	public  int getRuntime () {
		return this.runtime;
	}
	public  String getLanguage () {
		return this.language;
	}
	public  ArrayList<String> getSubLanguages () {
		return this.subLanguages;
	}
	
//	public void addToQueue (User a) {
//		this.requestQ.add(a);
//	}
//	
//	public void removeFromQueue () {
//		this.requestQ.remove();
//	}
//	
//	public int checkQueue () {
//		return this.requestQ.size();
//	}
//	
//	public Resource peekQueue() {
//		return this.requestQ.peek();
//	}
	
}
