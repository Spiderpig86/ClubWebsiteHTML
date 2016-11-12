package main.modelpojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Project {
	
	@Id
	private String name;

	private String description;
	
	private String imagePath;
	
	@ManyToMany(mappedBy="projects")
	private Set<Member> workingMembers;
	
	@Version
	private int version;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public int getVersion() {
		return version;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Set<Member> getWorkingMembers() {
		return workingMembers;
	}

	public void setWorkingMembers(Set<Member> workingMembers) {
		this.workingMembers = workingMembers;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
