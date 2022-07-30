Problem
You are given two arrays 
a
1
,
a
2
,
…
,
a
n
 and 
b
1
,
b
2
,
…
,
b
n
. In each step, you can set 
a
i
=
a
i
−
b
i
 if 
a
i
≥
b
i
. Determine the minimum number of steps that are required to make all 
a
's equal.

Input format

First line: 
n
 
Second line: 
a
1
,
a
2
,
…
,
a
n
Third line: 
b
1
,
b
2
,
…
,
b
n
Output format

Print the minimum number of steps that are required to make all 
a
's equal. If it is not possible, then print -1.

Constraints


1
≤
n
,
 
a
i
,
 
b
i
≤
5000

Sample input

2
5 6
4 3

Sample output

-1

Sample Input
5
5 7 10 5 15
2 2 1 3 5
Sample Output
8
