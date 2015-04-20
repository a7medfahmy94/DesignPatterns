package ReflectionFactory;

import java.util.HashMap;

public class ReflectionFactory {
	private HashMap<String, Class> catalog = 
			new HashMap<String, Class>();

	public void register(String id,Class oClass){
		catalog.put(id, oClass);
	}
	
	public DBConnection createConnection(String type){
		Class oClass = catalog.get(type);
		if(oClass == null){
			System.out.println("Not registered\n");
			return null;
		}
		try{
			return (DBConnection)oClass.newInstance();
		}catch(Exception any){
			any.printStackTrace();
			return null;
		}
	}
}
