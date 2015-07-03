package polymorphism;
/*
Date: 20150619
Author: itbank
Story: Ŀ�� ��üŬ������ ���� ������ �Ʒ� ��ó�� �ϳ��� Ŭ������ ������ ��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ ��
		������ ��ɿ� ���� �ݺ� ����ϴ� ���� ������ �����ε��̶�� �Ѵ�.
		
		�Ʒ� �������� �����ڸ� ������ �ݺ������Ƿ� ������ �����ε��̰�
		���� �޼ҵ带 �Ķ���͸� �ٸ� ���·� �������� ���� �̸����� �����Ͽ��ٸ� �̸� �޼ҵ� �����ε��̶�� �Ѵ�.
*/
import java.util.Scanner;

public class CoffeeMain3 {
	public static void main(String[] args) {
		CoffeeVO vendingMachine = new CoffeeVO();
		System.out.println(vendingMachine.getMsg());
		System.out.println("�Ǹ��ڴ� Ŀ�� �� �� ������ �������ּ���.");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		CoffeeVO coffeePrice = new CoffeeVO(price);
		System.out.println(coffeePrice.getMsg());
		
		System.out.println("����, ���� �����ϼ���.\n �� �� ������ "+ price +"�� �Դϴ�.");
		int money = scanner.nextInt();
		System.out.println("Ŀ�� ������ ������ �ּ���.");
		String coffeeType = scanner.next();
		CoffeeVO coffee = new CoffeeVO(price, money, coffeeType);
		System.out.println(coffee.getMsg());
		
	}
}
