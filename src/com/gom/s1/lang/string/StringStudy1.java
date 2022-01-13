package com.gom.s1.lang.string;

public class StringStudy1 {

	public void splitTest() {
		String name = "iu, suji, choa, 펭수, 춘식이";
		String[] result = name.split(", ");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}
	
	
	public static void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println(result);
	}
	
	public void trimTest() {
		String title = " West Side Story ";
		//int num
		String result = title.trim();
		System.out.println("트림 쓰기 전 : \t"+title);
		System.out.println("트림 쓴 후 : \t"+result);
	}
	
	
	
	public void caseTest() {
		String title = "West Side Story";
		String result = title.toLowerCase();
		System.out.println(result);
		String result1 = title.toUpperCase();
		System.out.println(result1);
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		String result = title.replace('S', 't');
		System.out.println(result);
	}
	
	
	
	public void subStringEx1() {
		//키보드로부터 업로드할 파일명을 입력
		//a.txt, b.pdf, iu.jpg
		//jpg, gif, png -> 이미지파일입니다 출력
		//txt, pdf, hwp ->문서
		//mp3, wav, ogg ->음원
		//나머지는 알 수 없는 파일입니다.
		
		String str = "a.ogg";
		
		int a = str.indexOf(".");
		
		String result = str.substring(a,str.length());

		if(result.equals(".txt")||result.equals(".pdf")||result.equals(".hwp")) {
			System.out.println("문서파일입니다.");
		}else if(result.equals(".jpg")||result.equals(".gif")||result.equals(".png")) {
			System.out.println("이미지파일입니다.");			
		}else if(result.equals(".mp3")||result.equals(".wav")||result.equals(".ogg")) {
			System.out.println("음원파일입니다.");			
		}else {
			System.out.println("알 수 없는 파일입니다.");
		}				
	}
	
	
	public void subStringTest() {
		String title = "West Side Stroy";
		String result = title.substring(title.indexOf("S"));
		System.out.println(result);
		result = title.substring(5,9);
		System.out.println(result);
		
		
		
	}
	
	public void lengthTest() {
		String title = "West Side Stroy";
		int len = title.length();

		//한글자씩 출력		
		String find="Side";
		int count=0;
		for(int i=0;i<title.length();i++) {
			int index = title.indexOf(find, i);
			
			if(index>=0) {
				count++;
				i=index;
			}			
		}
		System.out.println("Count : "+count);		
		
		
	}
	public void charAt1() {
		String title = "West Side Stroy";
		for(int i =0;i<title.length();i++) {
			System.out.print(title.charAt(i)+"\n");
		}
		
	}
	
	
	public void indexOfTest() {
		String msg ="Hellow World";
		//indexOf 호출		
		System.out.println(msg.indexOf("o"));
	}
	public void indexOfTest1() {
		String msg ="Hellow World";
		//indexOf 호출
		int num = msg.indexOf('o',6);
		System.out.println(num);
	}
	
	
	public void equalTest() {
		String str = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		
		System.out.println(str2);
		System.out.println(str);
		
//		System.out.println("Str : "+str);
//		System.out.println("Str2 : "+str2);
		System.out.println(str==str2);
		System.out.println(str3==str4);
		System.out.println(str==str3);
		System.out.println("===============");
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str4));
		System.out.println(str.equals(str3));		
	}
	
	
	public char study1() {
		String name = "Hello";
		int i =0;
		
		return name.charAt(i);
//		String name2 = new String ("hello2");
//		System.out.println(name2);
	}
	
	

}
