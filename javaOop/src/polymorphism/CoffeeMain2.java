package polymorphism;

import java.util.Scanner;

/*
Date: 20150619
Author: itbank
Story: Ŀ�� ��ü Ŭ������ ���� ������ �����ε��� �����غ��� ����Ŭ����
		�����ε� = ������(polymorphism)
*/
public class CoffeeMain2 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("�Ǹ��ڴ� Ŀ�� �� �� ������ �������ּ���.");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
	}
}
