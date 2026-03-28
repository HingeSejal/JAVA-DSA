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

*/