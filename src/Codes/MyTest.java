package Codes;

public class MyTest {

	void myMethod() {
		System.out.println("파라미터도 없고, 결과도 없는 메소드.");
	}

	void myMethod(int num) {
		System.out.println("정수 파라미터 1개 : " + num);
	}

	void myMethod(String str) {
		System.out.println("문구 파라미터 1개 : " + str);
	}

	void myMethod(int num, String str) {
		System.out.println("정수 1개, 문구 1개 받는 메소드");
	}

	void myMethod(String str, int num) {
		System.out.println("순서 변경 : 문구 1개, 정수 1개 받는 메소드");
	}

}
