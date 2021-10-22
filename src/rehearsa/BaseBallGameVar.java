package rehearsa;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGameVar
{

	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//게임에서 사용할 변수
		int com1,com2,com3;
		int user1,user2,user3;
		int randomCnt = 0;//난수생성 카운트
		int gameCount = 0; //게임 카운트
		int strikeCnt = 0 , ballCnt = 0 ; //스트라이크,볼카운트
		
		//게임전체반복
		while (true)
		{
			//종복되지 않는 3개의 난수생성
			while(true)
			{
				randomCnt++;
				
				com1 =random.nextInt(100) %9 +1;
				com2 = random.nextInt(100) %9+1;
				com3 = random.nextInt(100) %9+1;
//				if(com1==com2 || com2==com3 || com3==com1)
//				{
//					//난수생성 실패
//					continue;
//				}
//				else
//				{
//					//생성 성공
//					break;
//				}
				if(!(com1==com2 || com2==com3 || com3==com1))
				{
					//중복되지 않는 난수 생성에 성공하면 루프탈출
					break;
				}
				
			}
			System.out.println(randomCnt+"회 : "  + com1+com2+com3);
			
		}
	}
}
