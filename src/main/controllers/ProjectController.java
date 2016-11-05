package main.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import main.services.ProjectService;

/**
 * 
 * 
 * @author Daniel Eliasinski
 */
@Controller
public class ProjectController {

    @Getter @Setter
    @Autowired
	private ProjectService projectService;
	
    /**
     * Creates the project list page.
     * @param model
     * @return Name of the template.
     */
    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String projectList(Model model){
    	model.addAttribute("projects", projectService.getProjects());
    	return "projects";
    }
    
    @RequestMapping(value = "/projects/{name}", method = RequestMethod.GET)
    public String project(@PathVariable String name, Model model){
    	model.addAttribute("project", projectService.getProjectByName(name));
    	return "project";
    }
}
