package rehearsa;
/*
 시나리오] 주민등록번호를 이용하여 성별을 판단하는
 프로그램을 작성하시오.
 190419-3000000 = > 남자
 190419-4000000 => 여자
 */
public class exstringcharat
{
	public static void main(String[] args)
	{
		
	String juminNum = "890810-100000000" ;
	if(juminNum.charAt(7) == '1' || juminNum.charAt(7) == '3')
	{
		System.out.println("남자입니다.");
	}
	else if(juminNum.charAt(7) == '2' || juminNum.charAt(7) == '4')
	{
		System.out.println("여자입니다.");
	}
	else if(juminNum.charAt(7) == '5' || juminNum.charAt(7) == '6')
	{
		System.out.println("외국인입니다.");
	}
	else
	{
		System.out.println("주민번호가 잘못 되었씁니다.");
	}
	}
}


