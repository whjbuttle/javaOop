package encapsule;

public class RectangleVO {
	private int width, height, area;
	
	//������ �ڵ��ϼ� ����Ű : �ʵ� ���� ���� ���� CTRL + space
	public RectangleVO() {
		// �̰��� ����Ʈ �����ڶ�� �ϸ� �Ķ���Ͱ� ���� ���� Ư¡
		// �̰��� ������ �ʴ´� �ϴ��� ���������δ� �ϼ��Ǿ��ִ�.
		// PayVO ���� ���������δ� �Ķ���� ���� �����ڰ� ������� �ִ�.
		// �̰��� ȣ��(call)�� ������ �����ڸ� ������ ���� ����Ϸ��� �ϱ� �����̴�. (������ �����ε�)
		// �����ε��� ���� �ϴ� ������ :
		this(0, 0);
	}

	public RectangleVO(int width, int height) {
		this.area = width * height;
	}

	public int getArea() {
		return area;
	}

	
}
