/*

Java Array is  created dynamically and it static(fixed) in size. 
Once the size of the array is defined, it cannot be changed. 
If we want to change the size of the array, create a new array and copy the elements from the old to new array. 
This can be inefficient and time-consuming, especially if the array is large.

In contrast, Java Collections framework are dynamic in size.
They can grow and shrink as needed, which makes them more flexible and efficient for managing data.

Container which holds the data in the form of objects is called collection.

The Java Collections framework provides a set of interfaces and classes 
that implement various data structures, such as lists, sets, queues, and maps.

e.g imagine if u dont know the no of records in database on system and on application side u want to save data in memory
    also even if u get no of records if new record need to be added
    then in this scenario array cant be used because of its fixed size 


                                Collection framework
                                 /                 \
  (data is in form of values) Collection            Map (Data is in form of key value pair)
                            /           \                                   |
                        List            Set                             HashMap
(Duplicates allowed ,insertion order)  (unique and sorted values)       LinkedHashMap
                        |                 |                             Hashtable
                    ArrayList           HashSet
                    LinkedList          TreeSet 
                    Stack               LinkedHashSet
                    Vector
                    PriorityQueue


---------------------- ArrayList vs Vector --------------------------------------

ArrayList is not synchronized and is not thread-safe, 
-> means that multiple threads can access and modify an ArrayList simultaneously, 
-> which can lead to data corruption or unexpected behavior.
-> if ArrayList is full then while increasing it increaes its size by 50% of its current size. (Growble nature)
-> bydefault arraylist has capacity of 10
-> ArrayList is generally faster than Vector because it is not synchronized
-> synchronization adds overhead to the operations performed on a Vector, which can slow down performance.
-> in arraylist no method to get capacity of arraylist

while Vector is synchronized and is thread-safe.
-> means that only one thread can access and modify a Vector at a time,
-> which can help prevent data corruption and ensure thread safety.
-> if Vector is full then while increasing it increases its size by 100% of its current size. (Growble nature)
-> bydefault vector has capacity of 10
-> u can also create vector with specific initial capacity and increment value

what should u chose between arraylist and vector ?
-> if u need a thread-safe implementation of a list, then Vector may be a good choice.
-> However, if you do not need thread safety and want better performance, then ArrayList may be a better choice.


----------------------- ArrayList vs LinkedList --------------------------------------

ARRAYLIST
To delete an element from the middle of an ArrayList, 
-> the elements that come after the deleted element need to be shifted to fill the gap(override the deleted element) 
-> which can be time-consuming and inefficient, especially for large lists.
-> Time complexity while shifting becomes O(n) 
   where n is the number of elements in the list.
e.g. 11-> 12-> 13-> 14-> 15
     11-> 12-> 14-> 15 ( delete 13 , rest shift left O(n)) 

LINKEDLIST 
-> we have nodes and each node has reference to next node and previous node
e.g. 11-> 12-> 13-> 14-> 15
     11-> 12-> 14-> 15 ( delete 13 , just update the reference of 12 and 14 to each other O(1)) 
-> In a LinkedList, deleting an element from the middle is more efficient because it only requires updating the links of the previous and next nodes.
-> consistent time complexity of O(1) for deletion, regardless of the size of the list.
-> linkedlist class of java interally uses doubly linked list data structure
-> In a LinkedList, accessing an element at a specific index requires traversing the list from the beginning or end 
-> which can be time-consuming for large lists.

Disadvantage of LinkedList 
-> it uses more memory than an ArrayList because it needs to store additional references for each node.
-> accessing an element in a LinkedList can be slower

which one is preferable between ArrayList and LinkedList ?
-> if u need to perform a lot of insertions and deletions , then LinkedList may be a better choice.
-> However, if u need to perform a lot of random access or retrieval operations, then ArrayList may be a better choice.

----------------------------- Stack vs Queue --------------------------------------

Stack is a linear data structure that follows the Last In First Out (LIFO) principle,
Queue is a linear data structure that follows the First In First Out (FIFO) principle.

stack operations:
push() - add an element to the top of the stack
pop() - remove and return the top element of the stack
peek() - return the top element without removing it
size() - return the number of elements in the stack
isEmpty() - check if the stack is empty

queue operations:
add() - add an element to the end of the queue
remove() - remove and return the front element of the queue
peek() - return the front element without removing it
size() - return the number of elements in the queue
isEmpty() - check if the queue is empty

use cases of stack:
-> function calls in programming languages
-> undo/redo functionality in text editors
-> expression evaluation and syntax parsing
-> backtracking algorithms 
-> reversing a string

use cases of queue:
-> scheduling tasks in operating systems
-> handling requests in web servers
-> breadth-first search (BFS) algorithm in graph traversal
-> implementing a buffer in data streaming applications

----------------------------- set vs list ------------------------------------------

Set is a collection that does not allow duplicate elements and sorts the elements in natural order.
-> stores unique elements only because 
-> it uses a hash table to store the elements, which does not allow duplicate keys.
-> when u try to add duplicate element it will simply ignore it and not throw any error

List is a collection that allows duplicate elements and maintains the order of elements.
-> it uses an array to store the elements, which allows duplicate values and maintains the order of insertion.

use cases of set:
-> storing unique values, such as a list of unique email addresses or a set of unique user IDs.
-> performing mathematical operations, such as union, intersection, and difference between sets.
-> implementing a cache to store recently accessed data, where duplicate entries are not allowed.
   where cache is a temporary storage area that holds frequently accessed data to improve performance.

use cases of list:
-> storing a list of customer orders or a list of products in an inventory system.
-> implementing a to-do list application, where users can add and remove tasks from the list.
-> maintaining a history of user actions in an application, where duplicate entries may be allowed.

----------------------------- Arraylist vs list -----------------------------------

list is an interface in Java that defines a collection of ordered elements
ArrayList is a concrete implementation of the List interface that uses an array to store the elements.

also we have other implementations of list interface like linkedlist , stack and vector
ArrayList is a resizable array implementation of the List interface, which means that it can grow and shrink dynamically as elements are added or removed.
-> it provides fast random access to elements because it uses an array to store the elements.
-> it is not synchronized, which means that it is not thread-safe 
-> should not be used in multi-threaded environments without proper synchronization.

ArrayList -> duplicates allowed , no sorting order , allows null values

---------------------------------- HashSet vs TreeSet vs LinkedHashSet -----------------------------------
HashSet -> no duplicate , no order
TreeSet -> no duplicate , sorted order
LinkedHashSet -> no duplicate , insertion order

duplicate + sorted -> collection.sort()

----------------------------------- HashMap vs LinkedHashMap vs Hashtable -----------------------------------

HashMap -> no duplicate keys , no order
LinkedHashMap -> no duplicate keys , insertion order
Hashtable -> no duplicate keys , no order , synchronized

how does HashMap work ?
-> HashMap uses a hash table to store key-value pairs.
-> When a key-value pair is added to the HashMap, the hash code of the key is calculated 
-> used to determine the index in the hash table where the key-value pair should be stored.
-> If there is a collision (i.e., two different keys have the same hash code), 
   a) when some indexes are empty, 
          HashMap uses open addressing to resolve the collision 
          by finding the next available index in the hash table to store the key-value pair.
   b) when all other indexes are occupied, 
          the HashMap uses a linked list to store multiple key-value pairs at the same index.


how does LinkedHashMap work ?
-> LinkedHashMap is a subclass of HashMap that maintains a linked list of the entries in the map,
-> which allows it to maintain the order of insertion of the key-value pairs.

how does Hashtable work ?
-> Hashtable is a legacy class that is similar to HashMap but is synchronized 
   means only one thread can access and modify a Hashtable at a time, 
   which can help prevent data corruption and ensure thread safety. 
-> does not allow null keys or values.
-> store key value by taking hashcode of key 
-> hashcode is calculated using the hashCode() method of the key object

----------------------------------------------------------------------------------

List<String> list = new ArrayList<>(); //means list is reference to an object of type ArrayList
List<String> list = new LinkedList<>(); // means list is reference to an object of type LinkedList

Set<String> set = new HashSet<>(); // means set is reference to an object of type HashSet
Set<String> set = new TreeSet<>(); // means set is reference to an object of type TreeSet
Set<String> set = new LinkedHashSet<>(); // means set is reference to an object of type LinkedHashSet

Queue<String> queue = new LinkedList<>(); 



*/   