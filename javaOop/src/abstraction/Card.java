package abstraction;

public class Card {
	
	static final int WIDTH = 150;		//ī���� ����
	static final int HEIGHT = 300;		//ī���� ����
	public static final String KIND = "��Ʈ";	
	// �ڵ��� �ܼ�ȭ�� ���� KIND�� �� ������ ���
	private int num;
	
	public Card() {
		this.num = (int) ((Math.random()*13)+1);
		// Math.random �޼ҵ�� ���������� ���� ���ڸ� �߻���Ű�� ���� 
		// *13�� ����Ʈ ��, + 1�� ��ŸƮ ��
	}
	public int getNum() {
		return num;
	}
}
