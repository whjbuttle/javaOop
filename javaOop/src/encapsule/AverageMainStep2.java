package encapsule;

import java.util.Scanner;

public class AverageMainStep2 {
	public static void main(String[] args) {
		AverageVOStep2 hulk = new AverageVOStep2();
		AverageVOStep2 iron = new AverageVOStep2();
		AverageVOStep2 hawk = new AverageVOStep2();
		
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
		
		hulk.tot = AverageVOStep2.calcTot(hulk.kor, hulk.eng);
		hulk.avg = AverageVOStep2.calcAvg(hulk.tot);
		
		iron.tot = AverageVOStep2.calcTot(iron.kor, iron.eng);
		iron.avg = AverageVOStep2.calcAvg(iron.tot);
		
		hawk.tot = AverageVOStep2.calcTot(hawk.kor, hawk.eng);
		hawk.avg = AverageVOStep2.calcAvg(hawk.tot);
		
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
