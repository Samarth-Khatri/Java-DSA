# Shortest Path In Weights

1. You are given a graph and a source vertex. The vertices represent cities and the edges represent distance in kms.
2. You are required to find the shortest path to each city (in terms of kms) from the source city along with the total distance on path from source to destinations.

Note -> For output, check the sample output and question video.

## Constraints
None

## Format
### Input
Input has been managed for you

### Output
Check the sample output

## Example
### Sample Input

7   
9   
0 1 10  
1 2 10  
2 3 10  
0 3 40  
3 4 2   
4 5 3   
5 6 3   
4 6 8   
2 5 5   
0

### Sample Output
0 via 0 @ 0  
1 via 01 @ 10   
2 via 012 @ 20  
5 via 0125 @ 25  
4 via 01254 @ 28     
6 via 01256 @ 28     
3 via 012543 @ 30