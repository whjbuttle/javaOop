package encapsule;
/*
 Date: 20150618
 Author: itbank
 Story: ����ȭ�� ���� ����
 		����ȭ�� �ʵ忡 �ִ� ������ ���� �ƹ��� �������� ���ϰ� �ϰ� setter�� getter�� ���� ����(�۹̼�)�� ȹ���� ��ü�� �����Ϳ� �����ϵ��� �ϴ� �����̴�
 */

 /*
  ���������� private
  - ���ȼ��� ����. ������Ʈ�� �������� �����
  - ������Ʈ�� ������ �ּ�ȭ�Ͽ� �������� ������ �� ����
  - ������ ����
  */

public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	/*
	 �ʵ忡 �ִ� ������ ������ ���� �� ������ ������ �����ϸ� �� �Ǳ� ������(���Ȼ��� ����) ����� �и��Ͽ� �б�� ���� ������� ������
	 �б⸦ get~(), ���⸦ set~() �� �Ѵ�. ��Ŭ������ �ʵ尪�� ���� �޼ҵ� �̸� �ִ� ���� �ڵ�ȭ �ߴ� getter(�б���), setter(������)
	 ����Ű: ALT + SHIFT + s ���� generate getter and setter �� �����Ѵ�
	 */
	
	/*
	 ��ü ���� ���
	 4�� Ư¡ (����)
	 1. ����ȭ (encapsulation) => getter / setter
	 2. ��� (inheritance) => extends
	 3. �߻�ȭ (abstraction) => implements
	 4. ������(polymorphism) => 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getTot() {
		return tot;
	}

	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
		//�ڵ����� ��Ŭ������ ���ؼ� �޼ҵ��, ����Ÿ��, �Ķ���͸� ������ �� �ʿ信 ���� ����
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = tot/2;
	}

	
}
