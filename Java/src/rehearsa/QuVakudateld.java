package rehearsa;

import java.util.Scanner;

public class QuVakudateld
{
	static boolean idValidate(String inputid)
	{
		boolean idOk = true;
		if(inputid.length()>=8 && inputid.length()<=12)
		{
			for(int i = 0 ; i< inputid.length(); i++)
			{
				char idChr = inputid.charAt(i);
				if(!((idChr >= 'a' && idChr <='z') || (idChr >= '0' && idChr <='9')))
				{
					idOk = false;
					break;
				}
			}
		}
		else
		{
			idOk=false;
		}
		return idOk;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력 하세요 : ");
		String id = scanner.nextLine();
		boolean isOk = idValidate(id);
		if(isOk == true)
			System.out.println("사용 가능한 아이디 입니다.");
		else
			System.out.println("아이디를 제대로 입력해주세요");
	}
}
