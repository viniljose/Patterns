package creational.prototype;

public class Movie implements PrototypeCapable {
	private String name =null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Movie clone () throws CloneNotSupportedException{
		return (Movie)super.clone();
	}
	
	public String toString(){
		return "Movie";
	}

}
