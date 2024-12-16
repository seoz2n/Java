package javaring;
import java.util.Scanner;

public class Test_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력하세요 : ");
		String no = sc.next();
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print(no + name);
		
		sc.close();
	}
}
