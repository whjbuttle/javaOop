package encapsule;

import java.util.Scanner;

public class RectangleMain2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���α��� �Է� : ");
		int width = scanner.nextInt();
		System.out.println("���α��� �Է� : ");
		int height = scanner.nextInt();
		
		// �����ڸ� ���� �ν��Ͻ� ������ ���縦 ���ϴ� ���
		// �ݵ�� �Ķ���Ͱ� �ʿ��� ����� ��ó�� getter setter�� �����ϰ� ����Ʈ ������ ���� �����ؼ�
		// �Ķ���� ���� �޴� �ν��Ͻ�(��ü)�� ���鵵�� ������ ���Ѵ�
		// Ŭ���� �����ڴ� ��ó�� �Ͽ� ���� Ŭ������ ������ �ʰ� ��븸 �ϴ� �����ڰ� �Ǽ��� ���α׷��� �ظ� ��ġ�� ���� ���´�
		RectangleVO2 vo = new RectangleVO2();
		
		RectangleVO2 rectangle = new RectangleVO2(width, height);
		System.out.println("���� : " + rectangle.getArea());
	}
}
