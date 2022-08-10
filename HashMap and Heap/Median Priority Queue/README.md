# Median Priority Queue

1. You are required to complete the code of our MedianPriorityQueue class. The class should mimic the behaviour of a PriorityQueue and give highest priority to median of it's data.
2. Here is the list of functions that you are supposed to complete
2.1. add -> Should accept new data.
2.2. remove -> Should remove and return median value, if available or print "Underflow" otherwise and return -1
2.3. peek -> Should return median value, if available or print "Underflow" otherwise and return -1
2.4. size -> Should return the number of elements available
3. Input and Output is managed for you.

Note -> If there are even number of elements in the MedianPriorityQueue, consider the smaller median as median value.

## Constraints
None

## Format
### Input
Input is managed for you

### Output
Output is managed for you

## Example
### Sample Input

add 10  
add 20  
add 30  
add 40  
peek    
add 50  
peek    
remove  
peek    
remove  
peek    
remove  
peek    
remove  
peek    
quit

### Sample Output
20  
30  
30  
20  
20  
40  
40  
10  
10  
50