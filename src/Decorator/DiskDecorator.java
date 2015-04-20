package Decorator;

public class DiskDecorator extends ComputerDecorator {
	public DiskDecorator(ComputerInterface com) {
		super(com);
	}
	@Override
	public String description() {
		return computer.description() + " and a disk";
	}

}
