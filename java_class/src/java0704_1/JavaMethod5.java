package java0704_1;

import java.util.Scanner;

public class JavaMethod5 {

	public static void main(String[] args) {
		
		MethodUtil util = new MethodUtil();
		// 두개의 정수를 반환 하기
		int[] num1 = util.twoNum();
		
		// 사각형의 너비와 높이를 설정하고  넓이를 출력하세요.
		// 넓이는 main메서드에서 출력되게 하세요
		int area = util.rectArea();
		System.out.println("넓이 : "+ area);
		
		// 로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea 
		// login 메서드를 실행하여 로그인 여부를 출력하세요.
		// 아이디 비밀번호가 일치하면 로그인 성공 출력
		// 하나라도 불일치면 로그인 실패 출력
		// 로그인 여부 출력은 main에서
//		boolean isFail = util.login();
//		if( isFail ) {
//			System.out.println("로그인성공");
//		}else {
//			System.out.println("로그인 실패");
//		}

		// 정수 세개를 키보드를 통해 입력 받으세요.
		// 입력한 세 정수의 합이 100을 넘으면 
		// 100 - 합 의 결과를 출력하고
		// 100을 넘지 않으면  세정수의 합을 출력하세요.
		// main메서드에서 출력
		
		int result = util.inputInt();
		System.out.println(result);
	}

}
class MethodUtil{
	
	int inputInt() {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
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
		System.out.print("아이디 : ");
		String id = sc.nextLine(); 
		System.out.print("비밀번호 : ");
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
		// return으로 반환 시킬수 있는 값은 단일 값이다.
	}
	
	
}






