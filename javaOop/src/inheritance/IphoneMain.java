package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� ���� �Է� : ");
		String name = scanner.next();
		System.out.println("���� �޽��� �Է� : ");
		String msg = scanner.next();
		iphone.setData(name, msg);
		System.out.println(iphone.getData());
	}
}
