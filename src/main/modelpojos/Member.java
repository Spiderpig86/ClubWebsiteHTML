package main.modelpojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private final Integer id;

	private String fullName;
	private String email, major, imagePath;
	
	//The database has trouble persisting java objects. Until we find a way, don't use them.(Or use java arrays)
	//private final List<Project> projects;
	//private final Map<String, String> urls;

	public Member(Integer id) {
		this.id = id;
		//this.projects = new ArrayList<>();
		//this.urls = new HashMap<>();
	}

	public Member(Integer id, String fullName, String email, String major, String imagePath) {
		this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.major = major;
        this.imagePath = imagePath;
        //this.projects = new ArrayList<>();
        //this.urls = new HashMap<>();
    }

    public Integer getID() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

    /*public List<Project> getProjects() {
		return projects;
	}

    public Map<String, String> getURLS() {
		return urls;
	}*/
}
