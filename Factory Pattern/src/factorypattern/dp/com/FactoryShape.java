package factorypattern.dp.com;

public class FactoryShape {
	
	public shapeparent getShape(String shapeType){
    if(shapeType == null){
        return null;
     }		
     if(shapeType.equalsIgnoreCase("CIRCLE")){
        return new Circle();
        
     }
     else if(shapeType.equalsIgnoreCase("TRIANGLE")){
        return new Triangle();
        
     } 
     else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new Square();
     }
     else
     {
    	 return null;
     }
     
  }
}