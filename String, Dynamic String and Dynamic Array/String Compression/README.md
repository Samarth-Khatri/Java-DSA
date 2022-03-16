<h1>String Compression</h1>

<div>
  <ul>
    <li>You are given a string. 
    <li>You have to compress the given string in the following two ways - </li>
   <ol>
     <li>First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
         For "aaabbccdee", the compressed string will be "abcde".</li>
     <li>Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
         For "aaabbccdee", the compressed string will be "a3b2c2de2".</li>
   <ol>
  </ul>
</div>

<h3>Constraints</h3>
<code>1 <= length of string <= 500</code>

<h3>Format</h3>
<strong>Input:</strong>
<pre>
A String
</pre>

<strong>Output:</strong>
<pre>
Two strings representing first compressed string and second compressed string respectively.
</pre>

<h3>Example</h3>
<pre>
<strong>Sample Input:</strong>
wwwwaaadexxxxxx
<br>
<strong>Sample Output:</strong>
wadex
w4a3dex6
</pre>
