<h1>Exit Point of A Matrix</h1>

<div>
  <ul>
    <li>You will be given a number n, representing the number of rows.</li>
<li> You will be given a number m, representing the number of columns.</li>
<li> You are given n*m numbers (1's and 0's), representing elements of 2d array a.</li>
<li>Consider this array a maze and a player enters from top-left corner in east direction.</li>
<li> The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.</li>
<li> You are required to print the indices in (row, col) format of the point from where you exit the matrix.</li>
  </ul>
</div>

<h3>Constraints</h3>
<code>1 <= n <= 10^2 </code>
<code>1 <= m <= 10^2 </code>
<code>-10^9 <= e1, e1, .. n * m elements <= 10^9</code>

<h3>Format</h3>
<strong>Input:</strong>
<pre>
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
</pre>

<strong>Output:</strong>
<pre>
row
col (of the point of exit)
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0
<br>
<strong>Sample Output:</strong>
1
3
</pre>
