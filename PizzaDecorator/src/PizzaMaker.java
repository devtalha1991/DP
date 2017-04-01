public class PizzaMaker {

public static void main(String[] args){

Pizza basicPizza = new Mozzarella(

new Mozzarella(
new PlainPizza()));
System.out.println("Ingredients: " + basicPizza.getDescription());
System.out.println("Price: " + basicPizza.getCost());
}
}
//End of Decorator	}