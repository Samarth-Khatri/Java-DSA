# Order Of Compilation

1. You are given a directed acyclic graph. The vertices represent tasks and edges represent dependencies between tasks.
2. You are required to find and print the order in which tasks could be done. The task that should be done at last should be printed first and the task which should be done first should be printed last. This is called topological sort. Check out the question video for details.

Topological sort -> A permutation of vertices for a directed acyclic graph is called topological sort if for all directed edges uv, u appears before v in the graph.

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
7       
0 1     
1 2     
2 3     
0 3     
4 5     
5 6  
4 6

### Sample Output
4   
5   
6   
0   
1   
2   
3