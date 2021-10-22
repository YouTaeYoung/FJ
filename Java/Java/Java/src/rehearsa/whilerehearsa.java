package rehearsa;

public class whilerehearsa {

	public static void main(String[] args) {
	/*
	 시나리오] 1~100까지의 합을 구하는 프로그램을 for문을
	 이용하여 작성하시오.
	 */
//		int sum = 0;
//		for(int i =1 ; i<=100; i++) {
//			sum+=i;
//		}
//		System.out.println("1~100까지의합:"+sum);
		
	/*
	 * 시나리오] 1~10까지의 정수중 2의배수의 합을 구하시오
	 */
		int are = 0;
		for(int k =1 ; k<=10 ; k++) {
			if(k%2==0) {
				are +=k;
				
			}
		}
		System.out.println("2의배수의합은:"+are);
		
		for(int x=1; x <=8 ; x++) {
			for(int y=1; y <= 8; y++) {
				if(x+y==9) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		
	 for(int jj=2; jj<=9 ; jj++) {
		 for(int ii=1 ; ii<=9; ii++) {
			 System.out.printf("%2d*%2d=%2d",jj,ii,(jj*ii));
			
		 }
		 System.out.println();
	 }
	}

}
