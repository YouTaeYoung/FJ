package ex09package.kosmo.seller;

public class FruitSeller3
{
		int numOfApple; 
		int myMoney ; 
		int apple_price; 
		
		public void initMembers(int money, int appleNum, int price)
		{
			myMoney = money;
			numOfApple = appleNum;
			apple_price = price;
		}
		public int saleApple(int money)
		{
			int num = money / apple_price;
			numOfApple -= num;
			myMoney += money;
			return num;
		}
		 
		public void showSaleResult()
		{
			System.out.println("[판매자] 남은 사과갯수 : " + numOfApple);
			System.out.println("[판매자] 판매 수익 : " + myMoney);
		}
}
