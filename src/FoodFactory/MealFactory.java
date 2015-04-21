package FoodFactory;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class MealFactory {
	HashMap<String, Class> catalog;
	
	public MealFactory(){
		catalog = new HashMap<String, Class>();
	}
	
	public void register(String s,Class c){
		catalog.put(s, c);
	}
	
	public Meal getMeal(String order) throws Exception{
		Meal ret ;
		String meal = order.split(" ")[0];
		String sideMeal = order.split(" ")[1];
		Class mealClass = catalog.get(meal);
		Class sideMealClass = catalog.get(sideMeal);
		
		if(mealClass == null)return null;
		Constructor mealConst = mealClass.getConstructors()[0];
		
		ret = (Meal) mealConst.newInstance(200);
		if(sideMealClass == null){
			return ret;
		}else{
			Constructor sideConst = sideMealClass.getConstructors()[0];
			ret.addSideMeal((SideMeal)sideConst.newInstance(200));
		}
		return ret;
	}
}
