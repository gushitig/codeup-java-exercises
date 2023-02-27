package Dependencies;

public class DepLecture {

    //dependencies - something your application depends on in order to run
    //example - libraries
    //so we arent building a project from scratch bc we can reuse other peoples projects that already work really well
    //down sides - they can change their stuff at any given moment and it an in turn break your stuff
    //so always keep track of which versions youre using and keeping them locked
    //this info is kept in a pom file by maven
    //this is how projects can be shared and set up the same on another persons computer
    //w the pom file and src folder, the whole project is portable, sharable

    //MAVEN
    //pom files has a:
    //project info section
    // dependency section
    // plug in section (ex a plugin to run a spring program)

    //java 2 primary build tools
    //Maven
    //Gradle

    //https://mvnrepository.com/
    //search for project lombok
    //if the latest date is really old be worried
    //realize that if its super new you may have to bump down
    //click ojn the version you want
    //copy and paste from maven tab to pom file

    //hit the lil refresh button or go to maven tab and hit refresh

    //important bc you can now remove the getters and setters
    //add @AllArgsConstructor
    //@Getter
    //@Setter
    //if the @toString doesnt look like what you want just override it

}
