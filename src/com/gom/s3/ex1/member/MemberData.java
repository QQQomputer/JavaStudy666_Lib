package com.gom.s3.ex1.member;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	private Scanner sc;
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data="id1-pw1-name1-id1@gmail.com- 21 -";
		this.data=this.data+"id2 - pw2 - name2 - name2@naver.com - 22 -";
		this.data=this.data+"id3 - pw3 - name3 - name3@daum.net - 23 -";
		this.data=this.data+"id4 - pw4 - name4 - name4@daum.net - 24 -";
//		System.out.println(this.data);
	}

	public void test() {
		for(int i=0;i<data.length();i++) {
			int a =data.indexOf("-",i);
			System.out.println(a);
			if(a>=0) {
				i = a;
			}
			
		}

	}
	
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		//삭제하고 싶은 ID 입력받아서
		//ArrayList 에서 삭제
		
		
		MemberDTO mDTO = null;
		System.out.println("삭제할 ID 입력");
		String delete = sc.next();
		
		
		for(int i =0;i<ar.size();i++) {

			if(ar.get(i).getId().equals(delete)){
				mDTO=ar.remove(i);
				break;
			}
			
			
		}
		if(mDTO!=null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		
		
		return mDTO;
	}
	
	
	
	public ArrayList<MemberDTO> init() {

		MemberDTO mDTO = new MemberDTO();
		StringTokenizer st = new StringTokenizer(this.data,"-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());	
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(memberDTO);
		}
		return ar;
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemverDTO를 생성해서 멤버변수값으로 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		
	}
	public void addMember(ArrayList<MemberDTO> ar) {

		//새로 추가할 MemberDTO 생성
		//키보드로 부터 id, pw, name, email, age 입력받아서
		//MemberDTO의 멤버변수 값으로 대입
		//매겨변수로 받은 ar에 MemberDTO 추가
		MemberDTO mDTO = new MemberDTO();
		MemberDTO mdto = new MemberDTO();
		
		System.out.println("ID 입력");
		mDTO.setId(sc.next());
		System.out.println("PW 입력");
		mDTO.setPw(sc.next());
		System.out.println("Name 입력");
		mDTO.setName(sc.next());
		System.out.println("Email 입력");
		mDTO.setEmail(sc.next());
		System.out.println("Age 입력");
		mDTO.setAge(sc.nextInt());//인테거 안쓰는 법		
		
		

		
		
		ar.add(mDTO);
		
		
	}
	
	
}
