package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
	
	public static class ModelType {
		public static final String MOVIE = "Movie";
		public static final String ALBUM = "Album";
		public static final String STAGESHOW = "StageShow";
	}
	
	private static Map<String,PrototypeCapable> prototypes = new HashMap<String,PrototypeCapable>();
	
	static {
		prototypes.put(ModelType.MOVIE,new Movie());
		prototypes.put(ModelType.ALBUM,new Album());
		prototypes.put(ModelType.STAGESHOW,new StageShow());
	}
	
	public static PrototypeCapable getInstance(String type) throws CloneNotSupportedException{
		return ((PrototypeCapable)prototypes.get(type)).clone();
	}

}
