package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		
		book.add( new Book("B1234", "�ڹٿ�������","�赿��") );
		book.add( new Book("F9238", "�����������ӿ�ũ","�̻��") );
		book.add( new Book("A1002", "���ϸ����������","������") );
		dvd.add( new DVD("M3D232", "�����ǻ�","������") );
		dvd.add( new DVD("M9D123", "�����̰����ʰ����Ǳ�","Ȳ����") );
		dvd.add( new DVD("M1B001", "�߳ʵ� ���� ���������־�","������") );
		
		
		
		// �뿩 �ϱ�
		Library lib = new Library();
		lib.addRental( book.get(0) ,"�̼���" );
		lib.addRental( dvd.get(2) ,"������"  );
		lib.showRentalList();
		
//		
//		Rental<DVD> rent = new Rental<>( dvd.get(0), "�̼���" );
//		System.out.println( rent );
//		
//		Rental<Book> brent = new Rental<>( book.get(1),"������" );
//		System.out.println( brent );
		
		
		
		
		
	}

}






