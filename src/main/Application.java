package main;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import main.modelpojos.Member;
import main.modelpojos.Project;
import main.services.MemberService;
import main.services.ProjectService;
import main.services.RelationManager;

@SpringBootApplication
public class Application implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private RelationManager relationManager;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Member m1 = new Member();
		m1.setFullName("Daniel Eliasinski");
		m1.setEmail("nope@stonybrook.edu");
		m1.setMajor("Computer Science");
		m1.setImagePath("None");
		m1.setUrls(new String[]{"/projects/Club%20Website Club project", "https://www.google.com/ Google Website"});
		m1.setProjects(new HashSet<Project>());
		
		Member m2 = new Member();
		m2.setFullName("otehr guy");
		m2.setEmail("sup@stonybrook.edu");
		m2.setMajor("Science");
		m2.setImagePath("None");
		m2.setUrls(new String[]{"/projects/Club%20Website Club project", "https://www.google.com/ Google Website"});
		m2.setProjects(new HashSet<Project>());
		
		Member m3 = new Member();
		m3.setFullName("another guy");
		m3.setEmail("hey@stonybrook.edu");
		m3.setMajor("Computer");
		m3.setImagePath("None");
		m3.setUrls(new String[]{"/projects/Club%20Website Club project", "https://www.google.com/ Google Website"});
		m3.setProjects(new HashSet<Project>());
		
		Project p = new Project();
		p.setName("Club Website");
		p.setDescription("It's a website.");
		p.setImagePath("None");
		p.setWorkingMembers(new HashSet<Member>());
		
		memberService.createMember(m1);
		memberService.createMember(m2);
		memberService.createMember(m3);
		projectService.createProject(p);
		
		relationManager.createMemberToProjectRelation(m1.getId(), p.getName());
		relationManager.createMemberToProjectRelation(m2.getId(), p.getName());
		relationManager.createMemberToProjectRelation(m3.getId(), p.getName());
	}
}
