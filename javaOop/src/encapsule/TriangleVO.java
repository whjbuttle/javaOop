package encapsule;
/*
 Date: 20150619
 Author: itbank
 Story: �����ڸ����� �ﰢ�� ���� ���ϱ�
 */
public class TriangleVO {
	/*
	 Ŭ������ ��ɿ� ���� �ڵ� ������ �������ϴ�
	 main() ������ �ִ� Ŭ������ ������ ����Ŭ������� �θ��ڽ��ϴ�
	 main() ���� ���ο� �����Ϳ� �װ��� ó���ϴ� �����(statement)�� ������ �ִ� Ŭ������ ��ü Ŭ������� �θ��ڽ��ϴ�
	 
	 ��ü Ŭ������ �ʵ念���� �������(=�ν��Ͻ����� + Ŭ��������)�� �޼ҵ念���� ����޼ҵ�� �����˴ϴ�
	 �ű⿡ Ư���� �޼ҵ��� �����ڰ� ��� ��ġ�մϴ�.
	 */
	
	private double width, height, area;
	
	public TriangleVO(double width, double height) {
		this.area = (width * height) / 2;
	}
	
	public double getArea(){
		return area;
	}
}
