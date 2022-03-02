<h1>The State of Wakanda 1</h1>

<b>The historic state of Wakanda has various monuments and souvenirs which are visited by many travelers every day. The guides follow a prescribed route of visiting the monuments which improve them understand the relevance of each monument.

The route of the monument is fixed and expressed in a 2-d matrix where the travelers visit the prescribed next monument. For example

1  2  3
4  5  6
7  8  9

is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9

However, a certain visitor decides to travel a different path as follows:
1. He first travels southwards till no further south places are available.
2. He then moves only 1 place eastwards.
3. He starts to move again towards north till any further north moves are available.
This continues till all the places are covered.

For example, the monuments are named as follows:
1  2  3
4  5  6
7  8  9

Path followed by traveler: 1->4->7->8->5->2->3->6->9

You are required to print the path that this traveler follows to visit all places.</b>
<div>
  <ul>
    <li>You will be given a number n, representing the number of rows.</li>
<li> You will be given a number m, representing the number of columns.</li>
<li> You will be given n*m numbers, representing elements of 2d arrays.</li>
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
e12
e13
..
e1n
e2n
e2n-1
..
e21
e31
e32
..
e3n
e4n ..
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
3
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
<br>
<strong>Sample Output:</strong>
11
21
31
32
22
12
13
23
33
34
24
14
</pre>
