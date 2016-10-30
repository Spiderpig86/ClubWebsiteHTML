package main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Getter;
import org.springframework.stereotype.Service;

import main.modelpojos.Member;
import main.modelpojos.Project;

/**
 * Currently only for testing.
 * 
 * @author Daniel Eliasinski
 */
@Service
public class ProjectService {
	/** WILL BE CONVERTED TO READ AND WRITE ON DATABASE **/

	@Getter
	private final List<Project> allProjects;

	public ProjectService() {
		this.allProjects = new ArrayList<>();
	}

	public void addProject(Project project) {
		allProjects.add(project);
	}

	public void deleteProject(Project project) {
		allProjects.remove(project);
	}

	public Project getProjectByName(String name) throws NullPointerException {
		return allProjects.stream()
				.filter(project -> project.getName().equalsIgnoreCase(name))
				.findAny()
				.orElse(null);
	}

	/***** Not really sure how the stuff below is needed? *****/

	/*-------------------------------------------------------------*/

	/**
	 * Returns an ArrayList of {@link Project}s.
	 * 
	 * @return List of all projects that were found.
	 */
	/*public List<Project> getAllProjects() {
		ArrayList<Project> projects = new ArrayList<>();
		for(int counter = 0; counter < 10; counter++){
			projects.add(createNewProject());
		}
		return projects;
	}*/
	
	/**
	 * Takes a name and returns a {@link Project} object.
	 * <p><strong>WARNING: Currently creates a new project regardless of the name passed!</strong>
	 * 
	 * @param name The name of the project.
	 * @return Project with corresponding name.
	 */
	/*public Project getProjectByName2(String name){
		return createNewProject();
	}*/
	
	private final static Random r = new Random();
	private final static Member[] members = new Member[20];
	{
		for(int index = 0; index < members.length; index++){
			members[index] = new Member();
			members[index].setFullName(randomString());
		}
	}
	
	/*private static Project createNewProject(){
		Project p = new Project();
		p.name = randomString();
		p.description = "placeholder stuff lmao";
		p.imagePath = "wut";
		p.creator = members[r.nextInt(20)];
		p.workingMembers = new ArrayList<Member>();
		for(Member m : members){
			if(r.nextBoolean())p.workingMembers.add(m);
		}
		return p;
	}*/
	
	/**
	 * Creates a random String between 1 to 20 characters long.
	 * 
	 * @return A random String.
	 */
	private static String randomString(){
		char[] c = new char[r.nextInt(20) + 1];
		for(int index = 0; index < c.length; index++){
			c[index] = (char) r.nextInt(256);
		}
		return new String(c);
	}
}
