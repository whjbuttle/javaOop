package test;

public class PayVO {
	/* 
	 �ʵ忡 ����� �ν��Ͻ� ������ �ݵ�� ���������ڵ� �� 
	 private ���� �����Ͽ� ����ȭ�� �������Ѵ�
	 */
	
	private String name;	//�����̸�
	private int salary;
	public static final double TAX = 0.1;	// ���� 10%�� ������
	double income;		// �Ǳ޿��� = �޿� - ����(�޿�*����)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = salary - (salary * TAX);
	}
	
}
