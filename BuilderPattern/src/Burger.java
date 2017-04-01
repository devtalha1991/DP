
public abstract class Burger implements Item {

	 @Override
	   public Packing Packing() {
	      return new Wrapper();
	   }

	   @Override
	   public abstract Float Price();
	}
	


