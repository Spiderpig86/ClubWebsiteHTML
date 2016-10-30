package main.modelpojos;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Member {
	@Getter @Setter
	private String fullName, email, major, imagePath;

	@Getter @Setter
	private Integer id;

	@Getter
	private final Set<Project> projects;

	@Getter
	private final Map<String, String> urls;

	public Member() {
		this.projects = new HashSet<>();
		this.urls = new HashMap<>();
	}

	public Member(String fullName, String email, String major, String imagePath) {
        this.fullName = fullName;
        this.email = email;
        this.major = major;
        this.imagePath = imagePath;
        this.projects = new HashSet<>();
        this.urls = new HashMap<>();
    }
}
