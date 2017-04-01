package factorypattern.dp.com;

public class FactoryPattern {

	public static void main(String[] args) {
	      FactoryShape shapeFactory = new FactoryShape();

	      shapeparent shape1 = shapeFactory.getShape("CIRCLE");
	      shape1.draw();

	      shapeparent shape2 = shapeFactory.getShape("TRIANGLE");
	      shape2.draw();

	      shapeparent shape3 = shapeFactory.getShape("SQUARE");
	      shape3.draw();
	   }
	}