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
*/