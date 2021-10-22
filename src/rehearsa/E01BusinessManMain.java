package rehearsa;

class Man
{
	private String name;
	public Man()
	{
		System.out.println("Man클래스 디폴트 생성자 호출");
	}
	public Man(String name)
	{
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출됨");
	}
	public void tellYourName()
	{
		System.out.println("내 이름은 " + name + " 입니당!");
	}
}
class BusinesMan extends Man
{
	private String company;
	private String position;
	
	public BusinesMan(String name , String company, String position)
	{
		super(name);
		
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	public void tellYourInfo()
	{
		System.out.println("회사명은 " + company + " 입니다.");
		System.out.println("직급은 " + position + " 입니다.");
		
		tellYourName();
	}
}
public class E01BusinessManMain
{
	public static void main(String[] args)
	{
		BusinesMan man1 = 
				new BusinesMan("권싹", "홈플러스", "바이어");
		BusinesMan man2 = 
				new BusinesMan("이가윤", "먹고노는", "백수");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}
}
