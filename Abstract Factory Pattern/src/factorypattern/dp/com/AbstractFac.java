package factorypattern.dp.com;

public abstract class AbstractFac {
	
	abstract Shapeparent getShape (String Shape);
	abstract Colour getColour (String Colour);
}
