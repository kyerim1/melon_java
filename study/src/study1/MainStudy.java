package study1;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		
		//���� ������ 12�� �����Ҽ� �ִ� �迭 �����
		
//		long aa = new ;
//		String word = new String("i like banana");
//		String word2 = "i like banana";
		
		int[] arr = new int[120000];
		
		// 5�� �Ǽ� ������ �����Ҽ� �ִ� �迭�����
		double[] d = new double[5];
		
		// 4���� �̸��� �����Ҽ� �ִ� �迭
//		String a = new String;
//		String b;
//		String c;
//		String d;
//		
//		String[] name = new String[4];
//		name[0] = new String("�̼���");
//		name[1] = "������";
//		
//		Member[] mem = new Member[120];
//		
//		for(int i=0; i<mem.length; i++) {
//			mem[i] = new Member();
//		}
//		
//		mem[0].age=10;
//		System.out.println( mem[0].age );
		
		// ���� ������ 42�� ���� �Ѵ�.
		
		//  10,20,30,40,50 �� �迭�� ����
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for( int i=0;  i <num.length; i++ ) {
			System.out.println( num[i] );
		}
		
		int[] width = new int[] {10,20,30,44,55,11,22,33,66,77,};
		for( int i=0; i< width.length; i++) {
			System.out.println( width[i] );
		}
		
		String[] we = new String[] {"�̼���","������","������",
				"�庸��","�念��","�̻��","�̼���","���","��������"
		};
		// �迭 ���!!!!
		
		for( int i=0; i< we.length; i++) {
			System.out.println( we[i] );
		}
		
		
		// 7�� ���� ������ �迭
		int[] seven = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
//		for( int i=0; i < seven.length; i++ ) {
//			System.out.print("���� �Է� : ");
//			seven[i] = sc.nextInt();
//			
//		}
		
		// 6���� �����Ը� �Է� �ϼ��� (�Ҽ��� 1�ڸ�������)
		// �Է��ϰ� ��±���
		
//		float[] wg = new float[6];
//		
//		for( int i=0; i< wg.length; i++) {
//			System.out.print("������ : ");
//			wg[i] = sc.nextFloat();
//		}
//		
//		// �����԰� ����� �迭���� �����԰� 50 �̻� ���
//		for( int i=0; i< wg.length; i++) {
//			if( wg[i] >= 50) {
//				System.out.println( wg[i]  );
//			}
//		}
//		
		//number �迭�� �� ���
		//  ¦�� �� ��� �ϼ���  -  ��Ʈ  %2
		int[] number = new int[] {
			55, 44, 33, 88, 99, 54, 14, 28, 91, 4, 6, 9	
		};
		
		
	}

}

class Member {
	int age;
}












