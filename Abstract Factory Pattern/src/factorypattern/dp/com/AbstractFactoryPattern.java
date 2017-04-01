package factorypattern.dp.com;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		
		
	      AbstractFac shapeFactory = FactoryProducer.getFactory("SHAPE");
	      
	      Shapeparent shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();
	      Shapeparent shape2 = shapeFactory.getShape("SQUARE");
	      shape2.draw();
	      Shapeparent shape3 = shapeFactory.getShape("TRIANGLE");
	      shape3.draw();
	      
	      

	      AbstractFac ColourFac = FactoryProducer.getFactory("COLOUR");
	      
	      Colour color1 = ColourFac.getColour("Yellow");
	      color1.fill();
	      Colour color2 = ColourFac.getColour("Purple");
	      color2.fill();
	      Colour color3 = ColourFac.getColour("Black");
	      color3.fill();
	   }
	}