package abstraction;

public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.setInfo("�Ｚ", "���̵�TV", "123-456", "42��ġ", "LCD");
		//samsungTV.getInfo();
		Notebook lgNotebook = new Notebook();
		lgNotebook.setInfo("LG", "��Ʈ��", "12345", "i7", "8G", "1T");
		//lgNotebook.getInfo();
		
		// �����ڸ� ������� �ʴ� �迭������ �������̽� Ÿ�����ε� �����ϴ�
		Product cart[] = new Product[2];
		cart[0] = samsungTV;
		cart[1] = lgNotebook;
		
		for(Product product : cart){
			product.getInfo();
		}
	}
}
