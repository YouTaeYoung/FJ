package ex05method;
/*
 두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()


실행결과]
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23


 */

import java.util.Scanner;

public class QuSimpleOperatio {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를입력하세요");
		int s = scanner.nextInt();
		System.out.print("숫자를 입력하세요");
		int e = scanner.nextInt();
		arithmetic (s,e);
	}
		//반환값은 없고, 매개변수만 있는 메소드
		static void arithmetic(int s , int e)
		{
			int sum = s + e ;
			System.out.println("덧셈결과->"+ sum);
			int f = s - e ;
			System.out.println("뺄셈결과->"+ f);
			int a = s * e ;
			System.out.println("곱셈결과->" + a);
			int o = s / e ;
			System.out.println("나눗셈 몫->"+o);
			int p = s % e;
			System.out.println("나눗셈 나머지->"+p);
			/*
			 System.out.printf("덧셈:%d +%d = %d\n",s,e;(s+e));
			 System.out.printf("뺄셈:%d -%d = %d\n",s,e;(s-e));
			 System.out.printf("곱셈:%d *%d = %d\n",s,e;(s*e));
			 System.out.printf("나눗셈:%d /%d = %d\n",s,e;(s/e));
			 %기호를 콘솔에 출력하기 위해서 이스케이프 시퀀스를 사용함.
			 System.out.printf("나머지:%d %%d = %d\n",s,e;(s%e));
			 
			 */
		}
}
