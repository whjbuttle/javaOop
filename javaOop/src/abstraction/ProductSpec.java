package abstraction;

public class ProductSpec implements Product{

	private String company;		// ������
	private String name;		// ��ǰ��
	private String serialNo;	// �Ϸù�ȣ
	
	@Override
	public void setInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	@Override
	public void getInfo() {
		System.out.println("������ : " + this.company);
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("�ø���ѹ� : " + this.serialNo);
	}

}

// ��Ŭ���� ����Ű ����� ���� ���
// �޴��� > Window > preference > general > keys > copy line �Է� > CTRL + J
// �޴��� > Window > preference > general > keys > delete line �Է� > CTRL + D
// �޴��� > Window > preference > general > keys > delete line �Է� > CTRL + B
// �޴��� > Window > preference > general > keys > delete line �Է� > CTRL + F