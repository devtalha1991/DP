
public abstract class ColdDrink implements Item {

	@Override
	public Packing Packing() {
       return  new Glass();
	}

	@Override
	public Float Price(){
		return 25.0f;
		
		
	}
	
}
