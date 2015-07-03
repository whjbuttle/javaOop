package abstraction;

public class TV extends ProductSpec{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company, String name, String serialNo, String screenSize, String screenType) {
		super.setInfo(company, name, serialNo);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("��ũ�� ������ : " + this.screenSize);
		System.out.println("��ũ�� Ÿ�� : " + this.screenType);
	}
}
