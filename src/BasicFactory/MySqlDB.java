package BasicFactory;

public class MySqlDB implements DBConnection {

	@Override
	public String description() {
		return "MySql";
	}

}
