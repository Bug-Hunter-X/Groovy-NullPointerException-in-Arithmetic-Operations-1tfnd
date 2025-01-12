```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // Handle null input
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 0
println calculate(5, null) // Output: 0
println calculate(null, null) // Output: 0
```