## AWS
- Amazon Web Services
- Host apps, databases, pages, etc. online
    - ex: databases, back-end apps, front-end web pages
    - All the hardware is managed by AWS
    - We're responsible for configuring what we need

## RDS - Relational Database Service
- Platform as a Service
    - Meaning we don't have to worry about updates, patches, etc.
    - We just have to spin up our service with the configurations we need and then we can use to store/retrieve our data
- Relational Database Service
- Pick what dialect, how much storage, back-ups, etc.

## Getting Started with AWS:
- https://aws.amazon.com/
- Create an account
    - Email
    - Credit/Debit card (but we will select all of the free options so don't worry about getting charged)
    - Personal account
    - When you first create an account, you will have access to the root user
- 2-Factor-Authentication
    - Because we enter our card info, we want to secure our account
    - 2FA makes it so we need an external verification to log in
        - In this case, it will be our phone
    - For example, once we have it set up, in order to sign in, we need:
        a. Our username/password
        b. Our phone will give us a code that we need to sign in
    - That way, if someone tries to hack us, they would need both our password and phone

### Root User
- Has access to everything in your account
- Our first step is to secure route user with 2FA
- It's bad practice to use the root user for anything other than what's required
    - You should only be using the root user for these actions: https://docs.aws.amazon.com/accounts/latest/reference/root-user-tasks.html
    - Least-Priveleged-Access
- Root user can create IAM users with limited permissions 
    - such as only being able to create RDS instances

### IAM User
- We want to use the IAM User for anything we don't require the root user for
- Spinning up services, viewing services
- IAM user is especially helpful/necessary for when multiple people use the same account
    - ex: creates a root account and then makes IAM user for Angel to log into

### Getting 2FA set up:
- Go to IAM (Identity and Access Management)
- Should be a button for add MFA/2FA to root user/account
    - Steps to follow
- You'll have to download an authenticator on your phone
    - I use the Google authenticator

### Security Group
- Configure rules to allow inbound/outbound traffic
- We want to allow traffic from our own computer to use the RDS


### Types of Deployment Models
- On-Premises
    - No use of a cloud service like AWS
    - You manage all of the hardware yourself including servers, databases, physical security
    - A lot of upfront costs associated with this (buying the data center, the hardware, hiring people etc.)
- IaaS - Infrastructure as a Service
    - No hardware we need to manage
    - We still need to handle OS, patches, security, securing our applications, etcl
    - But AWS or cloud servicer is, handles the physical center of the data centers
    - EC2 - Elastic Compute Cloud
- PaaS - Platform as a Service
    - Just managing the data and application
    - RDS - Relational Database Service
- SaaS - Software as a Service
    - Handling nothing, even the application is created by the vendor
    - We just have to sign up and use the application
    - Microsoft Office
- ![Diagram of Deployment Models](https://www.edureka.co/blog/wp-content/uploads/2016/11/RC3-04.png)
- Hybrid Model - some of our services are on-premises and some are hosted on the cloud

### AWS Shared Responsibility Model
- With cloud computing, security becomes a tricky issue:    
    - For example with RDS, we had to make sure we only allowed access from our ip address
- The AWS Shared Responsibility Model helps us keep track of who is responsible for what
- Customer Responsible for:
    - Making sure that we are utilizing AWS' encryption, password protection, IAM, etc. to 
        - Protect sensitive data
        - Secure our applications
        - Configure Firewalls to prevent attackers from successfully hacking our programs
- AWS Responsible for:
    - Anything hardware related is AWS' responsibility
    - Giving us options such as encryption, password-protection-IAM
        - The ultaimte responsibility to use these is up to the customer
- These responsibilities depend on which deployment models we use
- For example, if we were all on-premises, AWS wouldn't be responsible for anything because we wouldn't be using AWS to begin with
- For example, if we have an RDS system, we wouldn't be responsible for managing and securing the underlying OS because that's being managed by AWS
    - But we would be responsible for securing the data in the database by configuring security group, and setting up a strong password

### Global Infrastructure
- Regions
    - Geographical Location around the world
        - East US, West US
        - Ireland, etc.
    - Usually pick region based on what's closest to us or our customers
        - In order to decrease latency, etc.
    - There are services that help us deploy to whatever region is closest
- Availability Zones
    - Within regions, we have availability zones
    - Duplicate/redundant storage in case some sort of disaster hits and affects one of the AZ's
    - Within region, usually have 2 or more Availability Zones
- Data Centers
    - Low latency physical buildings within an AZ
    - Each AZ usually has one or more data center
- ![Diagram of Regions, etc.](https://cdn.ttgtmedia.com/rms/onlineimages/aws_availability_zones_vs_regions-f.png)

### Least Priveleged Access
- We don't want to use the Root User for anything that doesn't require the root user
- In general, we only want to designate permissions that are required for job duties

## IAM
- Users
    - A singular entity that has some policy attached to it
- Groups
    - A group can have a policity attached but can also contain users which those policies will be applied to
        - ex: full-stack-developers
            - Anyone in that group should have access to the services that are required for full-stack development
- Roles
    - More temporary access to certain things
- Policies
    - What is or isn't allowed for a particular entity
    - Ex: admin access to EC2 instance
    - Read access to S3