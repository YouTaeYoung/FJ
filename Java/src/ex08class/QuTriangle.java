package ex08class;
/*
 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자. init메소드를 통해 밑변과 높이를 초기화한다.
그리고 밑변과 높이를 변경시킬수 있는 메소드와 삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

메인메소드 샘플코드]
public static void main(String[] args)
{
	Triangle t = new Triangle();
	t.init(10, 17); //밑변10, 높이17로 초기화
	System.out.println("삼각형의 넓이 : " + t.getArea());
	t.setBottom(50);//밑변 50으로 변경
	t.setHeight(14);//높이 14로 변경
	System.out.println("삼각형의 넓이 : " + t.getArea());
}
 */
class Triangle
{
	//멤버변수
	int setBottom , setHeight;
	//int bottom 밑변
	//int height 높이
	
	// 밑변과 높이를 초기화
	//this를 통해 멤버변수와 매개변수를 구분할수 있다.
	/*void init(int bottom , int height){
	 this.bottom = bottom;
	 this.height = height;
	 */
	void init(int b, int h)
	{
		setBottom = b;
		setHeight = h;
	}
	//밑변을 변경
	void setBottom(int b)
	{
		setBottom = b;
	}
	//높이를 변경
	void setHeight(int h)
	{
		setHeight = h;
	}
	//삼각형의 넓이를 계산후 반환
	  double getArea()
	{
		return setBottom * setHeight /2;
	}
}

public class QuTriangle
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
