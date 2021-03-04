package day_18;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(100);
		arr.add(1.234);
		arr.add("aaa");
		//Object로 받아지기 때문에 형변환을 해야한다.
		Object a = arr.get(0); 
		int aa = (int) a;
		
		ArrayList<Double> arr1 = new ArrayList();
		//arr1.add(111);
		arr1.add(1.234);
		//arr1.add("문자열");
		
		double aaa = arr1.get(0); //타입이 명확하다.
	}
}
