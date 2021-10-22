package rehearsa;

class Point
{
	int xDot , yDot;
	public Point(int x , int y)
	{
		xDot = x;
		yDot = y;
	}
	public void ShowPointInfo()
	{
		System.out.println("x좌표 :"+xDot+" ,y좌표"+yDot );
	}
}
class Circle 
{
	int radian;
	Point center;
	
	public Circle(int x, int y, int radian)
	{
		center = new Point(x, y);
		this.radian = radian;
	}
	public void showCircleInfo()
	{
		System.out.println("반지름 : " + radian);
		center.ShowPointInfo();
	}
}
class Ring
{
	Circle innerCircle;
	Circle outerCircle;
	
	public Ring(int in_x , int in_y, int in_radian,
			int out_x, int out_y, int out_radian)
	{
		innerCircle = new Circle(in_x, in_y, in_radian);
		outerCircle = new Circle(out_x, out_y, out_radian);
	}
	public void ShowRingInfo()
	{
		System.out.println("안쪽의정보 : ");
		innerCircle.showCircleInfo();
		System.out.println("바깥쪽원의정보 : ");
		outerCircle.showCircleInfo();
	}
}
public class QuRingMake
{
	public static void main(String[] args)
	{
		Ring c =new Ring(1,1,3,2,2,9);
		c.ShowRingInfo();
	}
}
