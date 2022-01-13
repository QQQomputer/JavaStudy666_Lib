package com.gom.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.gom.s3.ex1.member.MemberDTO;

public class StudentData {

	private String info;
	Scanner sc = new Scanner(System.in);
	public StudentData() {
		this.info="name1,1,15,50,60,";
		this.info=this.info+"name2,2,52,68,40,";
		this.info=this.info+"name3,3,80,87,75,";
	}

	//학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	//학생의 정보를 추가
	//학생의 정보를 삭제
	
	
	public void test1() {
		
		StudentDTO sDTO = new StudentDTO();
		
		StringTokenizer st = new StringTokenizer(info,",");
		ArrayList<StudentDTO> ar = new ArrayList();
		
		
		while(st.hasMoreTokens()) {			
			sDTO.setName(st.nextToken());
			sDTO.setCode(st.nextToken());
			sDTO.setKor(Integer.parseInt(st.nextToken()));
			sDTO.setEng(Integer.parseInt(st.nextToken()));
			sDTO.setMath(Integer.parseInt(st.nextToken()));
			int total = sDTO.getKor()+sDTO.getEng()+sDTO.getMath();
			double avg = total/3.0;
			sDTO.setTotal(total);
			sDTO.setAvg(avg);						
		}
		System.out.println("학생 정보 입력 완료");
		
	}
	
	public void test2() {
		
		
		StudentDTO sDTO = new StudentDTO();
		
		
		
		
		
		
	}
	
	
	
	
	/*
	오늘의 음악순위
	-제목가수명 조회수 기획사
	새로운 차트에 올라온 노래 차트인도 넣어보고
	다시 떨어지면 차트 아웃도 시켜보고
	스스로 문제를 만들고 스스로 풀어보기
	*/
	
	
}
