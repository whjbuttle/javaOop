package inheritance;

public class KiaMain {
	public static void main(String[] args) {
		KiaCar k5 = new KiaCar();
		k5.setCompanyName("���");
		k5.setCarName("k5");
		System.out.println(
				k5.getCompanyName() + "\t" +
				k5.getCarName() + "\t" +
				Car.CAR
				//���� ����� ���â�� ���������� ũ�� ������ �ƴ����� ����������� �ڵ��ߴٴ� �ǹ�
				//�� ��Ȳ�̶�� CAR�� Ŭ������������ �ν��Ͻ������� �ƴϱ� ������ �ν��Ͻ��� ȣ��(k5.CAR)�������� Ŭ������ ȣ���ض�(Car.CAR) ��� ���̴�
				);
		
	}
}
