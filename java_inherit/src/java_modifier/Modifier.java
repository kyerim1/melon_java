package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		
		Book book = new Book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		System.out.println( book.getTitle() );
		
		Book book2 = new Book("JAVA,��, ������", "�̺���",564);
		
		System.out.println(  book2  );
		
	}

}

/*
Ŭ���� 
	- ����, �޼���
	- �ν��Ͻ�, Ŭ����
	- �����ڸ޼���
	- �ν��Ͻ�����, Ŭ���� ���� �ʱ�ȭ
	- �����ε�
	- �������̵�
	- ��� 
	- ������
	- ������
	- �߻�ȭ
	- �������̽�
	- ����Ŭ���� (�͸�Ŭ����, ����Ŭ����)
	- ������

�÷���  - �ڷᱸ���� �˰���
     - collection, List, Map,Set
     - ArrayList, Vector, LinkedList,
     - Queue, stack, HashSet, TreeSet
     - HashMap, treeMap,���
     
���׸� 
�ֳ����̼�
��Ʈ��
������
JAVA �⺻ ���� ��
 -> JSP - ���尴ü, M V C ����
 -> �����������ӿ�ũ - ������ ��Ʈ
 -> MVC ���� -> ������ ���θ�����Ʈ
 -> ������Ʈ(��) - TEAM
 

*/













