package encapsule;

import java.util.Scanner;

public class AverageMainStep1 {
	public static void main(String[] args) {
		//�л� ��ü���� �� �޸� �Ҵ�
		
		AverageVOStep1 hulk = new AverageVOStep1();
		AverageVOStep1 iron = new AverageVOStep1();
		AverageVOStep1 hawk = new AverageVOStep1();
		
		hulk.name = "��ũ";
		iron.name = "���̾�";
		hawk.name = "ȣũ";
		
		Scanner scanner = new Scanner(System.in);
		
		//��������
		System.out.println("��ũ�� �������� : ");
		hulk.kor = scanner.nextInt();
		System.out.println("��ũ�� �������� : ");
		hulk.eng = scanner.nextInt();
		
		System.out.println("���̾��� �������� : ");
		iron.kor = scanner.nextInt();
		System.out.println("���̾��� �������� : ");
		iron.eng = scanner.nextInt();
		
		System.out.println("ȣũ�� �������� : ");
		hawk.kor = scanner.nextInt();
		System.out.println("ȣũ�� �������� : ");
		hawk.eng = scanner.nextInt();
		
		//������ ��� ���
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		//���
		System.out.println("==="+hulk.name+" �� ����ǥ===");
		System.out.println("���� : " + hulk.kor);
		System.out.println("���� : " + hulk.eng);
		System.out.println("�հ� : " + hulk.tot);
		System.out.println("��� : " + hulk.avg);
		System.out.println();
		
		System.out.println("==="+iron.name+" �� ����ǥ===");
		System.out.println("���� : " + iron.kor);
		System.out.println("���� : " + iron.eng);
		System.out.println("�հ� : " + iron.tot);
		System.out.println("��� : " + iron.avg);
		System.out.println();
		
		System.out.println("==="+hawk.name+" �� ����ǥ===");
		System.out.println("���� : " + hawk.kor);
		System.out.println("���� : " + hawk.eng);
		System.out.println("�հ� : " + hawk.tot);
		System.out.println("��� : " + hawk.avg);
		System.out.println();
	}
}
