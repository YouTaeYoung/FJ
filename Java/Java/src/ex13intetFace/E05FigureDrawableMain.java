package ex13intetFace;

import ex13intetFace.figure.Circle;
import ex13intetFace.figure.IDrawable;
import ex13intetFace.figure.IFigure;
import ex13intetFace.figure.Rectangle;
import ex13intetFace.figure.Triangle;

public class E05FigureDrawableMain
{
	
	public static void main(String[] args)
	{
		/*
		 부모인터페이스의 참조변수로 자식객체를 참조하는 이질화 형태
		 */
		IFigure figuer = new Circle(30);
		//오버라이딩 되었으므로 별도의 형변환없이 즉시 호출가능
		figuer.area("원");
		/*
		 IFigure 인터페이스에는 area() 추상메서드만 정의되어있으므로
		 draw()를 호출하려면 다운캐스팅 후 호출할 수 있다.
		 */
		((Circle)figuer).draw("나도 원");
		
		IFigure fig1 = new Rectangle(100, 90);
		fig1.area("사각형");
		((Rectangle)fig1).draw("사각형");
		
		IDrawable draw = new Triangle(100, 90);
		draw.draw("삼각형");
		/*
		 IDrawable 인터페이스는 draw() 추상메서드만 정의되어 있으므로
		 area()호출하려면 다운캐스팅 해야한다.
		 */
		((Triangle)draw).area("삼각형");
		
		//Circle 참조변수가 동일 객체를 참조하는 동질화 형태
		Circle circle = new Circle(40);
		//모든 메서드를 호출할 수 있다.
		circle.area("원");
		circle.draw("나도 원");
	}
}
