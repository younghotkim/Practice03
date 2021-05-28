package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		System.out.println("========================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("========================================");
		
		Scanner sc = new Scanner(System.in);
		
		
		int set = (int)(Math.random()*100)+1;
		
		while (true) {
			
			System.out.print(">>");
			int num = sc.nextInt();sc.nextLine();
			
			if (num<set) {
				System.out.println("더 높게");
			}
			
			else if (num>set) {
				System.out.println("더 낮게");
			}
			
			else {
				System.out.println("맞았습니다.");
				
				set = (int)(Math.random()*100)+1;
				
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				
				String answer = sc.nextLine();
				
				if ( answer == "n") {
					
					System.out.println("");
					
				}
				
				else if ( answer.equals("y") ) {
					
					System.out.println("========================================");
					System.out.println("\t[숫자맞추기게임 종료]");
					System.out.println("========================================");
				
				break;
				
				}
				
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		sc.close();
		
		
	}

}
