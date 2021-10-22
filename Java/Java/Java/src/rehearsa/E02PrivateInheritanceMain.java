package rehearsa;

class Account
{
	private int money;
	public Account(int init)
	{
		money = init;
	}
	protected void depositMoney(int _money)
	{
		if(_money<0)
		{
			System.out.println(" 마이너스 금액은 입금 불가");
			return;
		}
		money += _money;
	}
	protected int getAccMoney()
	{
		return money;
	}
}

class SavingAccount extends Account
{
	public SavingAccount(int initVal)
	{
		super(initVal);
	}
	public void saveMoney(int money)
	{
		depositMoney(money);
	}
	public void showAccountMoney()
	{
		System.out.println(" 누적 금액 : " + getAccMoney());
	}
}
public class E02PrivateInheritanceMain
{
	public static void main(String[] args)
	{
		SavingAccount  sa = new SavingAccount(1000000);
		
		sa.saveMoney(50000);
		sa.showAccountMoney();
		
		sa.saveMoney(150000);
		sa.showAccountMoney();
		
		sa.saveMoney(-1500000);
		sa.showAccountMoney();
		
		Account account = new Account(15000);
	}
}
