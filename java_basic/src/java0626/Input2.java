package java0626;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		
		
		
		/*  코드 작성하기전 해야할일 - 문제파악, 요구사항도출
			// 문자열 - " " 큰따옴표로 표현하여 작성한다.
			   문자열은 String 클래스타입을 사용해야한다.
			
			문제2.
			직원 이름, 소속부서명 , 월 급여액 을 키보드를 통해 입력받는다.
			세금은 8%를 낸다.  실수령액은 얼마인지 출력
			이름,부서, 실수령액을 출력하세요
			두명의 직원 에 대해 출력하세요 
		 */
		Scanner sc = new Scanner(System.in);
		
		String name, dept;
		int money;
		float tax = 0.08f;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("부서 : ");
		dept = sc.nextLine();
		
		System.out.print("월 급여 : ");
		money = sc.nextInt();
		
		int salary = (int)(money - (money*tax)) ;
		
		System.out.println("이름 : "+name +" 부서 : "+dept+" 수령액 : "+salary);
		
		
	}

}





