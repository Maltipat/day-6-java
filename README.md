# day-6-java
Code chef Question
Largest and Second Largest
You are given an array 
A
A of 
N
N integers.
Find the maximum sum of two distinct integers in the array.

Note: It is guaranteed that there exist at least two distinct integers in the array.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains single integer 
N
N — the size of the array.
The next line contains 
N
N space-separated integers, denoting the array 
A
A.
Output Format
For each test case, output on a new line, the maximum sum of two distinct integers in the array.

Constraints
1
≤
T
≤
1000
1≤T≤1000
2
≤
N
≤
10
5
2≤N≤10 
5
 
1
≤
A
i
≤
1000
1≤A 
i
​
 ≤1000
The sum of 
N
N over all test cases does not exceed 
2
⋅
10
5
2⋅10 
5
 .
Sample 1:
Input
Output
4
3
4 1 6
7
3 7 2 1 1 5 3
5
8 2 9 4 9
2
1 2
10
12
17
3
Explanation:
Test case 
1
1: The maximum sum of two distinct elements is 
4
+
6
=
10
4+6=10 .

Test case 
2
2: The maximum sum of two distinct elements is 
7
+
5
=
12
7+5=12.

Test case 
3
3: The maximum sum of two distinct elements is 
8
+
9
=
17
8+9=17.

Test case 
4
4: The maximum sum of two distinct elements is 
1
+
2
=
3
1+2=3.
