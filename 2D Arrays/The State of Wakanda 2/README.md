<h1>State of Wakanda 2</h1>
<b>The historic state of Wakanda has various monuments and souveniers which are visited by many travellers every day. The guides follow a prescribed route of visiting the monuments which improves them understand the relevance of each monument. The route of the monument is fixed and expressed in a 2-d matrix where the travellers visit the prescribed next monument. For example
1  2  3
4  5  6
7  8  9
is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
However, a certain visitor decides to travel a different path as follows:
1. The visitor only plans to visit the upper diagonal triangle of the monument list.
2. The visitor travels diagonally till there are no more moves left in the current journey.
3. He then visits the adjacent monument to the first monument of current diagonal journey.
4. He continues the same path till all the monuments of the upper half have been travelled.
For Example:
The monuments are named as:
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.</b>

<div>
  <ul>
    <li>You will be given a number n, representing the number of rows and columns of a square matrix</li>
<li> You are given n * n numbers, representing elements of 2d array a.</li>
<li>You are required to diagonally traverse the upper half of the matrix and print the contents.</li>
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
Diagonal traversal as in image below
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
11
22
33
44
12
23
34
13
24
14
</pre>
