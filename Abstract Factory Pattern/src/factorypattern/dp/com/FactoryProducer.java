package factorypattern.dp.com;

public class FactoryProducer {
	   public static AbstractFac getFactory(String choice){
	   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new FactoryShape();
	         
	      }
	      else if(choice.equalsIgnoreCase("COLOUR")){
	         return new ColourFac();
	      }
	      else
	      {
	      return null;
	      }
	   }
}