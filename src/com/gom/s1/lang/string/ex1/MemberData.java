package com.gom.s1.lang.string.ex1;

public class MemberData {

	private String data;
	
	public MemberData() {
		
		this.data="id1-pw1-name1-id1@gmail.com-";
		this.data=this.data+"id2 - pw2 - name2 - name2@naver.com -";
		this.data=this.data+"id3 - pw3 - name3 - name3@daum.net - ";
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
	
	

	public MemberDTO[] test2() {
		MemberDTO mDTO=null;
		String[] result = data.split("-");

		MemberDTO[] memberDTO= new MemberDTO[result.length/4];
		for(int i=0;i<result.length;i++) {
			result[i]=result[i].trim();			
//			System.out.println(result[i]);
			if(i%4==0) {
				mDTO = new MemberDTO();
				mDTO.setId(result[i]);
			}else if(i%4==1) {
				mDTO.setPw(result[i]);
			}else if(i%4==2) {
				mDTO.setName(result[i]);
			}else if(i%4==3) {   
				mDTO.setEmail(result[i]);				
				memberDTO[i/4]=mDTO;
			
			}			
		}
		return memberDTO;
	}
}
