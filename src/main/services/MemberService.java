package main.services;


import java.util.List;

import main.modelpojos.Member;

public interface MemberService {
	
	void createMember(Member member);
	
	void deleteMember(Member member);
	
	void updateMember(Member member);
	
    List<Member> getMembers();

    Member getMemberByID(Integer id);
}
