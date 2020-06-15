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

$Sum = 3 + 5 + 6 + 9 + 10 + 12 + 15... + 999$

Notice that this can decompose into two individual sums:

$Sum = (3 + 6 + 9 + 12 + 15 + ... + 999) + (5 + 10 + 15 + 20... + 995)$

Notice that 15 and it's multiples occur twice, that is, once in the sum of 5 and
once in the sum of 3. This means that 15 is counted twice. To eliminate this, we
can subtract the multiples of 15 from the combined sum of the multiples of 3 and
5.

$Sum = (3 + 6 + 9 + 12 + 15 + ... + 999) + (5 + 10 + 15 + 20 + ... + 995) - (15+ 30 + 45 + 60 + ... + 990)$
  $ \;\; = 3(1 + 2 + 3 + 4 + ... + 333) + 5(1 + 2 + 3 + 4 + 5 + ... + 195) - 15(1 +
     2 + 3 + 4 + ... + 66) $
  $ \; \; = 3\sum_{i = 1}^{333} i + 5\sum_{i = 1}^{195} i - 15\sum_{i = 1}^{66} i$

The sum of consecutive natural numbers is defined by the formula:

$\sum_{i = 1}^{n} i = \frac{n(n + 1)}{2}$

If we define a function `sumofnaturalnumbers(n)` such that  

`sumofnaturalnumbers` = $\frac{n(n+1)}{2}$

we can express our required sum as  
$Sum =$ `3 * sumofnaturalnumbers(333) + 5 * sumofnaturalnumbers(195) - 15 *
sumofnaturalnumbers(66)`

This can be calculated very easily.

Note: To find the bound of summation, one can make use of the `modulo` operator.
For example, to find the sum of the factors of 3 and 5 from 1 to 10000, the
bounds of summation would be 9999 `modulo` 3, 9999 `modulo` 5 and 9999 `modulo`
15
