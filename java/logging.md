## Logging
- Logging in Java is a way to print out informational logs 
- We get more options and capabilities with logging than we would with a simple print statement
### Logging Levels
- TRACE
- DEBUG
- INFO
- WARN
- ERROR
- FATAL
- When we log messages, we specify which "level" these messages are
- The further down that list we go, the more sever the information is
    - FATAL means the application is probably going to stop running soon, like if we can't connect to datasource
    - TRACE is a normal diagnostic piece of information

### Formatting
- We can specify how the timing of the statement is formatted
    - We know exactly what point in time the statement was logged
- We can also figure out what class the log is from

### Configuration
- logback.xml file
    - We can set up the formatting of the time here
    - We also set the log level
        - Everything at this level and more severe is displayed
        - For example, if we set the log level to INFO, we would see INFO, WARN, ERROR, FATAL messages