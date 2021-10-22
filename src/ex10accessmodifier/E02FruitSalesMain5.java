package ex10accessmodifier;
/*
 FruitSalesMain 이전 버전은 각 클래스가 멤버변수의 초기값이
 고정되어, 상태가 다른 객체를 생성할 수 없는 단점이 있었다.
 두번째 버전에서는 다양한 초기값을 부여할 수 있도록 초기화메서드를 
 도입해 본다.
 */

//과일판매자를 추상화한 클래스
class FruitSeller3
{
	//멤버변수
	public int numOfApple; //판매자가 보유한 사과갯수
	public int myMoney ; //판매수익
	public int apple_price; //사과의 단가
	
	/*
	 	기존 상수에서 일반 변수로 변경한다.
	 	클래스의 멤버상수로 정의하는 경우 선언과 동시에 초기화해야
	 	하므로 상수는 초기값이 없는 형태로는 선언 자체가 불가능하다.
	 */
	
	/*
	 초기화 메소드를 선언하여 객체 생성후 다양한 형태의 초기화가 가능하다.
	 apple_price를 상수에서 변수로 변경한 이유는 상수는 단 한번만 초기화되므로
	 멤버메소드에서는 초기화 할수 없다. 멤버메서드는 개발자가 원할때 언제든지
	 호출 할 수 있으므로, 상수의 특성과 맞지 않기 때문이다.
	 */
	
	public void initMembers(int money, int appleNum, int price)
	{
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	public int saleApple(int money)
	{
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재 상태를 출력한다.
	public void showSaleResult()
	{
		System.out.println("[판매자] 남은 사과갯수 : " + numOfApple);
		System.out.println("[판매자] 판매 수익 : " + myMoney);
	}
}
//구매자를 추상화한 클래스
class FruitBuyer3
{
	public int myMoney;//보유한 금액
	public int numOfApple; //구매한 사과의 갯수
	//초기화 메서드 선언 
	public void iniMembers(int _myMoney , int _numOfApple)
	{
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller3 seller , int money)
	{
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult()
	{
		System.out.println("[구매자]현재 잔액 : " + myMoney);
		System.out.println("[구매자]사과갯수 : " +numOfApple);
	}
	
}
//프로그램의 출발점이 되는 메인 클래스
public class E02FruitSalesMain5
{
	public static void main(String[] args)
	{
		/*
		 초기화 메서드가 정의되었으므로 상태가 다른 객체를 생성할 수 있다.
		 */
		
		//판매자1 : 사과 100개 , 단가 1000원
		FruitSeller3 seller1 = new FruitSeller3(); //판매자 객체
		seller1.initMembers(0,100,1000);
		//판매자2 : 사과 80개 , 단가 500원
		FruitSeller3 seller2 = new FruitSeller3(); //구매자 객체
		seller2.initMembers(0,80,500);
		//구매자 : 보유금액 10000원
		FruitBuyer3 buyer = new FruitBuyer3();
		buyer.iniMembers(10000,0);
		//////////////////////////////////////////////
		/*
		 아래의 코드는 문법적으로는 오류가 없으나 지불금액과 구매한 사과의
		 관계가 전혀 마지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메서드)로 구현한 규칙이 완전히 무너지게 된다.
		 객체지향 프로그래밍에서는 이런 오류를 막기위해 멤버변수에 대한
		 "정보은닉"을 하도록 규정하고 있다.
		 */
		seller1.myMoney += 1000;	// 판매자1에게 1000원을 지불하고
		seller1.numOfApple -=50;	//사과50개를 구매한다.
		buyer.numOfApple +=50;		//구매자는 50개가 증가하였다.
		
		seller2.myMoney +=1000; 	//판매자2에게 1000원을 지불하고
		seller2.numOfApple -=70;	//사과 70개를 구매했다.
		buyer.numOfApple +=70;		//따라서 구매자는 70개가 증가했다.
									//하지만 구매자의 금액은 차감되지 않는다.
		
		System.out.println("구매행위가 일어난 후의 상태2");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}
}
