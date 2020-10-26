package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		

char c1 = 'A';	 // " " 로 하면 문자열로 인식하기때문에 char 타입으로 연산할 수 없다.
		char c2 = 65; 	// char 타입은 정수타입이지만 출력하면 유니코드 문자형태로 나온다.
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '\u0041';	// 65를 16진수로 표현
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		System.out.println("c4:" + c4 + " c5:" +c5);

	}

}
