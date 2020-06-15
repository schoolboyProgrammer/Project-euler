# Brute Force approach: Loop from 1 to the last index and check divisibility. If
# the number is divisible by 5 or 3, print the output

sum_multiples = 0
for i in range(1, 1000):
  if (i % 3 == 0 or i % 5 == 0):
    sum_multiples += i

print(sum_multiples)