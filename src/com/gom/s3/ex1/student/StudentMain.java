package com.gom.s3.ex1.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.gom.s3.ex1.member.MemberDTO;
import com.gom.s3.ex1.member.MemberData;


public class StudentMain {

	public static void main(String[] args) {
		
		MemberData memberData = new MemberData();
		StudentData sd = new StudentData();
		
		//회원들의 정보 모음
		ArrayList<MemberDTO> ar = memberData.init();
		Map<String, StudentDTO> map =  sd.addStudent(ar);
		System.out.println(map);

	}

}
