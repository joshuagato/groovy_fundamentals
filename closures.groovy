println("=" * 50)

str = "Hello"
def myclosure1 = { name -> println "${str} ${name}" }

myclosure1.call('Joshua')

println("=" * 50)

def mymethod(closure) {
  closure.call('Groovy')
}

mymethod(myclosure1)

println("=" * 50)

def myclosure2 = {
  a,b,c ->
  return (a + b + c)
}

def result2 = myclosure2.call(10, 10, 20)
println result2

println("=" * 50)

def mylist1 = ["Apples", "Orange", "Grapes"]
println mylist1.each { it }

println("=" * 50)

def mymap = [
  'subject': 'groovy',
  'topic': 'closures'
]

println mymap.each { it }

println("=" * 50)

def myList = [1, 2, 3, 4, 5]
println myList.find { item -> item == 3 }
println myList.findAll { item -> item >= 3 }
println myList.find { item -> item == 8 }
println myList.findAll { item -> item >= 8 }
println myList.any { item -> item >= 3 }
println myList.any { item -> item >= 8 }
println myList.every { item -> item >= 3 }
println myList.collect { item -> item * 3 }

println("=" * 50)