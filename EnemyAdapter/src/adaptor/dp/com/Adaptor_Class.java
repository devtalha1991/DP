package adaptor.dp.com;

public class Adaptor_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyTank rx7Tank = new EnemyTank();
		
		IEnemyAttack TankAdapter = new EnemyTankAdapter(rx7Tank);
		
		System.out.println("The Robot");
		
		rx7Tank.assignDriver("Paul");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		System.out.println();
		
		System.out.println("The Enemy Tank");
		
		fredTheRobot.reactToHuman("Alen");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		System.out.println();
		
		System.out.println("The Robot with Adapter");
		
		TankAdapter.reactToHuman("Hameed");
		TankAdapter.walkForward();
		TankAdapter.smashWithHands();

	}
	
}