package Duck.dp.com;

public class TestClass {

	public static void main(String[] args) {
		DuckClass d = new BlackDuck();
		DuckClass d1 =  new RubberDuck();
		d.Display();
		d.fly();
		d.swim();
		d.quack();
		d1.Display();
		d1.swim();
	}

}
