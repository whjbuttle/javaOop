package encapsule;

public class AverageVOStep2 {
	/*
	 Ŭ���� �ٷ� �ؿ� (�������� �ʵ�) �����
	 ������ �ν��Ͻ������� �ϸ� �� �ν��Ͻ� ������ �ʱ�ȭ�� �ص� �ǰ�� �ص� �Ǵµ� 
	 �������� ����ϱ� ������ ��κ� �ʱ�ȭ�� ���� �ʴ´�
	 �׸��� ���� �ʾƵ� ������ ������ �߻����� �ʴ´�
	 */
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	//�հ踦 ���ϴ� ����� main()���� �����ͼ� �����
	
	public static int calcTot(int kor, int eng){
		//�̶� tot�� ���������̴�. ���� �ʱ�ȭ���� �Է��ؾ���
		//CTRL + SHIFT + /
		/*int tot = 0;
		tot = kor + eng;
		return tot;*/
		return kor + eng;
	}
	
	//����� ���ϴ� ����� main()���� �����ͼ� �����
	
	public static double calcAvg(int tot){
		/*double avg = tot / 2;
		return avg;*/
		return tot/2;
	}
}
