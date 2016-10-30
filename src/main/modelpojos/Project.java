package main.modelpojos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains all the data for a single project entity.
 * 
 * @author Daniel Eliasinski
 */

public class Project {

	@Getter @Setter
	public String name;

	@Getter @Setter
	public String description;

	@Getter @Setter
	public String imagePath;

	@Getter
	public final Member creator;

	public final Set<Member> workingMembers;

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

	public Set<Member> getWorkingMembers() {
		return workingMembers != null ? workingMembers : new HashSet<Member>() {};
	}



}
