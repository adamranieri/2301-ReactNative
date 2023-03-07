## Collections
- So far, we've seen the array which is fairly limited because 
    - Static sized so we can't change the size of the array once we declare it
- With the Collections Framework, we get a lot more types of collections/structures with  a lot more functionality
- Collection interface: https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
    - add
    - size
    - clear

### Lists
- Main implementations that we'll look at are LinkedList and the ArrayList
- Allow duplicates
- Insertion order is maintained
    - Unless we explicitly state that we want to insert at a specified position, our list will be in the same order that we inserted

### Sets
- Sets cannot contain duplicate elements
- Insertion order isn't necessarily maintained
- TreeSets are special because the data is stored in order

### Queue
- A collection used for processing elements
- There are methods to add/remove elements from the queue
- Some methods return null/false in special cases (ex: no elements left in the queue)) (poll, peek, offer)
- Some methods just throw an exception in special cases: (add, remove, element)

#### Deque
- pronounced like "deck"
- Double-Ended Queue meaning we can insert/poll from both ends

#### Priority Queue
- A queue that holds elements by their natural ordering
- Example if we have a priority queue of strings, we will get those strings out in order

##### Comparable
- an interface that we can implement in order to give our custom classes a natural ordering
- this interface includes one method: compareTo
    - positive - first object is "greater than" the other
    - negative - second object is "greater than" the other
    - 0 - 2 objects are exactly the same
- By implementing Comparable, we make the class "comparable" to another instance
    - ex: Movie we could say that we could compare movies by their title



##### Comparator
- comparator is a class that is separate from the class which we want to compare
    - ex: if we have a movie class, we would then need a separate comparator class
- compare method



### Map
- Key and Values
- Key maps to a particular value
- Keys are unique, but values don't have to be unique
- These are not part of the collections hierarchy
- Implementing Classes:
    - HashMap

#### Internal Structure of a Map
- An array where the indices are calculated using the hash function of the key
- The value in that array is just that value
- Look up time is super quick because hashCode is a constant time function
    - it's not dependent on the number of items in the map
    - You just call the hash code and access the array at that index
- This is opposed to having to loop through the entire collection to find what you want
- Let's say I want to insert key: "NYC", value: 9
    - The index would be calculated using the hash code of "NYC" (let's say it's index 4)
    - So the underlying array would use that index and put the value of 9 in that spot
    ```[_, _, _, _, 9, _, _, _];```

#### Duplicate Hash Code
- Let's say we add another key that has the same hash code
- To handle collision, might go to next stop
- Must also store key then to ensure that we are getting the right value