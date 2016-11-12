package main.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;

import main.modelpojos.Member;

@Service
public class MemberServiceJPAImpl implements MemberService {
	
    private EntityManagerFactory emf;
    
    @PersistenceUnit
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

    @Override
    public List<Member> getMembers() {
        return emf.createEntityManager().createQuery("from Member", Member.class).getResultList();
    }

    @Override
    public Member getMemberByID(Integer id) {
        return emf.createEntityManager().find(Member.class, id);
    }

	@Override
	public void updateMember(Member member) {
		EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.merge(member);
    	em.getTransaction().commit();
	}

	@Override
	public void createMember(Member member) {
		EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(member);
    	em.getTransaction().commit();
	}

	@Override
	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		
	}
}
