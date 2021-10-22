package rehearsa;

class MyStatic 
{
	int instanceVar;
	static int staticVar;
	void instanceMethod()
	{
		System.out.println("instanceVar = " + instanceVar); // 접근이 가능하다
		System.out.println("staticVar = " + staticVar); //접근이 가능하다
	}
	static void staticMethod()
	{
		//System.out.println("instanceVar = " +instanceVar);//오류 발생함
		System.out.println("staticVar = " + staticVar);
		//instanceMethod(); => 오류발생함
	}
}
public class E01StaticModifier
{
	public static void main(String[] args)
	{
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 150;
		System.out.println("myStatic.instanceVar = " 
		+ myStatic.instanceVar);
		
		MyStatic.staticVar = 250;
		System.out.println("MyStatic.staticVar = " 
		+ MyStatic.staticVar);
		
		myStatic.staticVar = 350;
		System.out.println("myStatic.staticVar = " 
		+ myStatic.staticVar);
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 150 ;
		ms2.instanceVar = 1500;
		
		System.out.println("ms1.instanceVar = " + ms1.instanceVar);
		System.out.println("ms2.instanceVar = " + ms2.instanceVar);
	
		MyStatic.staticVar = 850;
		MyStatic.staticVar = 990;
		
		System.out.println("ms1.staticVar = " + ms1.staticVar);
		System.out.println("ms2.staticVar = " + ms2.staticVar);
	}
}
