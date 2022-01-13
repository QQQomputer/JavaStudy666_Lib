package com.gom.s1.lang.wrapper;

public class WrapperEx1 {

	
	public boolean ex2(String str) {
		//0		1	2	3	4	5	6	7	8	9	10	11	
		//키보드로부터 주민등록번호 입력
		//9		7	1	2	2	4-	1	2	3	4	5	6	7	-마지막 번호는 체크용번호
		//2	3	4	5	6	7	8	9	2	3	4	5
		//18	21	4	10	12	28	8	18	6	12	20	24
		//결과를 모두 더함 ex) 122

		//2. 	모두 더한 결과값을 11로 나누어서 나머지를 구함
		//122/11	->	11	....1
		
		//3.	11로 나눈 나머지값을 11에서 뱨고 그값을 체크용 번호와 같은
		//		11-1 =10==7 틀리면 잘못된 맞으면 잘만든
		
		boolean flag =true;

		String [] result = str.split("-");
		StringBuffer sb = new StringBuffer();
		sb.append(result[0]);
		sb.append(result[1]);
		
		String code = sb.toString();
		int sum=0;
		for(int i=0;i<code.length();i++) {
			int one =code.charAt(i)-48;			
			if(i>=0 && i<8) {
				sum+=one*(2+i);
			}else if(i>=8 && i<=11) {
				sum+=one*(i-6);			
			}
		}
		System.out.println(sum);
		if((11-sum%11)==code.charAt(12)-48) {
			System.out.println("정상");
		}else if((11-sum%11)/10==code.charAt(12)-48) {
			System.out.println("정상");
		}else {
			System.out.println("비정상");	
			flag=false;
		}
		return flag;
	}
	
	
	
	
	
	public void ex1(String str) {
		//키보드로부터 주민등록번호 입력
		// 991124-3234567
		// 나이를 대충 계산
		// 남자 여자
		//3-5: 계절 	봄
		//6-8: 		여름
		//9-11: 	가을
		//12-2:		겨울

		String [] result = str.split("-");

		//111111
		int cur = 22;		
		int age = cur-(Integer.parseInt(result[0])/10000)+101;
		
		System.out.println("나이 : "+age);
		int a =result[1].charAt(0)-48;
		if(a==1 ||a==3) {
			System.out.println("성별 : 남자입니다.");
			
		}
		else if(a==2||a==4) {
			System.out.println("성별 : 여자입니다.");
		}
		else {
			System.out.println("주민등록번호 기재 오류");
		}
		
		int month = (Integer.parseInt(result[0])%10000/100);
		if(month ==11||month == 12||month == 1) {
			System.out.println("계절 : 가을입니다.");
		}else if(month ==2||month == 3||month == 4) {
			System.out.println("계절 : 겨울입니다.");
		}else if(month ==5||month == 6||month == 7) {
			System.out.println("계절 : 봄입니다.");
		}else if(month ==8||month == 9||month == 10) {
			System.out.println("계절 : 여름입니다.");
		}
		
	}
	
	
}
