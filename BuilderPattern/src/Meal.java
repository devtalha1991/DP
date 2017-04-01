import java.util.ArrayList;
import java.util.List;

public class Meal {
	
		   private List<Item> Items = new ArrayList<Item>();	

		   public void addItem(Item item){
		      Items.add(item);
		   }

		   public float getCost(){
		      float cost = 0.0f;
		      
		      for (Item item : Items) {
		         cost += item.Price();
		      }		
		      return cost;
		   }

		   public void showItems(){
		   
		      for (Item item : Items) {
		         System.out.print("Item : " + item.Name());
		         System.out.print(", Packing : " + item.Packing().Pack());
		         System.out.println(", Price : " + item.Price());
		      }		
		   	
	
	
	
	
	
	
		   }
		   }
