package inheritance;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		//������Ÿ�� + �ν��Ͻ� = new ������();
		
		phone.setCompany("�ѱ����");
		System.out.println(phone.getCompany() + "�� ����ȭ�� ����մϴ�");
		System.out.println("��ȭ�� ����� �̸� : ");
		Scanner scanner = new Scanner(System.in);
		phone.setCall(scanner.next());
		System.out.println(phone.getCall() + "�� ��ȭ�մϴ�.");
		
		
	}
}
