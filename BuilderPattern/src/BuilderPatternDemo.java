
public class BuilderPatternDemo {
	
		   public static void main(String[] args) {
		   
		      MealBuilder mealBuilder = new MealBuilder();

		      Meal vegMeal = mealBuilder.prepareVegMeal();
		      System.out.println("Veg Meal");
		      vegMeal.showItems();
		      System.out.println("Total Cost: " + vegMeal.getCost());

		      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		      System.out.println("\n\nNon-Veg Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + nonVegMeal.getCost());
		      
		      Meal FamilyPack = mealBuilder.prepareFamilyPackMeal();
		      System.out.println("\n\nFamilyPack Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + FamilyPack.getCost());
		      
		      Meal MidNight = mealBuilder.prepareFamilyPackMeal();
		      System.out.println("\n\nMidNight Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + MidNight.getCost());
		      
		   }
		   
		   
		     
}
