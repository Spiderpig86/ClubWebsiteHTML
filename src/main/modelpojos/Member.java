package main.modelpojos;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String fullName;
	private String email, major, imagePath;
	private String bio;

	@ManyToMany
	@JoinTable(name="MEMBERS_PROJECTS")
	private Set<Project> projects;
	
	private String[] urls;
	//The url is first then a space then what the link should say. For this reason, the spaces in the url MUST be escaped.
	//If it links to another website then ours it must start with http://{url}.com
	
	@Version
	private int version;

    public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public String[] getUrls() {
		return urls;
	}

	public void setUrls(String[] urls) {
		this.urls = urls;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}
