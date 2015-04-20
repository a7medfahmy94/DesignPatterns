package Decorator;

public abstract class ComputerDecorator implements ComputerInterface{
	protected ComputerInterface computer;
	public ComputerDecorator(ComputerInterface com){
		computer = com;
	}
}
