package java0627;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		// 반복문 - for, while, do~while 
		//  for(초기값;  조건식;  증감식) {  반복내용  }
		// 조건식이 거짓이 될때까지  중괄호안의 내용이 계속 실행된다.
		// 초기값 -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식
		// -> 조건식비교 -> 참이라면 -> 중괄호 -> 증감식 -> 
		//  조건식비교 -> 거짓이라면 -> 끝
		
		
		for(int i=1; i<=3; i++) {
			
		}
		
		System.out.println("아... 반복문...."+1);
		System.out.println("아... 반복문...."+3);
		System.out.println("아... 반복문...."+5);
		System.out.println("아... 반복문...."+7);
		System.out.println("아... 반복문...."+9);
		System.out.println("아... 반복문...."+11);
		System.out.println("아... 반복문...."+13);
		System.out.println("아... 반복문...."+15);
		System.out.println("아... 반복문...."+17);

		for( int i=1;  i<10; i++) {
			System.out.println("아... 반복문...."+(2*i-1));
		}
		for( int i=1; i<=17; i+=2) {
			System.out.println("아... 반복문...."+i);
		}
		for( int i=1; i<=17; i++) {
			System.out.println("아... 반복문...."+i);
			i++;
		}
		for( int i=1; i<10; i++) {
			System.out.println("아... 반복문...."+(i+2));
		}
		
		for(int i=10; i>0; i--) {
			System.out.println( i);
		}
		
		
//		int num = 1;
//		int a=1;
//		num = num + a;  
//		System.out.println( num ); // 2
//		a++;
//		
//		num = num + a;
//		System.out.println( num ); // 4
//		a++;
//		
//		num = num + a;
//		System.out.println(  num ); // 7
//		a++;
		
		int num =1;
		for( int a=1; a<=100; a++) {
			num += a;
			System.out.println( num );
		}
		
		
		// 1부터 내가 입력한 숫자까지 의 총합을 구하세요.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int number = scan.nextInt();
		
		int sum=0;
		for(int i=1; i<=number; i++) {
			sum = sum + i;
		}
		System.out.println( "총합 : "+ sum);
		
		
		
	}

}


