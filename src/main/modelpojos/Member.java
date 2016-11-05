package main.modelpojos;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

@Entity
public class Member {
	
	public Member(String fullName, String email, String major, String imagePath, String[] projects, String[] urls) {
        this.fullName = fullName;
        this.email = email;
        this.major = major;
        this.imagePath = imagePath;
        this.projects = projects;
        this.urls = urls;
    }
	
	@Getter
	@Id
	private String fullName;
	
	@Getter
	private String email, major, imagePath;

	@Getter
	private String[] projects;

	@Getter
	private String[] urls;
}
