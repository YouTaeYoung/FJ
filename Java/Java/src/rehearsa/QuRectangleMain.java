package rehearsa;

class Rectangle
{
	int width;
	int height;
	
	public Rectangle(int wi , int he)
	{
		width = wi;
		height = he;
	}
	public void ShowAreaInfo()
	{
		System.out.println("직사각형 면적 : " + (width * height));
	}
}
class Square extends Rectangle
{
	public Square(int width)
	{
		super(width, width);
	}
	@Override
	public void ShowAreaInfo()
	{
		System.out.println("정사각형면적 : " +(width * width));
	}
}
public class QuRectangleMain
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(4,3);
		rec.ShowAreaInfo();
		
		Square sqr = new Square(7);
		sqr.ShowAreaInfo();
	}
}
