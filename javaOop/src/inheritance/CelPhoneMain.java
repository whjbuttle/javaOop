package inheritance;

import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone motorola = new CelPhone();
		motorola.setCompany("����ζ�");
		System.out.println( motorola.getCompany() + " �޴����� ����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� ��� : ");
		motorola.setCall(scanner.next());
		motorola.setPortable(true);
		System.out.println(
				motorola.getCall() + "�� ��ȭ�մϴ�.\n"
			  + motorola.getMove() );
	}
}
