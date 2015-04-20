package BasicFactory;

public class OracleDB implements DBConnection {

	@Override
	public String description() {
		return "Oracle";
	}

}
