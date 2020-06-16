# Function to find the sum of the first n natural numbers
def sumofnaturalnumbers(n):
  return (n * (n + 1)/ 2)


lastindex = 1000
nums = [3, 5, -15]
sum = 0
for i in nums:
  sum += i * sumofnaturalnumbers((lastindex - 1) // abs(i))
print (sum)