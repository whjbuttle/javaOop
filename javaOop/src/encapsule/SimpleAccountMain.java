package encapsule;

import java.util.Scanner;

public class SimpleAccountMain {
	public static void main(String[] args) {
		
		SimpleAccountVO simpleAccountVO = new SimpleAccountVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String inputName = scanner.next();		//���ڿ��� �Է¹��� ���� next() �����
		System.out.println("�Աݾ��� �Է��ϼ���.");
		int money = scanner.nextInt();
		
		String name = simpleAccountVO.name(inputName);
		int jango = simpleAccountVO.jango(money);
		
		System.out.println(name + "�� " + money + "���� �ԱݵǾ����ϴ�. �ܰ�� " + jango + "�����Դϴ�.");
	}
}
