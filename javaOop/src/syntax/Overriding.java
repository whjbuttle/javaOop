package syntax;
/*
 Date: 20150623
 Author: itbank
 Story: �������̵� ����
*/
public class Overriding {
	/*
	 Method Overriding
	 - ��Ӱ��迡�� Super �� ����� �޼ҵ带 Sub ���� �ٽ� ������ ���
	 - �̷� ��� Super �� �޼ҵ�� ���õȴ�.
	 - ���� �޼ҵ尡 Super�� Sub���� ��� ����Ǿ����� ������ �ٸ� �� �ִ�.
	 
	 �������̵��� ����
	 - Ŭ������ �������� ������ �� �ִ�.
	 - �� Super �� Sub ������ �޼ҵ��, �Ķ���Ͱ���, �Ķ���� ������Ÿ���� ���ƾ� ��
	 - Super �� ���� �޼ҵ带 ����� �ֳ� ���� �̸��� �޼ҵ尡 Sub�� �����Ѵٸ� Sub�� �ִ� �޼ҵ带 �켱 ����ؾ� ��
	 - Super �� �޼ҵ� ����� �����ϸ鼭 ��Ȳ�� ���� Sub �� ������ ����� ����ϰ� ���� �� ����ϸ� �������� �ٽɿ����̴�
	 - Super �� �޼ҵ带 ĸ��ȭ �Ѵٰ� �� �� �ִ�.
	 */
	public static void main(String[] args) {
		Parents p = new Parents();
		p.show();
		
		Child c = new Child();
		c.show();
	}
}

class Parents{
	void show(){
		System.out.println("Parents �� show() �� ����..");
	}
}

class Child extends Parents {
	@Override
	void show(){
		//�θ��� �޼ҵ带 �״�� ����ϰڴٴ� �ǹ�
		System.out.println("Child �� show() �� ����..");
	}
}