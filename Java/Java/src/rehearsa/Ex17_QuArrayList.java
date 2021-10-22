package rehearsa;

import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class Ex17_QuArrayList
{
	public static void main(String[] args)
	{
		LinkedList<Student> list = new LinkedList<Student>();
		
		Student st1 = new Student("가길동", 32, "1990");
		Student st2 = new Student("나길동", 33, "1989");
		Student st3 = new Student("다길동", 31, "1991");
		Student st4 = new Student("홍길동", 34, "1988");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		System.out.println("검색할 이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String deleteName = sc.nextLine();
		
		int index = -1;
		for(Student st : list)
		{
			if(deleteName.equals(st.getName()))
			{
				index = list.indexOf(st);
			}
		 
		}
		if(index==-1)
		{
			System.out.println("검색결과가 없습니다.");
		}
		else
		{
			list.remove(index).showInfo();
		}
		System.out.println("삭제후 전체정보 출력");
		for(Student st : list)
		{
			System.out.println(st);
		}
	}
}
