## AWS
- Amazon Web Services
- Host "things" online
    - ex: databases, back-end apps, front-end web pages
    - All the hardware is managed by AWS
    - We're responsible for configuring what we need

## RDS
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
