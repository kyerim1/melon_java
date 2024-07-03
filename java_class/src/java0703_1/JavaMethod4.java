package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		// 메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println(  num  );
		
		// 메서드로부터 두정수의 더하기 결과 받아서 출력하기
		int 결과 = rm.sum();
		System.out.println( 결과 );
		
		//다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력되게!!
		String userName = rm.getName();
		int age=34;
		System.out.println( userName +" "+ age);
		
		// 국어(89), 영어(78), 수학(50) 세과목의 총점을 구하는 메서드
		//  세과목의 평균을 구하는 메서드
		// 총점과평균을 출력하세요
		
		int tot = rm.total(); // 총점 계산해서 받기
		int avg = rm.avg(tot); // 총점 매개변수로 받고 평균 반환
		System.out.println( tot +"  "+ avg);
	}

}
/*
 	
   주사위 게임
    
   j형준 과  s석완이가 주사위 게임을한다.
   주사위는 하나,  육면이다.
    주사위의 값이 큰 사람이 이긴다.
    
    주사위 값 구하는 메서드 

    주사위 값 비교하여 누가 이겼는지 출력하는 메서드
 
 
 
 
 */

class ReturnMth{
	
	int avg( int tot ) {
		return tot/3;
	}
	
	int total() {
		int kor=89, eng=78 , mat=50;
		return (kor+eng+mat);
	}
	
	
	String  getName(){
		String name = "이순신";
		return name;
	}
	
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}












