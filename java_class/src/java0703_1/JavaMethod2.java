package java0703_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class JavaMethod2 {

	public static void main(String[] args) {
		
		Member member1 = new Member("�̼���",31,"����");
		Member member2 = new Member("������",29,"�����������");
		Member member3 = new Member("�念��",45,"��������");
		//�¾ �⵵

		member1.birth();
		member2.birth();
		member3.birth();
		
		
		// ���� - 20�� �ΰ�? 30���ΰ�?40���ΰ�? 50���ΰ�?
		DataIdenti dataIdenti = new DataIdenti();
		dataIdenti.ageGroup( member1.name , member1.age);
		dataIdenti.ageGroup( member2.name , member2.age );
		
		// �����з� - �������� �з��� ���� ǥ��
		// ��� ���� - �̼��� : 05.����
		// 
		
		
		
		
		//System.out.println( today.getMonthValue() );
		
		// �⵵ - .getYear()
		// �� - .getMonthValue();
		// �� -  .getDayOfMonth();
		// ���� - .getDayOfWeek().getValue(); 
		//  1(������), 2(ȭ����), ... , 7(�Ͽ���)
		
		
//		Calendar cal = Calendar.getInstance();
//		int year = cal.get( Calendar.YEAR );
//		int �� = cal.get( Calendar.MONTH ) + 1;
//		int �� = cal.get( Calendar.DAY_OF_MONTH); 
//		int ���� = cal.get( Calendar.DAY_OF_WEEK);
//		
//		System.out.println( year );
		
		
//		Date today = new Date();
//		System.out.println( today.get );
		
	}	
}

// ��Ʈ�ѿ� Ŭ����, ��������� ���� Ŭ����, ������ Ŭ����
//  Controller ,  Service , DTO(VO)


class DataIdenti{ // ���ɴ� , ���� �з� ��� ������ �з��� ���� Ŭ����
	
	void ageGroup( String name, int age ) {
		
		String group=null;
		group = (age/10)+"0��" ;
		System.out.println( name+" : "+ group );
		
	}
	
	// ���� ���� �з� 
	// ���� - 05.����    �������� - 15.���  
	// ����������� - 18.�����Ǻ�
	
	void nationalJob( String name, String job ) {
		
		String ncs = null;
		//if( job.equals("����"))
			
		switch(job) {
			case "����":  ncs="05.����";
				break;
			case "�����������": ncs="18.�����Ǻ�";
				break;  
			case "��������":  ncs ="15.���";
				break;
		}
		
		System.out.println( name +" : " + ncs );
	}
	
}

class Cat{
	
}
class Member{
	String name;//�̸�
	int age; //����
	String job;// ����
	//�⺻ �����ڸ޼���
	Member(){}
	//�Ű������� �ִ� ������ �޼���
	Member(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	// �¾ �⵵ �����ΰ� ����ϴ� �޼���
	void birth( ) {
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		// ȭ�� ��� - �̼��� �¾�⵵ : 0000��
		
		int birthYear1 = nowYear - this.age;
		System.out.printf("%s �¾ �⵵ : %d�� \n",
				this.name , birthYear1 );
	}
}



// �޼��峪  �Լ��� ����ϴ� ����
// �迭, ��� , �ܼ� ���- �ݺ���
// �޼��带 ����ϸ� �ڵ��� ����� ��������, �������� ���� ����.
// �޼��带 ����ϸ�  ����ȭ�� ���α׷��� �� �����ϴ�.
// 






