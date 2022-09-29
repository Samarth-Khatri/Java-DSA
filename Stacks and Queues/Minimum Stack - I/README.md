# Minimum Stack - I

1. You are required to complete the code of our MinStack class. 
2. As data members you've two stacks available in the class - one for data values and another for minimum values. (This is cryptic - take hint from video)
2. Here is the list of functions that you are supposed to complete
2.1. push -> Should accept new data in LIFO manner
2.2. pop -> Should remove and return data in LIFO manner. If not available, print "Stack underflow" and return -1.
2.3. top -> Should return data in LIFO manner. If not available, print "Stack underflow" and return -1.
2.4. size -> Should return the number of elements available in the stack
2.5. min -> Should return the smallest element available in the stack. If not available, print "Stack underflow" and return -1.
3. Input and Output is managed for you.

Note -> The judge maynot be able to check if all your functions are O(1) in time, but that is what the expectation is.

## Constraints
None

## Format
### Input
Input is managed for you

### Output
Output is managed for you

## Example
### Sample Input

push 10     
push 20     
push 5  
push 8  
push 2      
push 4      
push 11     
top     
min     
pop     
top     
min     
pop     
top     
min     
pop     
top     
min     
pop     
top     
min     
pop     
top     
min     
pop     
top     
min     
pop  
quit

### Sample Output
11  
2   
11  
4   
2   
4   
2       
2   
2   
8   
5   
8   
5   
5   
5   
20  
10  
20  
10  
10  
10