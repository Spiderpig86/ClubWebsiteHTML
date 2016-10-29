package main.modelpojos;

import java.util.List;

/**
 * Contains all the data for a single project entity.
 * 
 * @author Daniel Eliasinski
 */
public class Project {
	
	public String name;
	public String description;
	public String imageURL;
	public Member creator;
	public List<Member> workingMembers;
}
