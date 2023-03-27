## DevOps Study Guide

+ DevOps culture
  + Automation - reduce manual work
  + Agility - reduce time from commit to deploy
  + Continuous Integration
    + Team members continually push changes
    + Changes get integrated and tested
    + Team gets notified of build failures
  + Continuous Delivery
    + CI + always have project in a deployable state
  + Continuous Deployment
    + CI + automated deployments
  + DevOps & Agile
    + DevOps processes enable fast feedback, help adapt to change in Agile
+ SonarCloud
  + Static code analysis tool for overall code quality reports, including defects, code smells, technical debt
+ CI/CD Pipeline Tools
  + Steps of a pipeline
    + Code is committed and pushed to central VCS system
    + Webhook triggered
    + CI tool pulls from VCS system and compiles the code
    + CI tool can send source code to static analysis tool
    + CI tool runs unit tests
    + CI tool builds the project into an artifact
    + CI tool deploys artifact to dev / production environment
  + Github Actions
+ Infrastructure as Code
  + Manage cloud resources as code
  + Enables easy & quick deployments, rollbacks, and versioning
  + Tools:
    + AWS Cloudformation

## Docker Study Guide

- Containers and containerization of applications
- Containers vs Virtual Machines (VMs)
- Docker images
- Docker containers
- Dockerfile keywords
  - FROM
  - ADD
  - CMD
  - ENTRYPOINT
  - RUN
  - EXPOSE
- Image layers
- Docker commands
  - docker build
  - docker run
  - docker images
  - docker pull
  - docker push
  - docker ps
- Container registries
  - DockerHub
- Docker compose
- Volumes