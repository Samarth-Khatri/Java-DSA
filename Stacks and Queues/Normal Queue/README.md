# Normal Queue

1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that you are supposed to complete
     2.1. add -> Should accept new data if there is space available in the underlying 
     array or print "Queue overflow" otherwise.
     2.2. remove -> Should remove and return value according to FIFO, if available or 
     print "Queue underflow" otherwise and return -1.
     2.3. peek -> Should return value according to FIFO, if available or print "Queue 
     underflow" otherwise and return -1.
     2.4. size -> Should return the number of elements available in the queue.
     2.5. display -> Should print the elements of queue in FIFO manner (space- 
     separated) ending with a line-break.
3. Input and Output is managed for you.

## Constraints
None

## Format
### Input
Input is managed for you

### Output
Output is managed for you

## Example
### Sample Input

5  
add 10  
display  
add 20  
display  
add 30  
display  
add 40  
display  
add 50  
display  
add 60  
display  
peek  
remove  
display  
peek  
remove  
display  
peek  
remove  
display  
peek  
remove  
display  
peek  
remove  
display  
peek  
remove  
quit

### Sample Output
10   
10 20   
10 20 30   
10 20 30 40   
10 20 30 40 50   
Queue overflow  
10 20 30 40 50   
10  
10  
20 30 40 50   
20  
20  
30 40 50   
30  
30  
40 50   
40  
40  
50   
50  
50  

Queue underflow     
Queue underflow