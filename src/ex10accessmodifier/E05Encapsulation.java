package ex10accessmodifier;
/*
 캡슐화(Encapsulation)
 	: 여러가지 업무 로직을 하나로 묶는다는 의미와
 	업무의 순서까지 고려한 형태의 로직을 구성한다는의미를
 	가지고있다. 즉 관련있는 로직을 하나로 묶는것을 말한다.
 */
//아래 4가지 업무는 번호 순서대로 진행해야 한다.
class MemberRegist
{
	void doMemberRegist()
	{
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPoint
{
	void doCongratulationPoin()
	{
		System.out.println("3.가입축하 10포인트 지급합니다.");
	}
}
class AutoLogin
{
	void doAutoLogin()
	{
		System.out.println("2.자동로그인");
	}
}
class FirstLoginEvent
{
	void doFirstLoginEvent()
	{
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다.");
	}
}
/*
 업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의하였다.
 차후에는 별도의 분석없이 해당 클래스의 메서드만 호출하면 업무는
 차질없이 진행될 것이다.
 */
class EncapsulLogic
{
	MemberRegist menberRegist = new MemberRegist();
	FirstLoginEvent FirstLoginEvent = new FirstLoginEvent();
	AutoLogin auoAutoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	void doprocess()
	{
		menberRegist.doMemberRegist();
		auoAutoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoin();
		FirstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation
{

	public static void main(String[] args)
	{
		/*
		 업무의 진행순서가 중요하다고 가정했을대 캡슐화 이전의 코드에서는
		 개발자가 순서를 지키지 않는 상태에서도 실행이 가능한 코드가 된다.
		 */
		 System.out.println("캡슐화 전 코드");
		 
		 MemberRegist memberRegist = new MemberRegist();
		 FirstLoginEvent FirstLoginEvent = new FirstLoginEvent();
		 AutoLogin autoLogin = new AutoLogin();
		 CongratulationPoint congratulationPoint = new CongratulationPoint();
		 
		 memberRegist.doMemberRegist();
		 FirstLoginEvent.doFirstLoginEvent();
		 congratulationPoint.doCongratulationPoin();
		 autoLogin.doAutoLogin();
		 
		 System.out.println("===========================");
		 
		 System.out.println("캡슐화 이후 코드");
		 new EncapsulLogic().doprocess();
	}

}
