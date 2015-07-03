package encapsule;

import java.util.Scanner;

/*
 Story: ī���������� �����ִ� ���(������Ʈ)
 */
public class KaupVO {
	//�޼ҵ� = ����������(public) + ����(void) + �޼ҵ��̸� + () + {}
	public String getKaup(double weight, double height){
		
		//�Ʒ����� doubleŸ���� ������� intŸ���� ������ �Ҵ��ؾ� �ϹǷ� 
		//ĳ������ �Ͼ���� ���� ��Ŭ������ �����ϴ� �ڵ��ϼ�������� �ذ��Ѵ�.
		int idx = (int) ((weight/(height*height))*10000);
		String msg = "";
				
		if (idx>30) {
			msg = "��";
		} else if (idx>24){
			msg = "��ü��";
		} else if (idx>20){
			msg = "����";
		} else if (idx>15){
			msg = "��ü��";
		} else if (idx>13){
			msg = "����";
		} else if (idx>10){
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}
		
		//System.out.println("ī��������[Ű="+height+"cm, ������="+weight+"kg, ī��������="+msg+"]");
		return msg;
	}
}
