package rehearsa;

public class E01OneDimArray01
{
public static void main(String[] args)
{
	int[] numArr= new int [3];
	numArr[0] = 20;
	numArr[1] = 25;
	numArr[2] = 33;
	
	System.out.println("배열명(numArr) = " + numArr);
	System.out.println("numArr 1번방의 값 : "+ numArr[1]);
	System.out.println("============");
	int[] arrNumber = new int[35];
	for(int i = 0 ; i < arrNumber.length; i++)
	{
		arrNumber[i] = i + 10;
	}
	for(int i = 0 ; i<35 ; i++)
	{
		System.out.println(i + "번방의값 = " + arrNumber[i]);
	}
	System.out.println("=================");
	
	String[] strArr = new String[3];
	strArr[0] = "Java";
	strArr[1] = "Jsp";
	strArr[2] = "Spring";
	for(int j=0 ; j < strArr.length; j++)
	{
		System.out.println(strArr[j]);
	}
	System.out.println("=======================");
	
	System.out.println("배열의 선언과 초기화");
	System.out.println("방법 1 : 배열의 선언 이후 초기화");
	int[] initArr = new int[1];
	initArr[0] = 50;
	System.out.println("initArr[0] = " + initArr[0]);
	
	System.out.println("방법 2 : 선언과 동시에 초기화");
	int[] initArr2 = new int[] {5, 25, 55 };
	//int[] initArr2 = new int[3] { 5, 25, 55}; => 에러 발생 
	
	System.out.println("방법 3 : 초기값만으로 선언");
	int[] initArr3 = {15, 25, 35, 45, 55, 100};
	int arrSum = 0;
	for(int x = 0; x<initArr3.length ; x++)
	{
		arrSum += initArr3[x];
	}
	System.out.println("배열요소의합은 = " + arrSum);
}
}
