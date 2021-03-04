package day_18;

//오버로딩 매게변수와 타입이 다르면 서로 다른 것으로 인식한다.
class Print {
	public void print(int a, int b) {
		System.out.println(a+" : "+b);
	}
	public void print(String a, String b) {
		System.out.println(a+" : "+b);
	}
}
//generic 타입을 부여해서 만든다.
class Print02<T>{
	public void print(T a, T b) {
		System.out.println(a+" : "+b);
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		Print p = new Print();
		p.print(10, 20);
		p.print("문자열", "안녕하세요");
		
		Print02<Integer> pp1 = new Print02();
		pp1.print(10, 20);
		Print02<String> pp2 = new Print02();
		pp2.print("문자열", "하이~");
	}
}










