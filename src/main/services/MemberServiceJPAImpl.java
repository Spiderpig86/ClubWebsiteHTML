package main.services;

import lombok.Getter;
import lombok.Setter;
import main.modelpojos.Member;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class MemberServiceJPAImpl implements MemberService {

    @Getter @Setter
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Member> getMembers() {
        return entityManager.createQuery("from Member", Member.class).getResultList();
    }

    @Override
    public Member getMemberByID(Integer id) {
        return entityManager.find(Member.class, id);
    }
}
