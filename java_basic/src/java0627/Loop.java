package java0627;

import java.util.Scanner;

public class Loop {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// �ݺ��� - for, while, do~while 
		//  for(�ʱⰪ;  ���ǽ�;  ������) {  �ݺ�����  }
		// ���ǽ��� ������ �ɶ�����  �߰�ȣ���� ������ ��� ����ȴ�.
		// �ʱⰪ -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������
		// -> ���ǽĺ� -> ���̶�� -> �߰�ȣ -> ������ -> 
		//  ���ǽĺ� -> �����̶�� -> ��
		
//		
//		for(int i=1; i<=3; i++) {
//			
//		}
//		
//		System.out.println("��... �ݺ���...."+1);
//		System.out.println("��... �ݺ���...."+3);
//		System.out.println("��... �ݺ���...."+5);
//		System.out.println("��... �ݺ���...."+7);
//		System.out.println("��... �ݺ���...."+9);
//		System.out.println("��... �ݺ���...."+11);
//		System.out.println("��... �ݺ���...."+13);
//		System.out.println("��... �ݺ���...."+15);
//		System.out.println("��... �ݺ���...."+17);
//
//		for( int i=1;  i<10; i++) {
//			System.out.println("��... �ݺ���...."+(2*i-1));
//		}
//		for( int i=1; i<=17; i+=2) {
//			System.out.println("��... �ݺ���...."+i);
//		}
//		for( int i=1; i<=17; i++) {
//			System.out.println("��... �ݺ���...."+i);
//			i++;
//		}
//		for( int i=1; i<10; i++) {
//			System.out.println("��... �ݺ���...."+(i+2));
//		}
//		
//		for(int i=10; i>0; i--) {
//			System.out.println( i);
//		}
//		
//		
////		int num = 1;
////		int a=1;
////		num = num + a;  
////		System.out.println( num ); // 2
////		a++;
////		
////		num = num + a;
////		System.out.println( num ); // 4
////		a++;
////		
////		num = num + a;
////		System.out.println(  num ); // 7
////		a++;
//		
//		int num =1;
//		for( int a=1; a<=100; a++) {
//			num += a;
//			System.out.println( num );
//		}
//		
//		
//		// 1���� ���� �Է��� ���ڱ��� �� ������ ���ϼ���.
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("���� �Է� : ");
//		int number = scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=number; i++) {
//			sum = sum + i;
//		}
//		System.out.println( "���� : "+ sum);
//		
//		for( int i=1; true; i++ ) {
//			if( i>10000 ) break;
//			System.out.println(i);
//		}
//		
		//�ݺ����� �ۼ��Ϸ���  ��� �ݺ��Ǵ°�,  ���� �ݺ����� ����Ǿ�� �ϴ°�
		// �ݺ��� ��������� ���ؼ� ���� �����ؾ� �Ѵ�. 
		// for��, while��, do~while�� ���  �����ݺ��� �������ϴ°� �� 
		// ã�����ϸ�  �ۼ��� �� ����.( ���ѷ����̵�, n�� �ݺ� �̵�)
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for( ; true; ) {
//			System.out.print("���� �Է� : ");
//			int num = sc.nextInt();
//			if( num == 0 ) break;
//		}
//		
//		int num1=-1;
//		for( ; num1!=0; ) {
//			System.out.print("���� �Է� : ");
//			num1 = sc.nextInt();
//		}
//		
////		for( ; true; ) {
////			System.out.print("���� �Է� : ");
////			int num = sc.nextInt();
////			if( num == 0 ) return;
////		}
//		
//		// ���ѷ��� �����Ű�¹��
//		// 1. if���� ���ǽ��� ���̵Ǹ� break ����
//		// 2. for( ; ���ǽ� ; )
//		// 3. return; - �ݺ����ڵ尡 �ִ� �޼��带 �����Ű�⶧����
//		//             �ݺ����� ���� �ȴ�.
//		// break; - �ݺ���, switch ��밡��
//		//        if�� �ܵ����� break��� �Ұ�
//		// if(10>5) break; �̰� ����!!
//		
//		// continue;   
//		
//		for( int i=1; i<=10; i++) {
//			
//			System.out.println( i+"��° �ݺ� ���� ");
//			if( i%3 == 0 ) {  continue;}
//				
//			System.out.println(i+"��° �ݺ� ������");
//			System.out.println( i+"��° �ݺ� ����������");
//		}
//		
		// �ڹ��� ���� 
		int random = (int)Math.floor(Math.random() *10 )+1;
		
		// ������ ����(1~ 50)
		// ���� �� ��� ���
		// �������� 11�� ����ϰ�� �ݺ��� ����
		
//		for( ; true; ) {
//			//int num1 = (int)Math.floor(Math.random()*50)+1;
//			int num1 = (int)( Math.random()*50 )+1;
//			
//			if( num1%11 == 0 ) break;
//				
//			System.out.println( num1 );
//			
//		}
		
		//  up & down  �����
		//  ��ǻ�� �� ������ ���� ���߱�
		// ��ǻ�Ͱ� �����ϴ� ���ڴ� ��������( �������� 20~100 )
		// ��ǻ�Ͱ� ������ ���ڰ� 74 ���
		// �����Է� �Ѽ��ڰ� 40 �ϰ�� up�̶�� ���
		// �����Է��� ���ڰ� 80�ϰ�� down�̶�� ���
		
//		int com = (int)(Math.random() * 81 )+ 20;
//		
//		for(;;) {
//			System.out.print("20~100 ���� �Է� : ");
//			int user = scan.nextInt();
//			if( user == com ) {
//				System.out.println("����");
//				break;
//			}else if( user > com) {
//				System.out.println("DOWN");
//			}else if(user < com ) {
//				System.out.println("UP");
//			}
//		}
		
		
		// �̸��� �ִ� �ݺ���
		
		int sum =0;
		
		
		���ϱ�: for(int i=1; i<=10; i++) {
			for( int k=1; k<=4; k++) {
				if( sum + k >= 40) continue ���ϱ�;
				sum = sum+k;
				System.out.println( "      "+ k  );
			}
			System.out.println(i);
			sum = sum +i ;
		}
			
		if(sum < 40) {
			
			System.out.println( "sum ��� : " + sum );
			
		}
		
		
		// ����Ų��� 31
		// ��ǻ�Ϳ� ���ϰ� ���� �Ѵ�.
		// �ѹ��� �����Ҽ� �ִ� ���ڴ� �ּ�1��, �ִ� 3�� 
		//  31�� �Է��ϸ�  �й�
		
		
		int num=1;
		
		����Ų:
		for(;;) {  // while(true)
			System.out.print("���� � : ");
			int user = scan.nextInt();
			System.out.print("�� : ");
			for(int u=1; u<=user; u++) {
				System.out.print( num +" " );
				if(num == 31) break ����Ų;
				num++;
				
			}
			System.out.println();
			
			int com = (int)(Math.random()*3)+1;
			System.out.print("  com : ");
			for(int c=1; c<=com; c++) {
				System.out.print( num +" " );
				if(num == 31) break ����Ų;
				num++;
			}
			System.out.println();
		}
		
	}

}







