package javaring;

import java.util.Scanner;

public class Test_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x1 : ");
		int x1 = sc.nextInt();
		System.out.println("x2 : ");
		int x2 = sc.nextInt();
		System.out.println("y1 : ");
		int y1 = sc.nextInt();
		System.out.println("y2 : ");
		int y2 = sc.nextInt();
	
		
		if(10 <= x1 && x1 <= 200 && 10 <= x2 && x2 <= 200) {
			if(10 <= y1 && y1 <= 300 && 10 <= y2 && y2 <= 300) {
				System.out.println("사각형 안");
			}
			else {
				System.out.println("사각형 밖");
			}
		}
		else {
			System.out.println("사각형 밖");
		}
	}
}
