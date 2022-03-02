<h1>Spiral Display</h1>

<div>
  <ul>
    <li>You will be given a number n, representing the number of rows.</li>
<li> You will be given a number m, representing the number of columns.</li>
<li> You will be given n*m numbers, representing elements of 2d arrays.</li>
<li>You are required to traverse and print the contents of the 2d array in form of a spiral.</li>
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
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
<br>
<strong>Sample Output:</strong>
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
</pre>
