# Knights Tour

1. You are given a number n, the size of a chess board.
2. You are given a row and a column, as a starting point for a knight piece.
3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
     all cells of the board exactly once.
4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
     print all configurations of the chess board representing the route
     of knight through the chess board. Use sample input and output to get more idea.

Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and move in clockwise manner to explore other options.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

## Constraints
n = 5

0 <= row < n

0 <= col < n

## Format
### Input
A number n

A number row

A number col

### Output
All configurations of the chess board representing route of knights through the chess board starting in (row, col)

Use displayBoard function to print one configuration of the board.

## Example
### Sample Input

5
2
0

### Sample Output
25 2 13 8 23 

12 7 24 3 14 

1 18 15 22 9 

6 11 20 17 4 

19 16 5 10 21 



19 2 13 8 21 

12 7 20 3 14 

1 18 15 22 9 

6 11 24 17 4 

25 16 5 10 23 



25 16 5 10 23 

6 11 24 17 4 

1 18 15 22 9 

12 7 20 3 14 

19 2 13 8 21 



19 16 5 10 21 

6 11 20 17 4 

1 18 15 22 9 

12 7 24 3 14 

25 2 13 8 23 



23 10 5 16 21 

6 15 22 11 4 

1 24 9 20 17 

14 7 18 3 12 

25 2 13 8 19 



21 10 5 16 23 

6 15 22 11 4 

1 20 9 24 17 

14 7 18 3 12 

19 2 13 8 25 



25 10 5 16 19 

6 15 18 11 4 

1 24 9 20 17 

14 7 22 3 12 

23 2 13 8 21 



19 10 5 16 25 

6 15 18 11 4 

1 20 9 24 17 

14 7 22 3 12 

21 2 13 8 23


ans so on ..
