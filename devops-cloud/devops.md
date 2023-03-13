## DevOps
- Development Operations
- a set of practices/methodologies designed to combine the development, deployment, and maintenance of code into a streamlined process
    - Involves the automation of certain tasks
    - Structured Workflows
    - Striving for efficiency and sustainability

### Continuous Integration
- Process of ensuring our code is integrated into a central location, like a repository, and testing the new code to make sure it integrates/fits in with the existing code
- Github/Gitlab
    - Push/merge our code as we go
    - With Github actions, we make sure we test these changes when we merge them
- We need Continuous Integration in order to achieve Continuous Delivery Deployment
- Integrate code frequently so we don't run into major conflicts or issues that arise from outdated code
- Makes sure that the team is working on up to date code
- Identify failures earlier
- Reduce risks of trying to merge a lot of code at one time

### Continuous Delivery
- Everything from Continuous Integration, building/testing, and deployment to staging
- The final stage of deploying to customer-base is a manual operation and requires human intervention
- Deployments can be performed "at the push of a button" after a human looks at it
- Detect issues with the build before we push it off to production
- Not fully automated because there is a human-controlled step
- Predictable Progress - consistent and iterative builds of the project
    - Each time you merge code, you run a build and you see the progress from the last build

### Continuous Deployment
- Every step of the pipeline is automated
- All stages of the DevOps are automated, no need for the human intervention to deploy at the end
- Requires that Continuous Integration and Continuous Delivery are met
- Requires rigorous communication between developers, clients, users
- Might get quicker feedback than the others Continuous Delivery/Integration because the deployment is part of the automation process
- Requires a lot of rigorous testing and build requirements to make sure that new builds adhere to the requirements of the project/application and don't break in production mode

### Sonar
- Detect code smells
- Code Quality Analysis
- Code Smells
    - Vulnurabilities
        - Security
    - Bugs
        - Functionality of the code
        - Different from things that the compile would pick up 
            - Compile could detect things like variable not initialized before use, syntax errors things
            - Code smells: unused variables
    - Code Maintainability, Code Readability
        - Confusing code
        - Repeated code - DRY - Don't Repeat Yourself
        - Unused Imports
        - Empty Code Blocks
        - Unaddressed Comments (TODO)

#### Sonar Cloud
- Online website that we can connect Github to
- Performs an analysis of one of our repositories

#### Sonar Lint
- Checks our code in real time as we write it
- Extension for VS Code that we can use
    - On the left side-bar click extensions
    - Search for SonarLint and then install it
- IntelliJ, there is a plug-in
    - File -> Settings -> Plugins
    - Search for new plugins on Marketplace