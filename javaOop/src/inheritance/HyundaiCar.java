package inheritance;
/*
 Date: 20150622
 Author: itbank
 Story: Car ������ ���� ����� �ǹ�
  - Ű���� extends �� ����ϸ� �� Ŭ���� ���̿� �θ� �ڽİ��谡 �����Ѵ�.
	��Ӱ��谡 �����Ǹ� �ڽ�  Ŭ������ �θ�Ŭ������ ��� �ν��Ͻ� ������ �޼ҵ带 ��밡���ϰ� �ȴ�
	�ٸ� �θ�Ŭ������ �ν��Ͻ� ������ private �̸� getter/setter �� ����ϴµ�
	�� �� �θ��� �޼ҵ�� super ��� Ű���带 ���� �����´�
 */
public class HyundaiCar extends Car {
	private String brand;
	
	//alt + shift + s
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
