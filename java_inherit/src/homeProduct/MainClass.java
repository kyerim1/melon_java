package homeProduct;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
		Tv tv = new Tv("�Ｚ",10000);
		tv.brand="�Ｚ";
		tv.power();
		tv.power();
		
		Aircon air = new Aircon();
		air.brand="LG�ּ�";
		System.out.println( air.brand );
		air.power();
		air.power();

	}

}

 //  Ŭ����  ���
 //  ��� �Ϸ���  �ڽ�Ŭ�����̸� �ڿ� extends �θ�Ŭ�����̸�
// extends - Ȯ��, ����...
//  Tv extends House ->  TvŬ������ �ڽ��̰� House�� �θ�Ŭ�����̴�.
//  ����� �ϴ� ����ū���� - ������ 
// �θ�Ŭ������ �ν��Ͻ�����, �ν��Ͻ��޼���, Ŭ��������,
//            Ŭ�����޼���  ��밡���ϴ�.
//  ��, �θ�Ŭ������ ���� ��������� ���ϴ�. �Ϻ� 
//  ����ɷ��ִ� ������ �޼���� ��� �Ұ�
//  
//  �����ڸ޼��带 ���� �ν��Ͻ��������� �ʱ�ȭ��  
//  �ڽ�Ŭ������ �������ִ� ������ �ڽ�Ŭ���� �����ڸ޼��忡�� �ʱ�ȭ
//  �θ�Ŭ������ �������ִ� ������ �θ�Ŭ���� ������ �޼��忡�� �ʱ�ȭ











