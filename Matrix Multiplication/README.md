<h1>Matrix Multiplication</h1>

<div>
  <ul>
    <li>You are given a number n1, representing the number of rows of 1st matrix.</li>
    <li>You are given a number m1, representing the number of columns of 1st matrix.</li>
    <li>You are given n1*m1 numbers, representing elements of 2d array a1.</li>
    <li>You are given a number n2, representing the number of rows of 2nd matrix.</li>
    <li>You are given a number m2, representing the number of columns of 2nd matrix.</li>
    <li>If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.</li>
    You are given n2*m2 numbers, representing elements of 2d array a2.</li>
    <li>If the two arrays can't be multiplied, print "Invalid input".</li>
  </ul>
</div>

<h3>Constraints</h3>
<code>1 <= n1 <= 10^2 </code>
<code>1 <= m1 <= 10^2 </code>
<code>-10^9 <= e11, e12, .. n1 * m1 elements <= 10^9</code>
<code>1 <= n2 <= 10^2 </code>
<code>1 <= m2 <= 10^2 </code>
<code>-10^9 <= e11', e12', .. n2 * m2 elements <= 10^9</code>

<h3>Format</h3>
<strong>Input:</strong>
<pre>
A number n1 A number m1 e11 e12.. e21 e22.. .. n1 * m1 number of elements of array a1 
A number n2 A number m2 e11' e12'.. e21' e22'.. .. n2 * m2 number of elements of array a2
</pre>

<strong>Output:</strong>
<pre>
e11'' e12'' e13'' .. e21'' e22'' e23'' .. .. elements of prd array
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
<br>
<strong>Sample Output:</strong>
10 0 10 0
0 20 20 40
</pre>
