package adaptor.dp.com;


class EnemyTankAdapter implements IEnemyAttack {
	
	EnemyTank TheTank;
	
public EnemyTankAdapter(EnemyTank NewTank){
		
		TheTank = NewTank;
		
	}
	
	public void smashWithHands() {
		
		TheTank.fireWeapon();
		
	}

	public void walkForward() {
		
		TheTank.driveForward();
		
	}

	public void driveForward(String driverName) {
		
		TheTank.assignDriver(driverName);
		
	}	
}
