package encapsule;

import java.util.Scanner;

public class AverageMainStep3 {
	public static void main(String[] args) {
		AverageVOStep3 hulk = new AverageVOStep3();
		AverageVOStep3 iron = new AverageVOStep3();
		AverageVOStep3 hawk = new AverageVOStep3();
		
		/*
		 AverageVOStep3 : Ŭ�����̸�
		 hulk, iron, hawk�� �ν��Ͻ�(��ü)
		 new�� ������ Ű����
		 AverageVOStep3() : ������
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���(��ũ)");
		hulk.setName(scanner.next());
		System.out.println("�̸��� �Է����ּ���(���̾�)");
		iron.setName(scanner.next());
		System.out.println("�̸��� �Է����ּ���(ȣũ)");
		hawk.setName(scanner.next());
		
		System.out.println("��ũ�� �������� : ");
		hulk.setKor(scanner.nextInt());
		System.out.println("��ũ�� �������� : ");
		hulk.setEng(scanner.nextInt());
		System.out.println("���̾��� �������� : ");
		iron.setKor(scanner.nextInt());
		System.out.println("���̾��� �������� : ");
		iron.setEng(scanner.nextInt());
		System.out.println("ȣũ�� �������� : ");
		hawk.setKor(scanner.nextInt());
		System.out.println("ȣũ�� �������� : ");
		hawk.setEng(scanner.nextInt());
		
		hulk.setTot(hulk.getKor(), hulk.getEng());
		iron.setTot(iron.getKor(), iron.getEng());
		hawk.setTot(hawk.getKor(), hawk.getEng());
		
		hulk.setAvg(hulk.getTot());
		iron.setAvg(iron.getTot());
		hawk.setAvg(hawk.getTot());
		
		System.out.println("===" + hulk.getName() + "�� ����ǥ===");
		System.out.println("���� : " + hulk.getKor());
		System.out.println("���� : " + hulk.getEng());
		System.out.println("�հ� : " + hulk.getTot());
		System.out.println("��� : " + hulk.getAvg());
		System.out.println();
		
		System.out.println("===" + iron.getName() + "�� ����ǥ===");
		System.out.println("���� : " + iron.getKor());
		System.out.println("���� : " + iron.getEng());
		System.out.println("�հ� : " + iron.getTot());
		System.out.println("��� : " + iron.getAvg());
		System.out.println();
		
		System.out.println("===" + hawk.getName() + "�� ����ǥ===");
		System.out.println("���� : " + hawk.getKor());
		System.out.println("���� : " + hawk.getEng());
		System.out.println("�հ� : " + hawk.getTot());
		System.out.println("��� : " + hawk.getAvg());
		System.out.println();
		
	}
}
