# Stock Span

1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]  
span for 2 is 1     
span for 5 is 2     
span for 9 is 3     
span for 3 is 1     
span for 1 is 1     
span for 12 is 6        
span for 6 is 1     
span for 8 is 2     
span for 7 is 1     

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

13  
1   
2   
7   
3   
4   
1   
2   
5   
3   
2   
1   
4   
6   

### Sample Output
1   
2   
3   
1   
2   
1   
2   
5   
1   
1   
1   
4   
10  