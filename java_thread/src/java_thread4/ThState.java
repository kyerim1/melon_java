package java_thread4;

public enum ThState {
	NEW, RUNNABLE , BLOCKED , 
	WATING , TIMED_WATING , 
	TERMINATED
	
//	String num;
//	ThState(String num) {
//		this.num=num;
//	}
//	String getNum() {
//		return this.num;
//	}
}

/*
 
 	상수들의 클래스처럼 사용할수 있는 방법 - Enum
 	
 	final int num=20;
 	num=30; 오류
 
 	const num=10;
 	num=30;  오류
 
 	menu <-  1.파일 열기 2.파일저장 3. 다른이름저장
 	    4. 환경설정  5.종료
 	enum Menu{
 		파열열기, 파일저장, SAVEAS , SET, EXIT
 	}
 	    
 	int menu = scan.nextInt();
 
 	switch( menu ){
	 	case Menu.파일열기:
	 	case Menu.파일저장:
	 	case Menu.SAVEAS:
	 	case 4:
	 	case 5:
 	}
 
 
 
 
 
 */







