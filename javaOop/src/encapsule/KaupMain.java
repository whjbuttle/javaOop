package encapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		KaupVO KaupVO = new KaupVO();
		//Ŭ������ ��ü�� = new �����ڸ�;		��ü�� �����ϴ� ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���.");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���.");
		double weight = scanner.nextDouble();
		
		String msg = KaupVO.getKaup(weight, height);
		//��ü��(=�ν��Ͻ� ��������).�޼ҵ��̸�	��ü�� �޼ҵ带 ȣ���ϴ� ����
		System.out.println("ī��������[Ű="+height+"cm, ������="+weight+"kg, ī��������="+msg+"]");
	}

}
