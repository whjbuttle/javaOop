package polymorphism;

public class CoffeeVO {
	private String msg;
	int price, money;
	
	public CoffeeVO() {
		this.msg = "Ŀ�� ���Ǳ��Դϴ�.";
	}
	public CoffeeVO(int price){
		/*
		 this.price�� ���� �ʵ忡 ����� �ν��Ͻ������̰�
		 = price �� �ִ� ���� ������ �޼ҵ忡 �Ķ���ͷ� �־� �� ���̴�.
		 ���� �Ʒ� ������ �ν��Ͻ������� �Ķ���� ���� �Ҵ��Ѵٴ� �ǹ��̴�.
		 */
		this.price = price;
		this.msg = "�� �ܿ� " + price + " �� �Դϴ�.";
	}
	public CoffeeVO(int price, int money, String coffee) {
		this.msg = coffee + " ���Խ��ϴ�.\n�Ž������� "+ (money-price) +"�� �Դϴ�.";
	}
	public String getMsg() {
		return msg;
	}
}
