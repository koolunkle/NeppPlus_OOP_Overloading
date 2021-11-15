package Codes;

public class MainDrive {

	public static void main(String[] args) {

		MyTest mt = new MyTest();

		mt.myMethod();
		mt.myMethod(20);
		mt.myMethod("안녕하세요.");
		mt.myMethod(20, "안녕하세요");
		mt.myMethod("안녕하세요", 20);

	}

}
