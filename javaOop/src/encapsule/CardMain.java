package encapsule;

public class CardMain {
	public static void main(String[] args) {
		/*
		 �䱸����
		 ī�� ��ü�� 2�� �����ؼ� ���̿� ���ڸ� ���ؼ� �� ū ���ڸ� ���� ī�尡 �̱�� ������ ����ÿ�
		 ī��� ������ ���ÿ� ���̿� ��ȣ�� ������� �ֽ��ϴ�.
		 ���ǰ� ���� �������� ���α׷��� ���弼��
		 */
		CardVO card1 = new CardVO("heart", 5);
		CardVO card2 = new CardVO("heart", 7);
		System.out.println("�÷��̾�2�� �� ī��� "+card2.getMsg()+"�̰�, �÷��̾� 1�� �� ī��� " +card1.getMsg()+"�̹Ƿ� �÷��̾� 2�� �̰���ϴ�.");
		
	}
}
