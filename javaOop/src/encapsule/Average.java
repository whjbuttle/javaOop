package encapsule;

import java.util.Scanner;

/*
 Date: 20150617
 Author: itbank
 Story: ��ձ��ϴ� ������ ������������ �ڵ��� �ҽ�
 */
public class Average {
	public static void main(String[] args) {
		String hulk="", iron="", hawk = "";
		int hulkKor=0, hulkEng=0, hulkTot=0, hulkAvg=0,
			ironKor=0, ironEng=0, ironTot=0, ironAvg=0,
			hawkKor=0, hawkEng=0, hawkTot=0, hawkAvg=0;
		/*
		 ���ݰ��� ������ ���� �������� �Դϴ�.
		 ������ ����� ����(������)�� ���� ������ �����ϴ�.
		 �޼ҵ� ���ο� ����Ǹ� ���������Դϴ�.
		 ���������� Ư¡�� ������ �����ϴ�.
		 
		 1. �ݵ�� �ʱ�ȭ �ؾ���
		 2. ���� �޼ҵ� ���ο� ������ Ÿ���� ������ �̸��� �� �� ����
		 3. �޼ҵ尡 ������ ������ ���ŵ�
		 */
		
		Scanner scanner = new Scanner(System.in);
		hulk = "��ũ";
		iron = "���̾�";
		hawk = "ȣũ";
		
		//���� �Է�
		System.out.println("��ũ�� �������� : ");
		hulkKor = scanner.nextInt();
		System.out.println("��ũ�� �������� : ");
		hulkEng = scanner.nextInt();
		
		System.out.println("���̾��� �������� : ");
		ironKor = scanner.nextInt();
		System.out.println("���̾��� �������� : ");
		ironEng = scanner.nextInt();
		
		System.out.println("ȣũ�� �������� : ");
		hawkKor = scanner.nextInt();
		System.out.println("ȣũ�� �������� : ");
		hawkEng = scanner.nextInt();
		
		//������ ��� ���
		hulkTot = hulkKor + hulkEng;
		hulkAvg = hulkTot/2;
		
		ironTot = ironKor + ironEng;
		ironAvg = ironTot/2;
		
		hawkTot = hawkKor + hawkEng;
		hawkAvg = hawkTot/2;
		
		//���
		System.out.println("==="+hulk+" �� ����ǥ===");
		System.out.println("���� : " + hulkKor);
		System.out.println("���� : " + hulkEng);
		System.out.println("�հ� : " + hulkTot);
		System.out.println("��� : " + hulkAvg);
		System.out.println();
		
		System.out.println("==="+iron+" �� ����ǥ===");
		System.out.println("���� : " + ironKor);
		System.out.println("���� : " + ironEng);
		System.out.println("�հ� : " + ironTot);
		System.out.println("��� : " + ironAvg);
		System.out.println();
		
		System.out.println("==="+hawk+" �� ����ǥ===");
		System.out.println("���� : " + hawkKor);
		System.out.println("���� : " + hawkEng);
		System.out.println("�հ� : " + hawkTot);
		System.out.println("��� : " + hawkAvg);
		System.out.println();
		
		//CTRL + F , replace ��ư Ŭ��
	}
}
