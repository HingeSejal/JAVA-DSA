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
                    Stack
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
*/