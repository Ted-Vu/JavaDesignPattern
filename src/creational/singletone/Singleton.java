package creational.singletone;

// Lazy instantiation 
public final class Singleton {

	private static volatile Singleton instance = null;
	private String value;

	// Making constructor private to control the object initialization process
	private Singleton(String value) {
		this.value = value;
	}
	
	// Implementing singleton with locking, this can ensure thread-safe but 
	// is not an efficient method
	public synchronized static Singleton getInstanceLocking() {
		if(instance==null) {
			instance = new Singleton("This is an instance");
		}
		return instance;
	}
	
	private static class LazyHolder {
			static final Singleton INSTANCE = new Singleton("This is a singleton");
	}
	
	
	// Implementing singleton with lazy initialization or initialization on demand
	// class LazyHolder will NOT be initialized until the actual call of this method,
	// According to Java Language Specification class initialization is guaranteed to be 
	// sequential and thread-safe. 
	public static Singleton getInstanceLazyHolder() {
		return LazyHolder.INSTANCE;
	}

	
}
