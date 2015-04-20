package Decorator;

public class MonitorDecorator extends ComputerDecorator {
	public MonitorDecorator(ComputerInterface com) {
		super(com);
	}
	@Override
	public String description() {
		return computer.description() + " and a monintor";
	}

}
