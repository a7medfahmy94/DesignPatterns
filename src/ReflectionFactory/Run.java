package ReflectionFactory;

public class Run {
	public static void run(){
		System.out.println("Reflection Factory BEGIN:");

		ReflectionFactory factory = new ReflectionFactory();
		factory.register("SqlServer", SqlServerDB.class);
		factory.register("MySql", MySqlDB.class);
		factory.register("Oracle", OracleDB.class);
		
		DBConnection connection ;
		connection = factory.createConnection("SqlServer");
		System.out.println(connection.description());
		connection = factory.createConnection("MySql");
		System.out.println(connection.description());
		connection = factory.createConnection("Oracle");
		System.out.println(connection.description());
		System.out.println("Reflection Factory END\n");
	}
}
