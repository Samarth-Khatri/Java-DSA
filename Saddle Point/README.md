<h1>Saddle Point</h1>

<div>
  <ul>
    <li>You will be given a number n, representing n * n elements of a matrix</li>
<li>You are required to find the saddle price of the given matrix and print the saddle price. </li>
<li> The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.</li>
  </ul>
</div>

<h3>Constraints</h3>
<code>1 <= n <= 10^2 </code>

<code>-10^9 <= e1, e1, .. n * n elements <= 10^9</code>

<h3>Format</h3>
<strong>Input:</strong>
<pre>
A number n
e11
e12..
e21
e22..
.. n * n number of elements of an array
</pre>

<strong>Output:</strong>
<pre>
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.
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
<br>
<strong>Sample Output:</strong>
41
</pre>
