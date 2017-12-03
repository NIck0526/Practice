package sample;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SamplePractice {
	

	public static void main(String[] args) throws Exception {
		
		/*
		 * 
		 * - 소스 코드와 수행결과를 Paste해 주세요. (작성한 코드를 인터넷 등 외부에 공개하지 마시오.)
- Java, C, C++ 중 택1.

- 파일명은 "PreTest.확장자"로 고정하며, 하나의 파일로만 구현하세요.

		 * 읽기 좋은 코드가 좋은 코드 입니다. 읽기 좋은 코드로 작성해 주세요.
		 ** 시간 복잡도와 메모리 이슈, 최적의 성능에 중점을 두세요.
		 *** 요구 사항이 모호하다면, 그 부분을 재정의하여 서술하고 구현하시오. 

문제) 입력받은 숫자를 한글 구음으로 변환하여 Standard out으로 출력하는 프로그램을 만들고자 합니다. 
PreTest.java라면, 아래와 같이 동작하도록 구현하시오. (입력값은 1 ~ 99999 의 정수에 한함.)

~>java PreTest 37
삼십칠

~>java PreTest 2011
이천십일

~>java PreTest 90000
구만
tochararrary 

		 */
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		List<String> list = new ArrayList<String>();
		
		// 변형 함수
		
		for(int i=0; i<input.length(); i++) {
			
			if(input.codePointAt(i)>=48 && input.codePointAt(i)<=57) {
				
				list.add((input.substring(i, i+1)));
            
				
				
				
		    }
		}
		int length = list.size();
		System.out.println(length+" 줄길이");
		System.out.println(list.get(0)+"..0칸");
		System.out.println(list.get(1)+"..1칸");
		System.out.println(list.get(2)+"..2칸");
		//System.out.println(list.get(0).replace("1", "구구구")+" 변경이라오");
		//list.add(0,list.get(0).replace("1", "구구구"));
		
		
		
	// 숫자를 글로 변환
		
		String current = "";
		
		for(int i=0; i<list.size(); i++) {
			current = list.get(i);
			
			
				if(current.equals("1")) {
				
		    	list.set(i, current.replace("1", "일"));
		    	
				}
				
				else if(current.equals("2")) { 
			 	
					list.set(i, current.replace("2", "이"));	
			 	}
				
				else if(current.equals("3")){
			  
			    	list.set(i,  current.replace("3", "삼"));
			    }
				
				else if(current.equals("4")){
			    
			    	list.set(i, current.replace("4", "사"));
			    }
				
				else if(current.equals("5")) {
			    	
		    		list.set(i, current.replace("5", "오"));
			    }
				
				else if(current.equals("6")){
			    	
			    	list.set(i, current.replace("6", "육"));
			    }	
				
				else if(current.equals("7")){
			    
			    	list.set(i, current.replace("7", "칠"));
			    }
			
				else if(current.equals("8")){
			    	
			    	list.set(i, current.replace("8", "팔"));
			    }
			
				else if(current.equals("9")){
			    	
			    	list.set(i, current.replace("9", "구"));
			    }
			    else if(current.equals("0")){
			    	
			    	list.set(i, current.replace("0", ""));
			    }
		}//for
		
		System.out.println("중간 확인 :: "+list.get(0)+", "+list.get(1)+", "+list.get(2));
		
		
		
		//숫자 자리수에 글을 붙이는 작업.
		
	
	
	
	    if(list.size()==5) {
			list.set(0, list.get(0).concat("만"));
			list.set(1, list.get(1).concat("천"));
			list.set(2, list.get(2).concat("백"));
			list.set(3, list.get(3).concat("십"));
		}
		else if(list.size()==4) {
			list.set(0, list.get(0).concat("천"));
			list.set(1, list.get(1).concat("백"));
			list.set(2, list.get(2).concat("십"));
		}
		
		else if(list.size()==3) {
			list.set(0, list.get(0).concat("백"));
			list.set(1, list.get(1).concat("십"));
		}
		
		else if(list.size()==2) {
			list.set(0, list.get(0).concat("십"));
		}
	
		
	
	System.out.println("중간 확인 :: "+list.get(0)+", "+list.get(1)+", "+list.get(2));
	System.out.println("이후 줄 수 ::"+ length);
	
		// 일십, 일백 등은 쓰지 않으므로 따로 1은 처리 해줍니다.
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals("일")){
				
				
				if(list.size()==5) {
					
					list.set(0, list.get(0).replace("일", ""));
					list.set(1, list.get(1).replace("일", ""));
					list.set(2, list.get(2).replace("일", ""));
					list.set(3, list.get(3).replace("일", ""));
				}
				
				if(list.size()==4) {
					list.set(0, list.get(0).replace("일", ""));
					list.set(1, list.get(1).replace("일", ""));
					list.set(2, list.get(2).replace("일", ""));
				}
				
				if(list.size()==3) {
					list.set(0, list.get(0).replace("일", ""));
					list.set(1, list.get(1).replace("일", ""));
				}
				
				if(list.size()==2) {
					list.set(0, list.get(0).replace("일", ""));
				}
				System.out.println("1안의 중간 확인 :: "+list.get(0)+", "+list.get(1)+", "+list.get(2));
			}// 1을 포함하였을때의  if
		}//for	
		
		
// test
		for(String solve : list) {
		System.out.print(solve);
		}
	
		
		
		
		
		
		
		
		
	}//Main

	public void addString() {
		List<String> list = new ArrayList<String>();
		for(int i=0; i<list.size(); i++) {
			
		}
	}
	
}
