# Normal Stack

1. You are required to complete the code of our CustomStack class. The class should mimic the behaviour of java.util.Stack class and implement LIFO semantic.
2. Here is the list of functions that you are supposed to complete
   2.1. push -> Should accept new data if there is space available in the underlying 
   array or print "Stack overflow" otherwise.
   2.2. pop -> Should remove and return last data if available or print "Stack 
   underflow" otherwise and return -1.
   2.3. top -> Should return last data if available or print "Stack underflow" 
   otherwise and return -1.
   2.4. size -> Should return the number of elements available in the stack.
   2.5. display -> Should print the elements of stack in LIFO manner (space- 
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
push 10  
display  
push 20  
display  
push 30  
display  
push 40  
display  
push 50  
display  
push 60  
display  
top  
pop  
display  
top  
pop  
display  
top  
pop  
display  
top  
pop  
display  
top  
pop  
display  
top     
pop     
quit

### Sample Output
10  
20 10   
30 20 10    
40 30 20 10     
50 40 30 20 10  
Stack overflow  
50 40 30 20 10  
50  
50  
40 30 20 10      
40  
40  
30 20 10     
30  
30  
20 10    
20  
20  
10  
10  
10  
Stack underflow 
Stack underflow