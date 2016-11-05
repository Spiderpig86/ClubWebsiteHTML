package main.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;

import main.modelpojos.Project;

/**
 * 
 * 
 * @author Daniel Eliasinski
 */
@Service
public class ProjectService {

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	public List<Project> getProjects() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Project", Project.class).getResultList();
	}
	
    public Project getProjectByName(String name) {
    	EntityManager em = emf.createEntityManager();
        return em.find(Project.class, name);
    }
    
    public void createProject(Project project){
    	EntityManager em = emf.createEntityManager();
    	em.getTransaction().begin();
    	em.persist(project);
    	em.getTransaction().commit();
    }
}
