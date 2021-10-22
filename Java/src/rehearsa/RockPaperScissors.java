package rehearsa;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//개발자 정의 예외 클래스
class WrongNumberException extends Exception
{
	public WrongNumberException()
	{
		super("[예외발생] 숫자를 잘못 입력했습니다.");
	}
}

public class RockPaperScissors
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		while(true)
		{
			int com = random.nextInt(10000) % 3 +1 ;
			System.out.println("컴퓨터 : " + com);
			
			int user = 0;
			try
			{
				System.out.println("가위바위보를 입력하세요.");
				System.out.print("1:가위, 2:바위, 3:보 =>> ");
				user = scanner.nextInt();
				/*
				 숫자외에 문자를 입력하면 메서드내에서 예외가 발생하므로
				 엔터키가 버퍼에 남게된다.
				 */
				//사용자가 1미만 혹은 3초과된 숫자를 내는경우 사용자 예외 발생
				if(user<1 || user>3)
				{
					WrongNumberException wne = new WrongNumberException();
					throw wne;
				}
			}
			catch (InputMismatchException e)
			{
				//버퍼에 남아있는 엔터키를 제거한다.
				scanner.nextLine();
				System.out.println("가위바위보 입력오류 (숫자만입력)");
			}
			catch (WrongNumberException e) 
			{
				System.out.println("게임과 관련된 숫자만 입력하세요(1~3사이)");
				System.out.println(e.getMessage());
			}
			
			if(!(user<1 || user>3))
			{
				if(com==1 && user==1) System.out.print("사용자:가위 , 컴퓨터: 가위\n 비겼습니다.");
				if(com==1 && user==2) System.out.print("사용자:바위 , 컴퓨터: 가위\n 이겼습니다.");
				if(com==1 && user==3) System.out.print("사용자:보 , 컴퓨터: 가위\n 졌습니다..");
				if(com==2 && user==1) System.out.print("사용자:가위 , 컴퓨터: 바위\n 졌습니다.");
				if(com==2 && user==2) System.out.print("사용자:바위 , 컴퓨터: 바위\n 비겼습니다.");
				if(com==2 && user==3) System.out.print("사용자:보 , 컴퓨터: 바위\n 이겼습니다.");
				if(com==3 && user==1) System.out.print("사용자:가위 , 컴퓨터: 보\n 이겼습니다.");
				if(com==3 && user==2) System.out.print("사용자:바위 , 컴퓨터: 보\n 졌습니다.");
				if(com==3 && user==3) System.out.print("사용자:보 , 컴퓨터: 보\n 비겼습니다.");
				
				gameCount++;
			}
			else
			{
				System.out.println("가위바위보 할줄 모름? 다시내!!! ");
			}
			if(gameCount>=5)
			{
				int restart = 1;
				try
				{
					System.out.print("1.게임재시작, 0.종료");
					restart = scanner.nextInt();
				}
				catch (InputMismatchException e) 
				{
					System.out.println("[예외발생]숫자만 입력");
				}
				if(restart==0) 
				{
					break;
				}
				else
				{
					System.out.println("게임 재시작 ^오^");
					gameCount=0;
				}
			}
		}
	}
	public static String displayRPS(int n)
	{
		String str = "";
		switch(n)
		{
		case 1: str="가위";break;
		case 2: str="바위";break;
		case 3: str="보";break;
		}
		return str;
	}
}
