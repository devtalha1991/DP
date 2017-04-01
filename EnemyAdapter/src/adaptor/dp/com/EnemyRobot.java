package adaptor.dp.com;

import java.util.Random;

class EnemyRobot implements IEnemyAttack{
	
		Random generator = new Random();
	
		public void smashWithHands() {
		
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Robot Causes " + attackDamage + " Damage With Its Hands");
		
	}
		public void walkForward() {
			
			int movement = generator.nextInt(5) + 1;
			
			System.out.println("Robot Walks Forward " + movement + " spaces");
			
		}

		public void reactToHuman(String driverName) {
			
			System.out.println("Robot Tramps on " + driverName);
			
		}
}
