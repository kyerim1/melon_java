package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		
		
		/*  �ڵ� �ۼ��ϱ��� �ؾ����� - �����ľ�, �䱸���׵���
			// ���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�.
			   ���ڿ��� String Ŭ����Ÿ���� ����ؾ��Ѵ�.
			
			����2.
			���� �̸�, �ҼӺμ��� , �� �޿��� �� Ű���带 ���� �Է¹޴´�.
			������ 8%�� ����.  �Ǽ��ɾ��� ������ ���
			�̸�,�μ�, �Ǽ��ɾ��� ����ϼ���
			�θ��� ���� �� ���� ����ϼ��� 
		 */
		Scanner sc = new Scanner(System.in);
		
		String name, dept;
		int money;
		float tax = 0.08f;
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�μ� : ");
		dept = sc.nextLine();
		
		System.out.print("�� �޿� : ");
		money = sc.nextInt();
		
		int salary = (int)(money - (money*tax)) ;
		
		System.out.println("�̸� : "+name +" �μ� : "+dept+" ���ɾ� : "+salary);
		
		
	}

}





