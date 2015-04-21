package Singleton;

public class SingletonClass {
	private static SingletonClass onlyInstance = new SingletonClass();
	private SingletonClass() {}
	
	public static SingletonClass getInstance(){
		return onlyInstance;
	}
}
