package abstraction;

public class Notebook extends ProductSpec {
	private String cpu;
	private String ram;
	private String hdd;
	
	@Override
	public void getInfo() {
		
		super.getInfo();
		
		System.out.println("cpu ���� : " + this.cpu);
		System.out.println("���θ޸� ���� : " + this.ram);
		System.out.println("�ϵ��ũ ���� : " + this.hdd);
	}
	
	public void setInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		// �Ķ���ͷ� �־��  ���鵵 �ٷ� super�� ���� �θ� �޼ҵ��� �Ķ���ͷ� ������ �ٷ� set �մϴ�
		// �� �⺯�� ������ �θ��ڽ� ���迡�� �����ϹǷ� �θ��� �⺯�� ���� ���� ���� �����������ϴ�.
		super.setInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	/*
	 �ϳ��� Ŭ������ ������ ��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ �� ������ ��ɿ� ���� �ݺ� ����ϴ� ���� ������ �����ε��̶�� �Ѵ�
	 Coffee ���������� �����ڸ� ������ �ݺ������Ƿ� ������ �����ε��̰�
	 ���� ������ �޼ҵ带 �Ķ���͸� �ٸ� ���·� �������� ���� �̸����� �����Ͽ����Ƿ� �޼ҵ� �����ε��̶�� �Ѵ�.
	 */
}
