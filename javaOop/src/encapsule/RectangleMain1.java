package encapsule;

import java.util.Scanner;

public class RectangleMain1 {
	public static void main(String[] args) {
		System.out.println("���α��̸� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		RectangleVO rectangle = new RectangleVO();
		//rectangle.setWidth(scanner.nextInt());
		System.out.println("���α��̸� �Է��ϼ���");
		//������ ��������(���ú���)�� �������� �ʴ� ������ �ν��Ͻ��� ���� �ν��Ͻ� ������ �̿��ϱ� �����̴�.
		//rectangle.setHeight(scanner.nextInt());
		//rectangle.setArea(rectangle.getWidth(), rectangle.getHeight());
		System.out.println("�簢���� ���� : " + rectangle.getArea());
	}
}
