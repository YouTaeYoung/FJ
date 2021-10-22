package rehearsa;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	 System.out.print("시작 단 : ");
	 int starNum = scanner.nextInt();
	 System.out.print("종료 단 : ");
	 int endNum = scanner.nextInt();
	 
	 for(int dan = starNum ; dan <= endNum ; dan++) 
	 {
		 for(int su = 1 ; su <= 9 ; su++) 
		 {
			System.out.printf("%2d*%1d=%1d",dan,su,(dan*su));
		 }
		 System.out.println();
	 }
	 
	}
}
