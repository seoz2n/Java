package javaring;
import java.util.Scanner;

public class Test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("y : ");
		int y = sc.nextInt();
		
		if(10 < x && x < 200) {
			if(10 < y && y < 300) {
				System.out.println(String.format("점 (%d, %d)는 사각형 안에 있습니다.", x, y));
			}
			else if(y == 10 || y == 300) {
				System.out.println(String.format("점 (%d, %d)는 사각형 선 상에 있습니다.", x, y));				
			}
			else {
				System.out.println(String.format("점 (%d, %d)는 사각형 밖에 있습니다.", x, y));
			}
		}
		else if(x == 10 || x == 200) {
			if(10 < y && y < 300) {
				System.out.println(String.format("점 (%d, %d)는 사각형 안에 있습니다.", x, y));
			}
			else if(y == 10 || y == 300) {
				System.out.println(String.format("점 (%d, %d)는 사각형 선 상에 있습니다.", x, y));
			}
			else {
				System.out.println(String.format("점 (%d, %d)는 사각형 밖에 있습니다.", x, y));
			}
		}
		else {
			System.out.println(String.format("점 (%d, %d)는 사각형 밖에 있습니다.", x, y));
		}
	}
	
}
