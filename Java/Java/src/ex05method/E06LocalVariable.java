package ex05method;
/*
 Local variable(지역변수)
 -변수는 사용범위(scope)를 가지고있고, 해당 지역내에서만
 	사용할 수 있다.
 -해당 지역을 벗어나면 즉시 메모리에서 소멸된다.
 -기본자료형은 스택(Stack)이라는 메모리 공간을 사용한다.
 -스택은 CPU가 메모리의 생성 및 소멸을 주관한다.
 */
public class E06LocalVariable 
{

	public static void main(String[] args) 
	{
		boolean scope = true;
		//int num = 9 ; 에러발생
		if(scope)
		{
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역 :" + num);
		}
		else
		{
			int num =5 ;
			System.out.println("첫번째 if문의 else지역:"+num);
		}
		int num=100;
		System.out.println("main메소드지역:"+num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
	}
	static void simpleFunc()
	{
		int num=1000;
		System.out.println("simple메소드지역:"+num);
	}
		
}

	