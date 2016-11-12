package main.services;

import main.modelpojos.Project;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface ProjectService {
	void createProject(Project project);

	void deleteProject(Project project);
	
	void updateProject(Project project);

	Project getProjectByName(String name);

	List<Project> getProjects();
}
