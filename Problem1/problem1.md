# Multiples of 3 and 5  

## Problem  

> If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
> Find the sum of all the multiples of 3 or 5 below 1000.

## Approaches

### Approach 1: Brute Force  

The simplest approach would be brute force, as depicted in the programs labelled
such. They loop from 1 to the end index, and check if the value of the loop
variable is divisible by 3 or 5 (or both). If yes, it would add to a variable
storing the sum, else, it would continue.

### Approach 2

As we move on to large numbers, the brute force approach would be unviable.  

Let us explore the problem from a different angle. The problem asks us to print
the sum of all the multiples of 3 and 5. This means we are asked to print:

<img src="https://render.githubusercontent.com/render/math?math=Sum%20=%203%20%2B%205%20%20%2B%206%20%2B%209%20%2B%2010%20%2B%2012%20%2B%2015%20%2B%20...%20%2B%20999">

Notice that this can decompose into two individual sums:

<img src="https://render.githubusercontent.com/render/math?math=Sum%20=%20(3%20%2B%206%20%2B%209%20%2B%2012%20%2B%2015%20%2B%20...%20%2B%20999)%20%2B%20(5%20%2B%2010%20%2B%2015%20%2B%2020%20%2B%20...%20%2B%20995)">

Notice that 15 and it's multiples occur twice, that is, once in the sum of 5 and
once in the sum of 3. This means that 15 is counted twice. To eliminate this, we
can subtract the multiples of 15 from the combined sum of the multiples of 3 and
5.

<img src="https://render.githubusercontent.com/render/math?math=Sum%20=%20(3%20%2B%206%20%2B%209%20%2B%2012%20%2B%2015%20%2B%20...%20%2B%20999)%20%2B%20(5%20%2B%2010%20%2B%2015%20%2B%2020%20%2B%20...%20%2B%20195)%20-%20(15%20%2B%2030%20%2B%2045%20%2B%2060%20%2B%20...%20%2B%20995)"> 

<img src="https://render.githubusercontent.com/render/math?math==3(1%20%2B%202%20%2B%203%20%2B%204%20%2B%205%20%2B%20...%20%2B%20333)%20%2B%205(1%20%2B%202%20%2B%203%20%2B%204%20%2B%20...%20%2B%20199)%20-%2015(1%20%2B%202%20%2B%203%20%2B%204%20%2B%20...%20%2B%2066)">
<img src="https://render.githubusercontent.com/render/math?math==3\sum_{i = 1}^{333} i %2B 5\sum_{i = 1}^{199} i - 15\sum_{i = 1}^{66} i">

The sum of consecutive natural numbers is defined by the formula:

<img src="https://render.githubusercontent.com/render/math?math=Sum = \sum_{i = 1}^{n} i = \frac{n(n + 1)}{2})">

If we define a function `sumofnaturalnumbers(n)` such that  

`sumofnaturalnumbers` = <img src="https://render.githubusercontent.com/render/math?math=\frac{n(n %2B 1)}{2}">

we can express the required sum as  `3 * sumofnaturalnumbers(333) + 5 * sumofnaturalnumbers(199) - 15 *
sumofnaturalnumbers(66)`

This can be calculated very easily by plugging in the formula

Note: To find the bound of summation, one can use integer division.
For example, to find the sum of the factors of 3 and 5 from 1 to 10000, the
bounds of summation would be the integer division of 9999 with 3, 5, and 15 respectively
