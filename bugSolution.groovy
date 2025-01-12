```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Input values cannot be null")
  }
  return a + b
}

println calculate(5, 3) // Output: 8

try {
  println calculate(null, 3) // Throws IllegalArgumentException
} catch (IllegalArgumentException e) {
  println "Exception: "+ e.message
}

try {
  println calculate(5, null) // Throws IllegalArgumentException
} catch (IllegalArgumentException e) {
  println "Exception: "+ e.message
}

try {
  println calculate(null, null) // Throws IllegalArgumentException
} catch (IllegalArgumentException e) {
  println "Exception: "+ e.message
}
```