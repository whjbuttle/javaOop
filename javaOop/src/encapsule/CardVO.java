package encapsule;

public class CardVO {
	String msg;
	/*
	 ī���� ���ο� ���̴� ��� ī�尡 �����ؾ� �Ѵ�(=�������� �־�� �Ѵ�)
	 �̴� ����� �����ؾ��Ѵٴ� ���̴�
	 ��� ���� ���� : final
	 */
	static final int WIDTH = 150;		//ī���� ����
	static final int HEIGHT = 300;		//ī���� ����

	public CardVO(String kind, int num) {
		this.msg = kind + ":" + num;
	}
	public String getMsg() {
		return msg;
	}
}
