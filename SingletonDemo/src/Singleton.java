
public class Singleton {
	private static Singleton singleton=null;

	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getSingleton() {
		if(singleton==null) {
			return new Singleton();
		}
		return singleton;
	}
}
