package java0626;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		System.out.println("�ڹ����");
		// System.in - �Է�
		// �Է¹����� �ִ� ���� Ŭ���� - Scanner 
		Scanner scan = new Scanner(System.in);
		
		// float Ÿ�� - nextFloat()    double - nextDouble()
		// byte - nextByte()   short - nextShort()
		// char �� ����.  
		// ���ڿ� �Է� - nextLine() ,  next() 
		
//		System.out.print(" ���� �Է� : ");
//		int a = scan.nextInt();
//		System.out.println(  a );
//		
//		// ������ ���ְ� �Ծ�����
//		// ö���� ������ �Ա����� �������� ����. 
//		// ��Զ��� �ﰢ���, �ٳ��������� �Ծ���.
//		// ö���� ���ɰ����� ������ �ݾ��� ���ΰ�?
//		
//		int ��Զ��, �ﰢ���, �ٳ�������;
//		System.out.print("��Զ�� ���� : ");
//		��Զ�� = scan.nextInt();
//		System.out.print("�ﰢ��� : ");
//		�ﰢ��� = scan.nextInt();
//		System.out.print("�ٳ������� : ");
//		�ٳ������� = scan.nextInt();
//		
//		int ���ұݾ� = ��Զ�� + �ﰢ��� + �ٳ�������;
//		System.out.println("���ɰ� : "+���ұݾ�+"��");
		// System.out.printf("���ɰ� : %d �� \n", ���ұݾ�);
		
		// �μ��� ģ������ ���������� ���Դ�.
		// ���ͼ�����  ������ ���� �ͼ� ���� ���ٿԴ�. 
		// �̹�����  �Ź��� ¦¦�̷� �ž �ٽ� ���� ���ٿԴ�.
		// �μ��� ���� 5���̴�.  �μ��� 1�� �ö�µ� 3.4�ʰ� �ɸ���.
		// �μ��� ���� ���� ���Դ� �ϴµ� �ɸ� �� �ð��� ����?
		
		// 3.4 , 5 , �պ� , �պ�
		
		int floor = 5;
		float sec = 3.4f;
		int �׷������ϴº����̸������̳� = 4;
		
		float total_sec = (floor-1) * sec* �׷������ϴº����̸������̳�;
		
		System.out.println( total_sec);
		
		
		// ���α׷� �ڵ�� �⺻ ���������� ����ȴ�. 
		// if , �Լ�(�޼���), �ݺ��� , goto��
		
		float a = scan.nextFloat();
		
		
		/*
		 �������� ������  ����, �Ǽ�, ���� , boolean(�� ,����)
		 ������ Ÿ��
		 	���� - byte, short, int ,long
		 	���� - char
		 	�Ǽ� - float, double
		 	������ - boolean
		 
		 ���� ������ - ������Ÿ�� �����̸�;
		 int num;  ���� Ÿ�� ���� ����
		 double dnum;  �Ǽ� Ÿ�� ���� ����
		 char ch; ���� Ÿ�� ���� ����
		 boolean bool; �� ���� ���� ����
		 
		 ������ �ʱ�ȭ
		 int num = 10;  ���� ����� �Բ� �����͸� ���� 
		 
		 ��¹��
		 System.out.println( ��³��� );
		 System.out.print( ��³��� );
		 System.out.printf( ��³��� );
		 
		 printf ���� �Բ� ����ϴ� ����������
		 	%d, %u - ���� ,  %f - �Ǽ� , %c - ���� , %s-���ڿ�
		 	 
		 int age = 28;
		 System.out.printf("%s ������ ���̰� %d���� ���������� %c��  " ,
		 		"�ڵ���" , age, '��');
		 		
		 �Է¹��
		 Scanner Ŭ���� ��ü �ʿ� 
		 Scanner ���� = new Scanner(System.in);
		  *Scanner Ŭ������ ����ܺ�Ŭ�����̹Ƿ�  import �ؾ��Ѵ�.
		  
		  	����.nextInt();  intŸ��  ������ �Է�
		  	����.nextByte();  byteŸ�� ������ �Է�
		  	����.nextShort(); shortŸ�� ������ �Է�
		  	����.nextLong(); longŸ�� ������ �Է�
		  	����.nextFloat(); floatŸ�� �Ǽ��� �Է�
		  	����.nextDouble(); doubleŸ�� �Ǽ��� �Է�
		  	����.next();  ���ڿ� �Է�
		  	����.nextLine(); ���ڿ� �Է�
		 
		
		 c���, �ڹ�, �����а���  ������ ������ �Է��ϼ���.
		 �������� ������ ����� ���� ����ϼ���.
		 */
		
		int C , java, ����;
		
		System.out.print("c��� ���� : ");
		C = scan.nextInt();
		System.out.print("�ڹ� ���� : ");
		java = scan.nextInt();
		System.out.print("�����а��� ���� : ");
		���� = scan.nextInt();
		
		int total = C + java + ����;
		int avg = total/3;
		
		System.out.printf("���� : %d�� , ��� : %d�� \n", total,avg);
		
	}

}







