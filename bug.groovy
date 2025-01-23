```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null input"
  } else if (str.isEmpty()) {
    return "Empty input"
  }
  // Some other operations...
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```