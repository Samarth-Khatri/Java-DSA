# Linearize A Generic Tree

1. You are given a partially written GenericTree class.
2. You are required to complete the body of linearize function. The function is expected to create a linear tree i.e. every node will have a single child only. For details check the question video.
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

24  
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1

### Sample Output
10 -> 20, .  
20 -> 50, .  
50 -> 60, .  
60 -> 30, .  
30 -> 70, .  
70 -> 80, .  
80 -> 110, .  
110 -> 120, .  
120 -> 90, .  
90 -> 40, .  
40 -> 100, .  
100 -> .
