package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// �ΰ��� ������ ��ȯ �ϱ�
		int[] num1 = util.twoNum();
		
		// �簢���� �ʺ�� ���̸� �����ϰ�  ���̸� ����ϼ���.
		// ���̴� main�޼��忡�� ��µǰ� �ϼ���
		int area = util.rectArea();
		System.out.println("���� : "+ area);
		
		// �α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea 
		// login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		// ���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		// �ϳ��� ����ġ�� �α��� ���� ���
		// �α��� ���� ����� main����
//		boolean isFail = util.login();
//		if( isFail ) {
//			System.out.println("�α��μ���");
//		}else {
//			System.out.println("�α��� ����");
//		}

		// ���� ������ Ű���带 ���� �Է� ��������.
		// �Է��� �� ������ ���� 100�� ������ 
		// 100 - �� �� ����� ����ϰ�
		// 100�� ���� ������  �������� ���� ����ϼ���.
		// main�޼��忡�� ���
		
		int result = util.inputInt();
		System.out.println(result);
	}

}
class MethodUtil{
	
	int inputInt() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� �Է� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int sum = num1 + num2 + num3;
		if( sum > 100) {
			return 100-sum;
		}else {
			return sum;
		}
	}
	
	
	boolean  login(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine(); 
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		boolean isSuccess = true;
		if( id.equals("skyblue") ) {
			if( password.equals("1234sea") )
				return isSuccess;
		}
		return isSuccess=false;
	}
	
	
	
	int rectArea() {
		int width=45, height=50;
		int area = width * height;
		return area;
	}
	

	int[] twoNum() {
		int num1 = 20, num2 = 50;
		//int[] temp =  new int[] {num1,num2};
		return new int[] {num1,num2};
		// return���� ��ȯ ��ų�� �ִ� ���� ���� ���̴�.
	}
	
	
}






