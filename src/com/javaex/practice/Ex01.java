package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("While문");
		int index = 0;
		while (index < 3 ) {
			System.out.println("index=" + index);
			index++;
		}
		
		// index0, index=1, index=2 출력
		
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order=" + order);
		}
		
		// order0, order=1, order=2 출력 (위와 같다)

	}

}
