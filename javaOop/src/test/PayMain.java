package test;

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		/*
		 Q. �Ʒ��� ���� ��µǴ� ���α׷� �ۼ�
		 === ȫ�浿�� 6�� �޿����� ===
		 ���� : 300����
		 ���� : 30����
		 �Ǳ޿� : 270����
		 
		 === �������� 6�� �޿����� ===
		 ���� : 400����
		 ���� : 40����
		 �Ǳ޿� : 360����
		 */
		
		PayVO hgd = new PayVO();
		PayVO kgc = new PayVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���. (ȫ�浿)");
		hgd.setName(scanner.next());
		System.out.println("�̸��� �Է��ϼ���. (������)");
		kgc.setName(scanner.next());
		
		System.out.println("ȫ�浿�� ������ �Է��ϼ���.");
		hgd.setSalary(scanner.nextInt());
		System.out.println("�������� ������ �Է��ϼ���.");
		kgc.setSalary(scanner.nextInt());
		
		hgd.setIncome(hgd.getSalary());
		kgc.setIncome(kgc.getSalary());
		
		System.out.println("=== "+ hgd.getName() +" ===");
		System.out.println("����: " + hgd.getSalary() + "����");
		System.out.println("����: " + hgd.getSalary() * PayVO.TAX + "����");
		System.out.println("�Ǳ޿�: " + hgd.getIncome() + "����");
		
		System.out.println("=== "+ kgc.getName() +" ===");
		System.out.println("����: " + kgc.getSalary() + "����");
		System.out.println("����: " + hgd.getSalary() * PayVO.TAX + "����");
		System.out.println("�Ǳ޿�: " + kgc.getIncome() + "����");
	}
}
