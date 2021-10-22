package rehearsa;

import java.util.Scanner;

public class exmax {

	public static void main(String[] args) 
	{
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
	}
	static int returnMaxNumber(int numberCnt)
	{
		Scanner scanner = new Scanner(System.in);
		
		int maxVal = 0;
		for(int i = 1 ; i<=numberCnt ; i++)
		{
			System.out.print("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			if(i==1) {
				maxVal = inputNum;
			}
			else {
				if(maxVal<inputNum)
				{
					maxVal = inputNum;
				}
			}
		}
		return maxVal;
	}

}
