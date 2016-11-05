package main.modelpojos;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.*;

@Entity
public class Member {

	@Getter
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private final Integer id;

	@Getter @Setter
	private String fullName;

	@Getter @Setter
	private String email, major, imagePath;

	@Getter
	private final List<Project> projects;

	@Getter
	private final Map<String, String> urls;

	public Member(Integer id) {
		this.id = id;
		this.projects = new ArrayList<>();
		this.urls = new HashMap<>();
	}

	public Member(Integer id, String fullName, String email, String major, String imagePath) {
		this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.major = major;
        this.imagePath = imagePath;
        this.projects = new ArrayList<>();
        this.urls = new HashMap<>();
    }
}
