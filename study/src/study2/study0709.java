package study2;

class A{
	static int cnt=0;
	int num;
	void setNumber() {
		num=102;
		cnt++; 
		b();
	}
	void b() {}
	static void setCount() {		cnt=20;  	}
}
public class study0709 {

	public static void main(String[] args) {
		A a= new A();
		a.setNumber();
		A.setCount();
		a.setNumber();
		

	}

}
