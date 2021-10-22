package rehearsa;

import java.util.Scanner;

public class excase 
{
	static String getSum() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수");
		int kor = scanner.nextInt();
		System.out.print("영어점수");
		int eng = scanner.nextInt();
		System.out.print("수학점수");
		int math = scanner.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		String hakjum="";
		int result = (int) avg / 10;
		switch(result)
		{
		case 10: case 9:
			hakjum = "A"; break;
		case 8 : 
			hakjum = "B"; break;
		case 7 :
			hakjum = "C";
		default :
			hakjum = "F";
		}
		return hakjum;
	}
	public static void main(String[] args) 
	{
		System.out.println("당신의 학점은" + getSum()+"입니다.");
		String h = getSum();
		System.out.printf("당신의 학점은 %s 입니다.",h);
	}
}

