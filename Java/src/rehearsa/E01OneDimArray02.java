package rehearsa;

import java.util.Random;

public class E01OneDimArray02
{
	public static void main(String[] args)
	{
		System.out.println("### 난수생성 방법 1 ###");
		double rndNumber = Math.random();
		System.out.println("생성된 난수[실수]" + rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된 난수 [정수]" + intNumber);
		
		System.out.println("### 난수생성 방법 2 ###");
		Random random = new Random();
		System.out.println("생성된난수 : " + random.nextDouble());
		System.out.println("==============");
		
		System.out.println("1~45사이의 난수 생성 :" + ((int)((Math.random()*100)%45)+1));
		System.out.println("==========");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for(int i=0 ; i<lottoNum.length; i++)
		{
			lottoNum[i] = (int)((Math.random()*100) % 45) +1;
		}
		for(int i = 0; i<lottoNum.length ; i++)
		{
			System.out.printf("%d  ",lottoNum[i]);
		}
		
		

	}
}