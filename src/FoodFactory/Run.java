package FoodFactory;

import java.util.Scanner;

public class Run {
	public static void run() {
		MealFactory factory = new MealFactory();
		factory.register("Pizza", Pizza.class);
		factory.register("Chicken", Chicken.class);
		factory.register("Fries", Fries.class);
		factory.register("Salad", Salad.class);
		
		Scanner in = new Scanner(System.in);
		String order;
		
		System.out.println("1-Pizza");
		System.out.println("2-Chicken");
		order = in.nextLine();
		System.out.println("1-Salad");
		System.out.println("2-Fries");
		order += " " + in.nextLine();

		Food meal;
		try{
			meal = factory.getMeal(order);
			System.out.println(meal);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}