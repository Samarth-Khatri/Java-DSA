<h1>Spiral Display</h1>

<div>
  <ul>
    <li>You are given a n*m matrix where n are the number of rows and m are the number of columns.</li>
     <li>You are also given n*m numbers representing the elements of the matrix.</li>
<li>You will be given a ring number 's' representing the ring of the matrix.</li>
<li>You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.</li>
<li>You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.</li>
  </ul>
</div>

<h3>Constraints</h3>
<code>1 <= n <= 10^2 </code>
<code>1 <= m <= 10^2 </code>
<code>-10^9 <= e1, e1, .. n * m elements <= 10^9</code>
<code>0 < s <= min(n, m) / 2</code>
<code>-10^9 <= r <= 10^9</code>

<h3>Format</h3>
<strong>Input:</strong>
<pre>
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r
</pre>

<strong>Output:</strong>
<pre>
output is handled by display function
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
</pre>

<br>
<strong>Sample Output:</strong>
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
</pre>
