package encapsule;

import java.util.Scanner;

/*
 Date: 20150616
 Author: ����Ƽ��ũ
 Story: ���θ޼ҵ忡��  
 */
public class LeapYearVO {
	public String getLeapYear(int year){
		/*
		 ������ 4�� ���� ���� 0�̶�� ������ �� �ִ�
		 �׷��� �ش翬���� 100���� ������ �������� ����̴�
		 ����̶� �ص� �ٽ� 400���� ������ ���� ������ �����̴�.
		 */
		
		String msg = "";
		if(year%400==0){	//���͸��� ������� ũ�� �ִ� �������� ���� �������� ����
			msg = "����";
		} else if(year%100==0){
			msg = "���";
		} else if(year%4==0){
			msg = "����";
		} else{
			msg = "���";
		}
		//System.out.println(msg);
		return msg;
	}
	//��°��� ������Ű�� ���ؼ��� �޼ҵ忡 ����Ÿ���� void�� �ƴ� ���ϰ��� ���� ������Ÿ���� �ָ� �ȴ�
}
