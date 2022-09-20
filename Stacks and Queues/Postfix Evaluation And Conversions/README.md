# Postfix Evaluation And Conversions

1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.

## Constraints
1. Expression is a valid postfix expression     
2. The only operators used are +, -, *, /   
3. All operands are single digit numbers.

## Format
### Input
Input is managed for you

### Output
value, a number     
infix   
prefix

## Example
### Sample Input

264*8/+3-

### Sample Output
2   
((2+((6*4)/8))-3)   
-+2/*6483