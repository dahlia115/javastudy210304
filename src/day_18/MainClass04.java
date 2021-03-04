package day_18;
//toString
class Test{
	String id = "test";
	String name = "aaaa";
	String nicName = "홍길동";
	
	public String toString() {
		return "[id = "+id+" ,name = "+ name +" , nicName = " + nicName+"]";
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t);
		System.out.println(t.toString());
		
		String s = "test";
		System.out.println(s);
		System.out.println(s.toString()); 
	}
}
