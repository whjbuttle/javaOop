package abstraction;

public class GunBot extends BasicBot{
	Robot robot;
	// ������ ���� : �ڹ� Ŭ������ �ڵ��ϴµ� �־ GoF (Gang of Four) ������ 4���� ������ �߰��ϰ� 24 ~25 �������� ������ ����
	// ���ڷ��̼� ����
	
	public GunBot(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public int attack() {
		return robot.attack() * 3;
	}
	
	@Override
	public void shield(int attack) {
		robot.shield(attack);
	}
	
	@Override
	public void run() {
		speed += 20;
	}
	
	@Override
	public void status() {
		super.status();
	}
	
	@Override
	public void chargeEnergy(int energy) {
		super.chargeEnergy(energy);
	}
	
}
