# Next Greater Element To The Right

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.      
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"     
e.g.    
for the array [2 5 9 3 1 12 6 8 7]      
Next greater for 2 is 5     
Next greater for 5 is 9     
Next greater for 9 is 12    
Next greater for 3 is 12    
Next greater for 1 is 12    
Next greater for 12 is -1   
Next greater for 6 is 8  
Next greater for 8 is -1    
Next greater for 7 is -1

## Constraints
0 <= n < 10^5   
-10^9 <= a[i] <= 10^9

## Format
### Input
Input is managed for you

### Output
Output is managed for you

## Example
### Sample Input

5   
5   
3   
8   
-2  
7

### Sample Output
8   
8   
-1  
7   
-1