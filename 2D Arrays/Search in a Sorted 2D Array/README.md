<h1>Search in a Sorted 2D Array</h1>

<div>
  <ul>
    <li>You are given a number n, representing the number of rows and columns of a square matrix.</li>
<li> You are given n * n numbers, representing elements of 2d array a. </li>
<li> Each row and column is sorted in increasing order.</li>
<li> You are given a number x.</li>
<li> You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.</li>
<li> In case element is not found, print "Not Found".</li>
  </ul>
</div>

<h3>Constraints</h3>
<code>0 <= n < 10^4</code>
<code>-10^9 <= a[i] <= 10^9</code>

<h3>Format</h3>
<pre>
<strong>Input:</strong>
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x
<strong>Output:</strong>
row
col of the location where element is found or "Not Found" if element is not in the matrix
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
43
<br>
<strong>Sample Output:</strong>
3
2
</pre>
