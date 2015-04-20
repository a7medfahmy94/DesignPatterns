package BasicFactory;

public class BasicFactory {
	public DBConnection createConnection(String type){
		if(type.equals("MySql")){
			return new MySqlDB();
		}else if(type.equals("Oracle")){
			return new OracleDB();
		}else {
			return new SqlServerDB();
		}
	}
}
