package inheritance;

public class Car {
	/*
	 static �� Car.CAR �� ȣ�� �����ϰ� Ŭ���������� ����� Ű����
	 final �� "�ڵ���" �� �ٲ� �� ������ �ϴ� ��� Ű����
	 */
	public static final String CAR = "�ڵ���";
	private String companyName;	// �����̱� ������ ���� �Ҵ����� ����
	
	public Car() {
		
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
}
