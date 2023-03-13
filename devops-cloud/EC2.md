## EC2 Elastic Compute Cloud
- A virtual instance of a computer hosted on the cloud that we can connect to
- We configure Image/OS, storage, CPU


### Creating an EC2 instance:
- AMI - Amazon Machine Image - starting configuration
- Instance Type - make sure it's free tier eligible, t2.micro
- Key Pair - how we authenticate ourselves when we log in to the instance
- Security Group - we want to allow SSH and HTTP
    - We will see how to change these later

### Connecting to EC2 instance
- SSH to connect to it, using our key file
- We'll need to make sure we're in the same directory as our key file
    - On Windows, recommend to put it in C/Users/user_name
        - Otherwise, might get permissions issue about accessing the key file
- On Mac, should be a command that alters the permissions
    - chmod 400 rory-key-3-13-23.pem

### Running a Web Server
- sudo yum install -y httpd
- sudo systemctl start httpd
- We won't be able to connect until we configure our security group to allow http connections
    - Security -> security group -> edit inbound rules and add a rule that allows HTTP (port 80)
- Copy the public IP address of the instance and put that in your search bar

### Exercise:
- Get an EC2 instance up and running
- Install a simple web server 
- Ensure that it's accessible and send me the link to make sure I can access it