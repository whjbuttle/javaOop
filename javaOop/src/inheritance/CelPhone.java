package inheritance;

public class CelPhone extends Phone {
	private boolean portable;	//�޴뼺�� �ִ��� ������ ����
	private String move;		//�޴뼺�� �ִٸ� ������ �ٴ� �� �ִ�
	
	//����Ʈ �����ڸ� ������ �ʰڴ�
	
	//alt + shift + s : getter / setter ȣ��
		
	public boolean isPortable() {	//�ʵ忡 �ִ� �ν��Ͻ� ������ Ÿ���� boolean �̸� is... / set... ���� �ڵ������ȴ�
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable == true) {
			this.setMove("���� ������ �ٴ� �� ����");
		} else {
			this.setMove("���� ������ �ٴ� �� ����");
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
	
}
