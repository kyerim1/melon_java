package study1;

import java.util.Scanner;

public class MainStudy {

	public static void main(String[] args) {
		
		//정수 데이터 12개 저장할수 있는 배열 만들기
		
//		long aa = new ;
//		String word = new String("i like banana");
//		String word2 = "i like banana";
		
		int[] arr = new int[120000];
		
		// 5개 실수 데이터 저장할수 있는 배열만들기
		double[] d = new double[5];
		
		// 4명의 이름을 저장할수 있는 배열
//		String a = new String;
//		String b;
//		String c;
//		String d;
//		
//		String[] name = new String[4];
//		name[0] = new String("이순신");
//		name[1] = "김유신";
//		
//		Member[] mem = new Member[120];
//		
//		for(int i=0; i<mem.length; i++) {
//			mem[i] = new Member();
//		}
//		
//		mem[0].age=10;
//		System.out.println( mem[0].age );
		
		// 정수 데이터 42개 저장 한다.
		
		//  10,20,30,40,50 을 배열에 저장
		
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
		
		String[] we = new String[] {"이순신","김유신","김춘추",
				"장보고","장영실","이사부","이성계","계백","을지문덕"
		};
		// 배열 출력!!!!
		
		for( int i=0; i< we.length; i++) {
			System.out.println( we[i] );
		}
		
		
		// 7개 정수 저장할 배열
		int[] seven = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
//		for( int i=0; i < seven.length; i++ ) {
//			System.out.print("정수 입력 : ");
//			seven[i] = sc.nextInt();
//			
//		}
		
		// 6명의 몸무게를 입력 하세요 (소수점 1자리까지만)
		// 입력하고 출력까지
		
//		float[] wg = new float[6];
//		
//		for( int i=0; i< wg.length; i++) {
//			System.out.print("몸무게 : ");
//			wg[i] = sc.nextFloat();
//		}
//		
//		// 몸무게가 저장된 배열에서 몸무게가 50 이상만 출력
//		for( int i=0; i< wg.length; i++) {
//			if( wg[i] >= 50) {
//				System.out.println( wg[i]  );
//			}
//		}
//		
		//number 배열의 값 출력
		//  짝수 만 출력 하세요  -  힌트  %2
		int[] number = new int[] {
			55, 44, 33, 88, 99, 54, 14, 28, 91, 4, 6, 9	
		};
		
		
	}

}

class Member {
	int age;
}












