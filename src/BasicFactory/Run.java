package BasicFactory;

public class Run {
	public static void run(){
		System.out.println("Basic Factory BEGIN:");
		BasicFactory factory = new BasicFactory();
		DBConnection connection ;
		connection = factory.createConnection("SqlServer");
		System.out.println(connection.description());
		connection = factory.createConnection("MySql");
		System.out.println(connection.description());
		connection = factory.createConnection("Oracle");
		System.out.println(connection.description());
		System.out.println("Basic Factory END\n");
	}
}
