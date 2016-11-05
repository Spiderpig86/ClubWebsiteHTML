package main.services;


import main.modelpojos.Member;
import java.util.List;

public interface MemberService {
    List<Member> getMembers();

    Member getMemberByID(Integer id);
}
