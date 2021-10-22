package rehearsa;

public class excallByReference
{

	public static void main(String[] args)
	{
		int[] numArr = new int [3];
		numArr[0] = 15;
		numArr[1] = 25;
		numArr[2] = 35;
		
		System.out.println("배열명(numArr)="+ numArr);
		System.out.println("numArr 3번방의 값: "+ numArr[3]);
		System.out.println("===============");
		
		int[] arrNumber = new int [35];
		for(int i = 0 ; i < arrNumber.length ; i++)
		{
			arrNumber[i] = i +10 ;
		}
		for(int i = 0 ; i < 4 ; i++)
		{
			System.out.println(i+"번방의 값 = " + arrNumber[i]);
		}

	}

}
