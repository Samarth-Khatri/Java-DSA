# Count Encodings

1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. You are required to calculate and print the count of encodings for the string str.
    For 123 -> there are 3 encodings. abc, aw, lc
    For 993 -> there is 1 encoding. iic 
    For 013 -> This is an invalid input. A string starting with 0 will not be passed.
    For 103 -> there is 1 encoding. jc
    For 303 -> there are 0 encodings. But such a string maybe passed. In this case 
    print 0.

## Constraints
0 < str.length <= 10

## Format
### Input
A string str

### Output
count of encodings

## Example
### Sample Input
123

### Sample Output
3