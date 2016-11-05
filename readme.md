# SBU Web and App Club Website

This is a website for the club to serve as our first project and showcase for our members and upcoming projects. The website is constructed with a combination of Spring (Java Back-end) and HTML, CSS, and Javascript (Front-end) with a responsive design.

## Website Features

1. Homepage with smoothscrolling and parallax (maybe?)
2. Members page showcasing personal projects, bio, and contact information.
3. Idea submission board for the public.
4. Maybe a club logo?

### Haven't Started:
  - Framework.java  
  - ideas.html
  
#### Note: Html files have to be inside src/main/resources/templates/ in order for Spring to see them!

### In Progress:
  - index.html
  - Member.java  
  - members.html  
  - members.css  
  - MemberController.java

### Finished:
  - Project.java  
  - ProjectController.java
  - projects.html (Needs CSS)
  - project.html (Needs CSS)
  - project_create.html (Needs CSS)

# Webpages
1. Members
2. Projects
3. Homepage
4. Idea Submissions

## Members Webpage 
  - Member.java:

    ```
    String mFullname
    String mEmail  
    String mMajor  
    String mImagePath  
    List<Project> mProjects  
    HashMap<String, String> mUrls
    ```
  - members.html  
  - members.css  
  - Project.java  
  - Framework.java  
  - MemberController.java
  
## Projects Webpage
   - /projects:
     List of all projects
   - /projects/{project_name}:
     Full page dedicated to one project.
   - /projects/create (method = POST):
     Where da magic happens :)
   - /projects/create (method = GET):
     The actual page where you can create your project.
     Fields are:
    - Project Name (Can't be 'create' or will interfere with navigation.)(Can't be blank)(Can't be the same as one that already exists)
    - Project Description
    - Image URL (Has a default one that we specify)
    - Creator (Can't be blank)
    
## Homepage
   - index.html
     - regular.css (Standard css for default view)
     - mobile.css (Mobile optimized css)
     - app.js (If we need it)
    


## Idea Submissions Webpage
  - ideas.html
   - CSS file naming pending


### Resources

- Hungarian Notation (as discussed by Chris)
  - [Hungarian Notation examples](https://en.wikipedia.org/wiki/Hungarian_notation#Examples, "If you're reading this, you are cool.")
