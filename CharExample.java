package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		

char c1 = 'A';	 // " " �� �ϸ� ���ڿ��� �ν��ϱ⶧���� char Ÿ������ ������ �� ����.
		char c2 = 65; 	// char Ÿ���� ����Ÿ�������� ����ϸ� �����ڵ� �������·� ���´�.
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '\u0041';	// 65�� 16������ ǥ��
		System.out.println(c3);
		
		char c4 = '��';
		char c5 = 44032;
		System.out.println("c4:" + c4 + " c5:" +c5);

	}

}
