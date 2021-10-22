package exControlStatement;

import java.io.IOException;


public class Qu_04_01 {
/*
 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
실행결과] 아래는 2번 실행하였습니다.

 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("하나의문자를입력하세요");
		int asciiCode = System.in.read();
		System.out.println( (asciiCode>='0' && asciiCode <='9') ? "숫자입니다":"숫자가아닙니다");
	/*
	  system.out.print("하나의 문자를 입력하세요);
	  int ascii = system.in.read();
	  
	  삼항연산자의 형식
	  	변수 = (조건식) ? "참일때" : "거짓일때";
	  아스키코드를 알때 (47~58사이)
	  String result =(ascii>=47 && ascii<=58) ? "숫자입니다" : "숫자가아닙니다";
	  System.out.println((char)ascii+" 는"+result); 
	  아스키코드를 모를때 
	  result =(ascii>='0' && ascii<='9') ? "숫자입니다" : "숫자가아닙니다";
	  System.out.println((char)ascii+" 는"+result); 
	 */


	}

}
