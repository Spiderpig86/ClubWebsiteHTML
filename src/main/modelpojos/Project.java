package main.modelpojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
public class Project {

	@Getter @Setter
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	public String name;

	@Getter @Setter
	public String description;

	@Getter @Setter
	public String imagePath;

	@Getter
	public final Member creator;

	public final Set<Member> workingMembers;

	public Project(String name, String description, Member creator) {
		this(name, description, "<insert default project image path>.png", creator, null);
	}

	public Set<Member> getWorkingMembers() {
		return workingMembers != null ? workingMembers : new HashSet<Member>() {};
	}

}
