## Maven
- Build automation tool
    - helps us build our projects, incorporating all of the dependencies we needs (such as JUnit)
    - We use it for JDBC (Java Database Connectivity) as well

## Installation
- Follow this link: https://maven.apache.org/install.html
- Download link: https://maven.apache.org/download.cgi
    - Download the bin
- Windows:
    - Take the download, move it to your C Drive and unzip
        - Doesn't necesarily have to be C drive, just make sure to grab the path to it
    - Update the path
        - Search "Environment Variables" and click "Edit the System Environment Variables"
        - Click on "Environment Variables" and select "Path" and then edit
        - In the Path menu, click on New and then paste in the path to the bin folder

## Creating a Maven Project
- In your IDE, you can create a new project and there should be an option to build a new Maven project
    - Give it a name, directory, etc.
    - Archetype is a starting template for your project
        - We'll choose maven-archetype-quickstart
            - This particular archetype includes JUnit
            - Sets up main and test directories
    - For any MAven project, it will generate a pom.xml

### POM - Project Object Model
- Contains metadata like name, version, etc.
- A list of dependencies or external libraries that we're working with
- Whenever we want to add a new dependency, we just update the pom.xml and sync the project
    - In IntelliJ, we should see a blue circle icon to sync

### Maven Central Repository
- Search for dependencies and view stats like number of usages or latest release
- If we click on one of these, we should see a list of versions
    - Clicking on a particular version should let us see the exact code that we need to paste into our pom xml in order to add that dependency to our project