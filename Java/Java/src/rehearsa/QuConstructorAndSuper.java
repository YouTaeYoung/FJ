package rehearsa;

class Car
{
	int gasoline;
	public Car(int g)
	{
		gasoline = g;
		System.out.println("Car생성자 호출");
	}
}
class HybridCar extends Car
{
	int electric;
	
	public HybridCar(int g, int e)
	{
		super(g);
		electric = e;
		System.out.println("HybridCar생성자 호출");
	}
}
class HybridWaterCar extends HybridCar
{
	int water;
	public HybridWaterCar(int g , int e, int w)
	{
		super(g,e);
		water = w;
		System.out.println("HybridWaterCar생성자 호출");
	}
	
	public void showNowGauge()
	{
		System.out.println("남은 가솔린 " + gasoline);
		System.out.println("남은 전기량 " + electric);
		System.out.println("남은 워터량 " + water);
	}
}

public class QuConstructorAndSuper
{

	public static void main(String[] args)
	{
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}

}
