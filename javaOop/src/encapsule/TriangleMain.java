package encapsule;

import java.util.Scanner;

public class TriangleMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���α��� �Է�: ");
		double width = scanner.nextDouble();
		System.out.println("���α��� �Է�: ");
		double height = scanner.nextDouble();
		
		//double Ÿ���� �Ķ���Ϳ� int Ÿ���� ���� �Ҵ��ص� �ƹ� ������ �߻����� �ʴ� ����
		//�ڹ� ���������� ���� Ÿ���� ū Ÿ�Կ� ���� �����ϱ� �����̴�
		//�ٸ� ���� �ս��� ���� �� ����
		TriangleVO triangle = new TriangleVO(width, height);
		System.out.println("����: " + triangle.getArea());
	}
}
