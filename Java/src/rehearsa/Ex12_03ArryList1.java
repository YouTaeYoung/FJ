package rehearsa;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_03ArryList1
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("디무");
		list.add("스컬판다");
		list.add("푸키");
		list.add("케네스폭스");
		list.add("라부부");
		list.add("몰리");
		
		list.add(list.size(),"사티로리");
		list.add(list.size(),"디무");
		System.out.println("저장 객체수 : " + list.size());
		
		System.out.println(list.add("푸키") ? "중복저장OK " :"중복저장 No");
		System.out.println("중복 저장 후 객체수 :" + list.size());
		
		System.out.println("\n일반for문 사용\n");
		for(int i = 0 ; i<list.size(); i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println("\n확장 for문 사용\n");
		for(Object obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println("\n반복자 (iterator) 사용\n");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n##### ##### ##### ##### ####\n");
		
		list.set(4, "라부부=>덮어쓰기");
		for(Object obj : list)
		{
			System.out.print(obj+" ");
		}
		System.out.println("\n### ### ### ### ### ### ### ###\n");
		
		list.add(4,"젤리피노=>끼어넣기");
		for(Object obj : list)
		{
			System.out.print(obj + " ");
		}
		System.out.println("\n### ### ### ### ### ### ### ### ###\n");
		
		System.out.println(list.contains("빅뱅")? "빅뱅있음" : "빅뱅없음");
		System.out.println(list.contains("스컬판다") ? "스컬있음" : "스컬없음");
		
		Object obj = list.remove(4);
		System.out.println("삭제된 객체 : " + obj);
		
		int popmart = list.indexOf("몰리");
		System.out.println("몰리의 popmart = " + popmart);
		list.remove(popmart);
		
		System.out.println(list.remove("푸키") ? "푸키삭제성공" : "푸키삭제실패");
		System.out.println(list.remove("빅뱅")? "빅뱅삭제성공" : "빅생삭제실패");
		System.out.println("삭제후 출력");
		for(Object ob : list)
		{
			System.out.print(ob + " ");
		}
		System.out.println();
		
		list.removeAll(list);
		list.clear();
		System.out.println("삭제후 객체수" + list.size());
	}
	
}
