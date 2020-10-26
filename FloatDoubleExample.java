package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
//		float var1 = 3.14; -> 자바는 실수를 기본적으로 double 타입으로 인식한다.
		float var2 = 3.14f; //float타입을 인식하게하려면 실수 뒤에 f 를 붙여야한다.
		double var3 = 3.14;
		
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.12345678945f;
		double var5 = 0.12345678945; // 더 길게 출력되기때문에 정밀도가 더 높다.
		
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
