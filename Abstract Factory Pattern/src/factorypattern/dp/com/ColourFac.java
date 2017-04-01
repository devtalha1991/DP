package factorypattern.dp.com;

public class ColourFac extends AbstractFac {
	 @Override
	   public Shapeparent getShape(String shapeType){
	      return null;
	 }
	 
	 @Override
	   Colour getColour(String colour) {
	   
	      if(colour == null){
	         return null;
	      }
	      
	      if(colour.equalsIgnoreCase("Yellow")){
	          return new Yellow();
	          
	       }else if(colour.equalsIgnoreCase("Purple")){
	          return new Purple();
	          
	       }else if(colour.equalsIgnoreCase("Black")){
	          return new Black();
	       }
	       
	       return null;
	 }
}
