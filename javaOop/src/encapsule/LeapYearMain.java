package encapsule;
/*
 Date: 20150615
 Author: ����Ƽ��ũ
 Story: main()�� �ܼ�â�� �Է°� ����� ����� ����Ѵ�. ���� Scanner�� main()�� ���ӵǾ�� �Ѵ�
 */
import java.util.Scanner;

public class LeapYearMain {
	// �޼ҵ� ���� ���� : ���������� + ����Ÿ�� + �޼ҵ��̸� + () + {}
	// () �Ķ����(�Ű�����)�� ������ ��ġ. ������� ��쵵 ����
	// {} �޼ҵ�ٵ��� �θ��� ����(statement)�� ��ġ��
	// ���������ڴ� ����(�۹̼�)�� �����ϴ� ����
	// ����Ÿ���� �޼ҵ尡 ��ȭ�ϴ� ���� ���� ��� �����ϰ� ������ void
	
	
	public static void main(String[] args) {
		LeapYearVO leapYearMain = new LeapYearVO();
		
		//Scanner scanner = new Scanner(System.in);
		//int year = scanner.nextInt();
		
		// Scanner�� Ŭ���� �̸�
		// scanner�� �ν��Ͻ� ���� �̸� ==> ��ü��
		// new�� ������ Ű����
		// Scanner() �� ������
		// System.in �� �Ķ����(�Ű�����)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scanner.nextInt();
		
		String msg = leapYearMain.getLeapYear(year);
		System.out.println(msg);
		//Ŭ���� �̸��� �ݵ�� ������ ����ִ� Ŭ���� �̸��� ��ġ�ؾ� �ϰ�
		//��ü(�ν��Ͻ� ����)�� Ŭ���� �̸��� ������ ��� �ȴ�.
		//�ٸ�, �޼ҵ带 ȣ���� ��� ����� �ν��Ͻ� ��������� ��ġ�ؾ��Ѵ�
	}
}
