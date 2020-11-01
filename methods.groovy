println("=" * 50)

def printHello() {
  println "Hello..."
}

printHello()

println("=" * 50)

def sum(int a, int b) {
  println "Sum is " + (a + b)
}

sum(5, 7)

println("=" * 50)

def sum2(int a, int b=20) {
  println "Sum is " + (a + b)
}

sum2(15)

println("=" * 50)