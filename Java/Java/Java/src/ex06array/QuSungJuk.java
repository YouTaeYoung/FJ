package ex06array;
/*
 다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.

 */

import java.util.Scanner;

public class QuSungJuk
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요?");
		int num = scanner.nextInt();
		System.out.printf("학생수:%d", num);
		int[][] sum = new int [num][3];	//학생점수를 저장할 2차원배열
		System.out.println();
		
		for(int i=0; i<num; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n",i+1);
			System.out.printf("국어점수 : ");
			sum[i][0] = scanner.nextInt();
			System.out.printf("영어점수 : ");
			sum[i][1] = scanner.nextInt();
			System.out.printf("수학점수 : ");
			sum[i][2] = scanner.nextInt();
		}
		
		System.out.println("==========================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("==========================");
		for(int i=0; i<num; i++) {
			System.out.printf("%2d %3d %3d %3d %3d %3.2f\n", i+1, sum[i][0], sum[i][1], 
					sum[i][2], sum[i][0]+sum[i][1]+sum[i][2], 
					(sum[i][0]+sum[i][1]+sum[i][2])/3.0);
		}
		System.out.println("==========================");

	}
}


