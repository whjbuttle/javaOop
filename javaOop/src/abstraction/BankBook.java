package abstraction;
/*
 Date: 20150624
 Author: itbank
 Story: �������̽� Ÿ������ ������ ���� Ŭ����
 */
public class BankBook implements Account{

	private String accountNo;	// ���� ��ȣ�� ���Ƿ� �ٲ� �� �����Ƿ� setter �� ����
	private String ownerName;	// ���¿� ��ϵ� �̸��� ���Ƿ� �ٲܼ� �����Ƿ� setter�� ����
	private String password;	// setter�� �д�
	private int restMoney;		// 
	public static final String BANK_NAME = "����Ƽ��ũ";

	public BankBook(String accountNo, String ownerName, String password, int restMoney) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.restMoney = restMoney;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	@Override
	public void deposit(int money) {
		// ��ȿ�� üũ : �Աݾ��� 0 �̳� 0���� ���� �ݾ��� �Ķ���ͷ� ���� ��� ������ �߻��ϴ� ���� ���� ���� ����ڵ�
		if (money <= 0) {
			System.out.println("�Աݾ��� 0���� Ŀ���մϴ�.");
		} else {
			this.restMoney += money;
		}
	}

	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("��ݾ��� 0���� Ŀ���մϴ�.");
		} else if (getRestMoney() <= money) {
			System.out.println("��ݾ��� �ܾ׺��� Ů�ϴ�.");
		} else {
			this.restMoney -= money;
		}
		
	}
	/* 
	 �ڹٿ����� ���� ���Ǵ� Ŭ������ �������̽��� �̹� ���� �Ǵ� ������ �� �����ڵ��� �̸� �����ٰ� ���� �ϰ� �ֽ��ϴ�.
	 ���� ���, ��ĳ��, �ý��� ���� ���Դϴ�.
	 ��ó�� �̸� ������� Ŭ������ �������̽��� API��� �մϴ�. �� �� �ֻ��� ��ü�� Object ��� �ϸ�
	 �� Object �� Ŭ������ �ڹٿ��� ��ü�� ����� ���̶�� ������ ����� �޽��ϴ�. 
	 �׷��� Object�� �޼ҵ���� �ڹ� ��ü��� ��� ���̵� ����� �� �ֽ��ϴ�.
	 �̰� ����ϴ� ����� Ŭ���� ���ο��� �� ������ CTRL + SPACE
	 */
	 
	@Override
	public String toString(){
		return "����� ����\n"
				+ "���¹�ȣ : " + getAccountNo() + "\n"
				+ "���¸� : " + getOwnerName() + "\n"
				+ "��й�ȣ : ******** \n" 
				+ "�ܾ� : " + getRestMoney() + "\n";
	}
}
