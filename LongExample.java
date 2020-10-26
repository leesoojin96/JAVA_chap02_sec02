package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		

		long var1 = 10;
	/*		long var2 = 10000000000; 
			=> 자바는 int타입으로 정수 리터럴을 한다. 
			       그래서 int타입의 범위를 넘기때문에 long 타입이라는 것을 알려줘야한다. */
			long var3 = 10000000000L; 
			// 뒤에 L 을 붙여주면 long 타입이라는 것을 알려주는 것이다.
			long var4 = 5L;
			
			System.out.println(var1);
			System.out.println(var3);
			System.out.println(var4);
	}

}
