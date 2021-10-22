package exControlStatement;

public class Qu_04_06 {

	public static void main(String[] args) 
	{
/*
* 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
*
* *
* * *
* * * *
* * * * *
//*/
//		int i = 1;
//		int j = 0;
//		while (i <= 5) 
//		{
//			j = 0;
//			while (i > j) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		int i =1;
		while (i<=5) 
		{
			int j=1;
			while(j<=i) 
			{
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}

