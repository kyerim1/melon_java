package java0703_1;

public class JavaMethod4 {

	public static void main(String[] args) {
		
		// �޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		
		int num = rm.get();
		System.out.println(  num  );
		
		// �޼���κ��� �������� ���ϱ� ��� �޾Ƽ� ����ϱ�
		int ��� = rm.sum();
		System.out.println( ��� );
		
		//������ ����ǥ�� �� �ڵ带 �ۼ��Ͽ� �̸��� ���̰� ��µǰ�!!
		String userName = rm.getName();
		int age=34;
		System.out.println( userName +" "+ age);
		
		// ����(89), ����(78), ����(50) �������� ������ ���ϴ� �޼���
		//  �������� ����� ���ϴ� �޼���
		// ����������� ����ϼ���
		
		int tot = rm.total(); // ���� ����ؼ� �ޱ�
		int avg = rm.avg(tot); // ���� �Ű������� �ް� ��� ��ȯ
		System.out.println( tot +"  "+ avg);
	}

}
/*
 	
   �ֻ��� ����
    
   j���� ��  s�����̰� �ֻ��� �������Ѵ�.
   �ֻ����� �ϳ�,  �����̴�.
    �ֻ����� ���� ū ����� �̱��.
    
    �ֻ��� �� ���ϴ� �޼��� 

    �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
 
 
 
 
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
		String name = "�̼���";
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












