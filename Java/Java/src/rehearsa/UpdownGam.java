package rehearsa;

import java.util.Random;
import java.util.Scanner;

public class UpdownGam
{
	public static void UpdownGamstart()
	{
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int restart;
		boolean forEnd = false; 
		
		while (true)
		{
			int computerNum = random.nextInt(10000) % 100 +1;
			System.out.println("컴퓨터가 생성한 난수 : "+ computerNum);
			
			for(int i = 1 ; i<=7 ; i++)
			{
				System.out.println("1~100까지 숫자 입력 : ");
				int userNum = sc.nextInt();
				
				if (userNum > computerNum)
				{
					System.out.println("Down 더 낮은 숫자임");
				}
				else if (userNum < computerNum);
				{
					System.out.println("Up 더 높은 숫자임");
				}
				
				
			}
		}
	}

	public static void main(String[] args)
	{
		UpdownGamstart();
		

	}

}
