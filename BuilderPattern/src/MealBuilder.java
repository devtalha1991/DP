
public class MealBuilder {

	
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
	   
	   public Meal prepareMidNightMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new VegBurger());
		      meal.addItem(new CheeseBurger());
		      meal.addItem(new Coke());
		      meal.addItem(new Dew());
		      return meal;
		   }   

		   public Meal prepareFamilyPackMeal (){
		      Meal meal = new Meal();
		      meal.addItem(new ChickenBurger());
		      meal.addItem(new ChickenBurger());
		      meal.addItem(new CheeseBurger());
		      meal.addItem(new CheeseBurger());
		      meal.addItem(new BeefBurger());
		      meal.addItem(new BeefBurger());
		      meal.addItem(new Pepsi());
		      meal.addItem(new Dew());
		      meal.addItem(new Coke());
		      meal.addItem(new Coke());
		      return meal;
		   }
		   
}
