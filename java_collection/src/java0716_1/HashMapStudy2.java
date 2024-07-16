package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudy2 {

	public static void main(String[] args) {
		
		HashMap<String , ImageBoard> board = new HashMap<>();
		
		ImageBoard temp = new ImageBoard("�ڹټ�ġ","javava","��ġ.jpg");
		board.put(temp.getTitle() , temp);
		temp = new ImageBoard("mysql��ġ���", "��ġ�λ�", "mysql��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("õ����", "������³�", "�鸸���ǰ��.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("�����ӱ�...", "����������", "��ȥ��������.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("mysql��ġ���2", "��ġ�λ�", "mysql��ġ2.png");
		board.put(temp.getTitle(), temp);
		

		System.out.println(  board.get("�ڹټ�ġ") );
		
		Scanner scan = new Scanner(System.in);
		// �̹��� �Խ����� �� ������ ����ϰ�  
		// ���� ���� ���� ������ �Է��ϸ� �ش� 
		// ���� ������ ���� �ִ�.
		
		
		Set<String> titles = board.keySet();
		System.out.println("=== �̹����Խ��� ��� ===");
		titles.forEach( title -> System.out.println(title) );
		
		System.out.print("�� ���� �Է� : ");
		String inputTitle = scan.nextLine();
		
		System.out.println( board.get(inputTitle) );
	}

}







