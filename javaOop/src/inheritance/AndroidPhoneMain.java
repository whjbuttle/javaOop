package inheritance;

import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화할 상대방 입력 : ");
		String name = scanner.next();
		System.out.println("보낼 메시지 입력 : ");
		String msg = scanner.next();
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());
	}
}
