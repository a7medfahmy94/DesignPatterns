package FoodFactory;

import java.util.ArrayList;

public abstract class Meal extends Food{
	protected ArrayList<SideMeal> sideMeals;
	
	public Meal(String name, double price) {
		super(name, price);
		sideMeals = new ArrayList<SideMeal>();
	}
	
	public void addSideMeal(SideMeal s){
		sideMeals.add(s);
	}
	
	
	public String toString(){
		String ret = name;
		for(SideMeal s: sideMeals){
			ret += " " + s.toString();
		}
		return ret;
	}
}
