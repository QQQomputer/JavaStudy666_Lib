package com.gom.s3.ex1.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.gom.s3.ex1.member.MemberDTO;

public class StudentData {

	private Scanner sc;
	
	public StudentData() {
		sc = new Scanner(System.in);
	}
	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar){
		//키보드로 부터 member의 수만큼 성적 정보 입력
		//이정보들을 StudentDTO			
		//map의 키는 id
		HashMap<String, StudentDTO> map = new HashMap<>();

		for(int i = 0;i<ar.size();i++) {
			StudentDTO sDTO = new StudentDTO();
			
			sDTO.setId(ar.get(i).getId());
			sDTO.setName(ar.get(i).getName());
			System.out.println("국어 성적 입력");
			sDTO.setKor(sc.nextInt());
			System.out.println("영어 성적 입력");
			sDTO.setEng(sc.nextInt());
			System.out.println("수학 성적 입력");
			sDTO.setMath(sc.nextInt());
			//총점
			sDTO.setTotal(sDTO.getKor()+sDTO.getEng()+sDTO.getMath());
			//평균
			sDTO.setAvg(sDTO.getTotal()/3.0);
			//map에 추가
			
			map.put(sDTO.getId(), sDTO);
			
		}


		return map;
	}
	
	
	
	
	
}
