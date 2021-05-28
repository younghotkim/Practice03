package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while (true) {
			
			System.out.print("선택>");
			int c = sc.nextInt();
			
			
			if (c==4) {
				System.out.println("프로그램 종료");
				break;
			}
			
			else if (c==1) {
				
				System.out.print("예금액>");
				int s = sc.nextInt();
				break;
			}
			
			else if (c==2 ) {
				
				System.out.print("출금액>");
				int d = sc.nextInt();
				
				break;
			}
			
			else if (c==3) {
				
				System.out.print("잔고액>");
				
				break;
			}
			
			else {
				System.out.println("다시입력해주세요");
				break;
			}
							
		}
		
		
		sc.close();
		
	}

}
