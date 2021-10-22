package rehearsa;

import java.util.Random;

public class BubbleSort
{
	public static void main(String[] args)
	{
		Random random = new Random();
		int[] arr = new int[10];
		while(true) 
		{
			//난수 10개를 생성
			for(int i = 0 ; i<arr.length ; i++)
			{
				arr[i] = random.nextInt(100)+1;
			}
			//중복체크위한변수
			boolean rndflag = false;
			//중복확인
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<arr.length; i++)
				{
					if(arr[i] == arr[j])
					{
						rndflag = true;//중복된 값이 발견되면 true로 변경
					}
				}
			}
			
			if(rndflag == false) break;
			System.out.println("난수생성시도");
		}
		
		//난수확인
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//버블정렬
		int temp;
		for(int i=0; i<arr.length-1 ; i++)
		{
			/*
			 실제 요소값에 대한 비교를 진행하여 큰 숫자를 뒤로 보내준다.
			 즉, 요소1과 2를 비교하여 요소1이 크다면 두 요소를  교환(swap)한다.
			 한번 스캔을 완료하면 가장 큰 숫자가 제일 뒤로 밀리게 되므로
			 비교의 구간을 하나 줄여주기 위해 i를 차감한다.
			 */
			for(int j=0; j<(arr.length-1)-i; j++)
			{
				//앞의 숫자가 더 크다면 뒤의 숫자와 교환한다.
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int k=0; k<arr.length; k++)
			{
				System.out.print(arr[k]+ " ");
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	
	}
}
