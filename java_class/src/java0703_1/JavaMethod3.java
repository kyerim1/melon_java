package java0703_1;

import java.util.Scanner;

public class JavaMethod3 {

	public static void main(String[] args) {
		
		// ���� �ΰ� �Է� �޾� ���� ����ϱ�
		Calc calc = new Calc();
		calc.sum(40,10);
		
		//calc.sum();
		
		// �������� ������ ���Ͽ�����ϼ���
		int kor =89 , eng=74, mat=43;
		calc.scoreTotal(kor, eng, mat);
		
		
		// �޼��� ȣ���Ͽ� '�޼��� dog����~' ��� ���
		calc.easy();
		calc.view(); //view �޼��� ȣ��
		
		//�޼��带 ȣ���Ͽ� �̸��� ���̸� ����ϼ���
		// �Ű����� ���� �޼���, Ű���带 �Է� X
		calc.infoPrint();
		
		
		//�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal="��帮Ʈ����";
		String ������ ="2024-07-01";
		TestMethod testMethod = new TestMethod();
		testMethod.animalStray(animal, ������);
		
		//���� ��¥�߿��� ���� �� �� ����ϼ���
		// ���ڿ� �޼��� substring �Ǵ� split ���
		String examDate = "2024-08-13";
		testMethod.datePrint(examDate);
		
		// �� ����� ���� ��� ���� ���Ͽ� ����ϼ���
		// ��հ��� �����Դϴ�.
		int ���=31, ���� = 23, ���� = 28,  ���=37;
		testMethod.ageAvg( ���, ����, ����, ��� );
	}

}
class TestMethod{
	
	void ageAvg( int ��, int �� , int Ȳ, int �� ) {
		int total = ��+��+Ȳ+��;
		int avg = total/4;
		System.out.println("���� ��� : " + avg);
	}
	
	void datePrint( String date ) {
		String[] current = date.split("-");
		System.out.println( current[1] +"  "+ current[2] );
	}
	
	void animalStray( String animal , String ������ ) {
		System.out.println( animal +" "+ ������ );
	}
	
}


// �ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
// Ŭ���� �޼���, Ŭ���������� Ŭ�����̸�����~~~���

class Calc {
	
	 void infoPrint(  ) {
		String name="���ȣ";
		int age=51;
		System.out.println( name+" "+age );
	}
	
	void view() { // ����a,b �� �� ����ϴ� �޼���
		int a=10, b=20; 
		System.out.println( a+" "+ b );
	}
	
	void easy() {
		System.out.println("�޼��� dog����~");
	}
	
	
	void scoreTotal( int k , int e, int m ) {
		int total = k+ e+ m;
		System.out.println("���� : " +total);
	}
	
	
	void sum(int num1 , int num2) {
		int result = num1+ num2;
		System.out.println("�� : "+result);
	}
	
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = scan.nextInt();
		int result = num1 + num2;
		System.out.println("�� : " + result);
	}
}










