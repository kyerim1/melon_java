package java0702_2;

import java.util.Arrays;

public class ClassObject {

	public static void main(String[] args) {
//		Arrays.toString(null);
		System.out.println( Car.������ );
		
		Car car1;
		
		car1 = new Car(); // carName, ��ⷮ, ���� ���� ����
		car1.carName="�Ÿ";
		car1.���� = "�ֹ���";
		car1.������ = "���";
		System.out.println( Car.������ );
		
		
		
		Car car2 = new Car("�׷���",3000,"�ֹ���");
		
	/*
		������ : �̸� , ����Ʈ , ����
		       ��ǿ� ,  4580,  4.3
		       ����� ,  3485,  4.1
		       ����� , 90930,  2.7
		       ������ , 19200,  3.1
		 
		���Ҽ� �۰����� ������ ������,  �Ҽ� ��Ƚ���� ���� ����Ʈ�����̴�.
		�� ������ ���� �� �� �ִ� Ŭ������ �����ϰ� ������ �Է��� ����ϼ���
		( �Ű����� �ִ� ������ �޼���� �ΰ� �̻� ���� )
	*/
		
		WebNovel author1 = new WebNovel("��ǿ�", 4580, 4.3f);
		WebNovel author2 = new WebNovel("�����",3485,4.1f);
		
		System.out.println( author1.name +" "+ author1.rating );
		System.out.println( author1.point );
		System.out.println( author1 );
	}

}

class WebNovel{
	String name; // �̸� - �ν��Ͻ�����
	int point; // ����Ʈ���� - �ν��Ͻ�����
	float rating; // ���� - �ν��Ͻ�����
	WebNovel(){
		
	}
	WebNovel(String name){
		this.name = name;
	}
	
	WebNovel(String name, int point, float rating){
		this.name = name;
		this.point=point;
		this.rating = rating;
	}
	
	public String toString() {
		return name+" "+ point+"��  "+ rating;
	}
}


// Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)��  �ΰ����� �ִ�.
//  Ŭ���� ���� , �ν��Ͻ� ���� 
// �ν��Ͻ�������  Ŭ���� ��ü ������ �޸� �Ҵ��̵ȴ�.
//  Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.
// Ŭ���� ������ ���α׷� ���� �Ҷ� �޸𸮿� �ε��ϸ鼭 �����ȴ�.

// ������ �޼��� - ��ü(�ν��Ͻ�) ������ �����Ҷ� ���� �ʱ�ȭ ���ִ� �޼���
// ������ �޼��� - return�� ���������ʴ´�. , 
//              return�� �ϸ� �ȵǴ������� �����ڸ޼��忡�� return Ÿ��
//              ������ �ȵǱ� ������ 
// �����ε� - �����ε� ���� ����
//       1. ���� Ŭ���������� �����ϴ�.
//       2. �޼����� �̸��� ���ƾ� �Ѵ�.
//       3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
//       4. �Ű������� ������ �޶�� �Ѵ�.

class Car{
	static String ������ = "����"; //Ŭ���� ���� 
	
	String carName; // �ν��Ͻ� ����
	int ��ⷮ; // �ν��Ͻ� ����
	String ���� = "�ֹ���"; // �ν��Ͻ� ����
	
	// ������ �޼���
	Car(){
		// �����ڸ޼����� ���� - �ν��Ͻ������� �ʱⰪ ����
		����="�ֹ���"; // new �����ڿ� ���� ��ü ������ ���ắ���� 
		             // �ֹ��� ����ȴ�.
	}
	// �Ű������� �ִ� ������ �޼���
	Car(String ����, float ����, String aa){
		
	}
	Car(String ����, String aa, float ����){
		this.���� = ����;
	}
	Car( String carName , int cc , String fuel){
		this.carName = carName;
		��ⷮ=cc;
		this.���� = fuel;
	}
}



















