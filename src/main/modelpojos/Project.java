package main.modelpojos;

import javax.persistence.Entity;
import javax.persistence.Id;

import main.modelpojos.validation.NotEqual;

/**
 * Contains all the data for a single project entity.
 * 
 * @author Daniel Eliasinski
 */

@Entity
public class Project {
	
	@Id
	@NotEqual(check = "create", message = "You can not name your string 'create'!")
	@NotEqual(check = "", message = "Can't be blank!")
	private String name;

	private String description;
	
	private String imagePath;
	
	@NotEqual(check = "", message = "Can't be blank!")
	private String creator;
	
	private String[] workingMembers;
	
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

	public String getCreator() {
		return creator;
	}

	public String[] getWorkingMembers() {
		return workingMembers;
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

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void setWorkingMembers(String[] workingMembers) {
		this.workingMembers = workingMembers;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
