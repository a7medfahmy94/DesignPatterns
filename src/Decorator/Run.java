package Decorator;

public class Run {
	public static void run(){
		System.out.println("Decroator Design Pattern Start:");

		ComputerInterface computer = new Computer();

		System.out.println("Created a computer");
		System.out.println(computer.description());

		computer = new DiskDecorator(computer);
		System.out.println("Added a disk");
		System.out.println(computer.description());

		computer = new MonitorDecorator(computer);
		System.out.println("Added a monitor");
		System.out.println(computer.description());

		System.out.println("Decroator Design Pattern Finish.\n");
	}
}
