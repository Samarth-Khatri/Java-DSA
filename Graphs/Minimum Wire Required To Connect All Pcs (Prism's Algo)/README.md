# Minimum Wire Required To Connect All Pcs

1. You are given a graph and a source vertex. The vertices represent computers and the edges represent length of LAN wire required to connect them.
2. You are required to find the minimum length of wire required to connect all PCs over a network. Print the output in terms of which all PCs need to be connected, and the length of wire between them.

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
8   
0 1 10  
1 2 10  
2 3 10  
0 3 40  
3 4 2   
4 5 3   
5 6 3   
4 6 8

### Sample Output
[1-0@10]
[2-1@10]
[3-2@10]
[4-3@2]
[5-4@3]
[6-5@3]