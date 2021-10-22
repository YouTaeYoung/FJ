package exControlStatement;
public class Qu_04_07 
{
public static void main(String[] args) 
	{
//	 int cnt   = 0;
//	 int sum   = 0;
//	for (int i = 1; i <= 100; i++) 
//		{
//		 if (i % 3 == 0 && i % 7 == 0)
//			 {
//			           
//			 }
//			  else if (i % 3 == 0 || i % 7 == 0) 
//			   {
//			      if(cnt == 0) 
//			         System.out.print(i);
//			          else System.out.print(" + " + i);
//			          sum += i;
//			          cnt++;
//			         }
//			      }
//			      System.out.println (" = "+ sum);
int sum = 0;
// 1~100까지 반복
for(int i = 1 ; i <= 100; i++) 
{
	// 3의 배수 혹은 7의 배수
	if(i%3==0  || i%7==0)
	{//3과 7의 공배수가 아닌정수
		if(i% (3*7) !=0) 
		{
			sum += i;
			if(i!=99)
			
			System.out.print(i+"+");
			else
				System.out.print(i);
		}
	}
}
System.out.println("="+sum);//결과출력
	}

}

