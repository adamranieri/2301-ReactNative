## Object-Oriented Programming
- How do we structure our programs to use classe
- There are 4 pillars of OOP to learn about

### Encapsulation
- We take properties/methods and "encapsulate' them into one related class, or one unit
- For example, making a car class with properties (speed, color, milage)
- Hiding our members using access modifiers
    - Example: making our variables private and using public getters/setters to access them
        - Gives us more control to the underlying data

### Inheritance
- Parent-child relationships
- We've seen this with the Object class in that every class in Java inherits from that class meaning it has all of the parent's methods and fields
- If a child extends a parent class, it will have access to all of the fields and methods that the parent can have
    - We can change how the methods work in the child (Overriding), we can also add new methods and fields
- Open for extension, closed for modification
- Animal -> Mammal -> Cat/Dog
- ![Inheritance](https://img.brainkart.com/imagebk37/yhYyQsQ.jpg)

#### Types of Inheritance
- Single - Class A inherits from B
- Multilevel - Class A inherits from B which inherits from C, etc.
- Hierarchical Inheritance - one parent can have as many children as they want
- Multiple Inheritance (NOT ALLOWED IN JAVA*) - one class extending many parents
- Hybrid (NOT ALLOWED IN JAVA) - combination of multiple and hierarchical
- Key Takeaway: One class cannot inherit multiple parents
- The exception to the Multiple and Hybrid rules is that we can implement multiple interfaces
    - We just have to implement all abstract methods we get from every interface (unless the class that's implementing is abstract)
    - See Flying Fish Example (Tuesday.OOP.Inheritance.interfaces)

### Polymorphism
#### Run-Time (Dynamic) Polymorphism
- Overriding - overriding what the parent method defined with the child implementation
- For a given class, we can only override a method once
- Inheritance and overriding
- When we override a method from a parent class, this is an example of polymorphism
- poly - many
- morphism - forms
- Same method signature (same name, same parameter, return types)
    - But in the sub-class we change the body of the method
#### Compile-Time (Static) Polymorphism
- Overloading
    - different number of parameters
    - different types of parameters
    - different order of parameters
    - key takeaway: as long as two methods don't have the exact same sequence of parameter types, it's a "valid" overload
- 2 or more methods with similar declaration (same name, but different parameters)
- We can overload a method as many times as we want, as long as we keep giving different parameters

### Abstraction
- Hiding the details of our implementation
- For example, we define the expected output/input/general behavior in a parent class but leave the specific implementation up to a child class
- In Java, we can achieve abstraction in 2 ways:
    - Abstract class
        - concrete methods have a body and actual code
        - Can have concrete and abstract methods
        - You can't have abstract methods in a concrete class
        - If we extend an abstract class, we either have to declare it as abstract or fill out the methods
        - We cannot instantiate an abstract class
        - IntelliJ shortcut: Right-Click + Generate + Implement Methods + Select methods that you want to override (taken from the parent class)
    - Interface
        - An interface is totally abstract (no concrete methods*)
            - Exceptions are default and static methods
        - An interface only has abstract methods and must be *implemented* instead of extended
- Example:
    - Shape has abstract area method which is filled out in child classes
    