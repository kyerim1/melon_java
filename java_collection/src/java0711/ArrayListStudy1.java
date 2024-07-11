package java0711;

import java.util.ArrayList;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		
		ArrayList<Member> list =new ArrayList<>();
		
		list.add( new Member("�̼���",34,"19900405")  );
		list.add( new Member("������", 25, "19991208") );
		list.add( new Member("�庸��", 28, "19960712") );
		list.add( new Member("�Ѽ���", 31,  "19930120") );
		list.add( new Member("�豤��", 39, "19851010") );
		
		
		System.out.println( list );
		
		for( Member m : list ) {
			if( m.getAge() >= 10) {
				System.out.println( m );
			}
		}
		
		System.out.println( "=====1995�����Ŀ� �¾ �����==== ");
		for( Member m : list) {
			String temp = m.getBirth().substring( 0, 4 );
			int year = Integer.parseInt(temp);
			if( year > 1995)
				System.out.println( m );
		}
		
		// 8��,9��,10��,11���� �¾ ��������
		System.out.println("===8��,9��,10��,11���� �¾ ���===");
		
		for( Member member : list) {
			String temp = member.getBirth().substring(4,6);
			int mon = Integer.parseInt(temp);
			if( mon >=8 && mon <= 11) {
				System.out.println( member );
			}
		}
		
		
		list.add( 2 , new Member("�念��", 34 , "") );
		System.out.println(  list );
		
// ��������� ���� ����� ã�Ƽ� �׻���� ���̸� ���� �⵵���ְ�
// 0��0�� �� ���� �ǰ� �϶�
		
		for( Member mem : list) {
			if( mem.getBirth().isBlank() ) {
				int year = 2024 - mem.getAge();
				mem.setBirth( year + "0000" );
			}
		}
		
		System.out.println( list );
		
		Member t = new Member("�庸��",0,"0");
		
		list.indexOf( t );
		
		
	}

}










