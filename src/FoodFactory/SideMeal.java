package FoodFactory;

public abstract class SideMeal extends Food{

	public SideMeal(String name, double price) {
		super(name, price);
	}
	
	public String toString(){
		return name;
	}

}
