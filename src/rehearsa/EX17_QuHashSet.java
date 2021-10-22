package rehearsa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


class Avengers
{
	String name;
	String heroName;
	String weapon;
	
	public Avengers(String name, String heroName, String weapon)
	{
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}
	@Override
	public String toString()
	{
		return "Avengers[본명=" + name +", 닉네임 =" 
	+ heroName +", 능력 =" + weapon+ "]";
	}
	
	@Override
	public int hashCode()
	{
		int nameHcode = this.name.hashCode();
		int heroHcode = this.heroName.hashCode();
		int weaponHcode = this.weapon.hashCode();
		
		System.out.println("hashCode() 호출됨 " + nameHcode);
		return nameHcode + heroHcode + weaponHcode;
	}
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("equals() 호출됨");
		Avengers avengers = (Avengers)obj;
		if(this.name.equals(avengers.name)
				&& this.heroName.equals(avengers.heroName)
				&& this.weapon.equals(avengers.weapon))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class EX17_QuHashSet
{
	public static void main(String[] args)
	{
		HashSet<Avengers> set = new HashSet<Avengers>();
		
		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부 & 점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);
		
		System.out.println("[최초 전체 정보 출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요");
		String searchName = sc.nextLine();
		
		boolean isFind = false;
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext())
		{
			Avengers avn = itr.next();
			if(searchName.equals(avn.name))
			{
				System.out.println(avn);
				isFind = true;
			}
		}
		if(isFind==false)System.out.println("해당 영웅은 없음요");
	}
	
}
