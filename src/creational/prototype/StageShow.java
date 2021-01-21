package creational.prototype;

public class StageShow implements PrototypeCapable {
	private String name =null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public StageShow clone () throws CloneNotSupportedException{
		return (StageShow)super.clone();
	}
	
	public String toString(){
		return "StageShow";
	}

}
