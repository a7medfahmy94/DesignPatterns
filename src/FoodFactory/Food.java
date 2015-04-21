package FoodFactory;

public abstract class Food {
	protected String name;
	protected Double price;
	public Food(String name, double price) {
		this.name=name;
		this.price=price;
	}

	
	public String toString(){
		return name;
	}
}
