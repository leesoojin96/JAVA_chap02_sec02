package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		

		long var1 = 10;
	/*		long var2 = 10000000000; 
			=> �ڹٴ� intŸ������ ���� ���ͷ��� �Ѵ�. 
			       �׷��� intŸ���� ������ �ѱ⶧���� long Ÿ���̶�� ���� �˷�����Ѵ�. */
			long var3 = 10000000000L; 
			// �ڿ� L �� �ٿ��ָ� long Ÿ���̶�� ���� �˷��ִ� ���̴�.
			long var4 = 5L;
			
			System.out.println(var1);
			System.out.println(var3);
			System.out.println(var4);
	}

}
