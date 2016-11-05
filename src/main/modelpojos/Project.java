package main.modelpojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String name;
	private String description;
	private String imagePath;

	private final Member creator;
	private final Set<Member> workingMembers;

	public Project(String name, String description, String imagePath, Member creator, HashSet<Member> workingMembers) {
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.creator = creator;
		this.workingMembers = workingMembers;
	}

	public Project(String name, String description, Member creator) {
		this(name, description, "<insert default project image path>.png", creator, null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Member getCreator() {
		return creator;
	}

	public Set<Member> getWorkingMembers() {
		return workingMembers != null ? workingMembers : new HashSet<Member>() {};
	}

}
