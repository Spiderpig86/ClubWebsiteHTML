package main.services;

import lombok.Getter;
import lombok.Setter;
import main.modelpojos.Project;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProjectServiceJPAImpl implements ProjectService {
    @Getter @Setter
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void addProject(Project project) {

    }

    @Override
    public void deleteProject(Project project) {

    }

    @Override
    public Project getProjectByName(String name) {
        return entityManager.find(Project.class, name);
    }

    @Override
    public List<Project> getProjects() {
        return entityManager.createQuery("from Project", Project.class).getResultList();
    }
}
