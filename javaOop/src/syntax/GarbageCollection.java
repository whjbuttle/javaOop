package syntax;

import java.util.Scanner;

/*
 Date: 20150626
 Author: itbank
 Story: ������ �÷��� ����
*/
public class GarbageCollection {
	/*
	 GarbageCollecting ������ �÷���
	 - �ڹ� ������ �ڵ����� ������
	 - ����޼ҵ� �ȿ��� ������ ��ü�� �޼ҵ� ���� �� ���� �޸𸮰� ȸ����
	 - �⺯�� �޸� ȸ�� ������ ���� ��ġ�� ��
	 - ������ ���� �ʴ� �޸� ����, System.gc()
	 - �켱������ ���� ������� ����
	 	�Ϲ����� ��� ��� �����尡 ����� �� ����
	 - gc() �� �����ϸ� ������ �޸� ȸ�� �۾��� �ϰ� �Ǿ� finalize()�� ȣ��ȴ�
	 	�׷��� gc() ��ü�� ���� ���ϸ� �����ϹǷ� JVM�� �����ϵ��� ��
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Garbage[] garbageCollection = new Garbage[10];
		
		// ��ü ����
		for(int i=0; i<garbageCollection.length; i++){
			garbageCollection[i] = new Garbage(10);
		}
		
		// ��ü �޸� ����
		for(int i=0; i<garbageCollection.length; i++){
			garbageCollection[i] = null;
		}
		System.gc();
	}
	
}

class Garbage{
	int objNo;
	public Garbage(int num){
		objNo = num;
		System.out.println("Garbage Class " + objNo + " �� �������");
	}
	// ��ü�� �޸� ȸ���� �� �ڵ����� ȣ���
	protected void finalize() throws Throwable {
		System.out.println("Garbage Class " + objNo + " ���� ���̴� �޸𸮰� ȸ����");
		super.finalize();
	}
}