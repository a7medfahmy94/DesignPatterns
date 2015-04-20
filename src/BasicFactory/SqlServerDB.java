package BasicFactory;

public class SqlServerDB implements DBConnection {

	@Override
	public String description() {
		return "SqlServer";
	}

}
