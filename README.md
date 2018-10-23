##Finding trailing zeros in the factorial of a number:

First of all as we know factorial of n may be defined as the product of all numbers from 1 to n.

```
That is, n! = 1*2*3*...*(n-2)*(n-1)*n
```

###Points to consider:

1. Trailing zeros means, we have to find the number of zeros at the end of the final product.
2. The simplest way a zero or a 10 be formed is by multiplying 2 and 5 (As here both 2 and 5s are prime).
3. There is a formula to calculate power of any prime number in the factorial of any number.
4. Formula: If (2^x)*K = n! Where, K = Constant , x is the power of 2. So here x = [n/2] + [n/(2^2)] + [n/(2^3)] +...,
   uptillnumerator >= denominator. Where [] = Greatest Integer Function.
5. Here by observation we may see that the power of 2 is always in surplus as compared to power of 5. 
   So there is no need of calculating the power of 2 in the factorial.
6. So, we may finally conclude that if we can calculate the power of 5 in any factorial,
   we can also calculate the trailing zeros in any factorial.
7. Example : If n = 100 , power of 5 in 100! = [100/5] + [100/5^2] = 24 
  (Here we have calculated till 2 terms only because 5^3 = 125 > 100).
