println("=" * 50)

def employee = [
  'name': 'John',
  'age': 40
]

println employee
println employee.name
println employee['name']

println("=" * 50)

println employee.get('age')
println employee.getAt('age')
println employee.size()

println("=" * 50)

employee.put('city', 'Paris')
println employee

println("=" * 50)

println employee.containsKey('city')
println employee.containsValue('Paris')

println("=" * 50)

println employee.getClass()

println("=" * 50)

def emp2 = employee.clone()
println emp2

println("=" * 50)

employee.each { key, value -> 
  println "${key}: ${value}"
}

println("=" * 50)

employee.eachWithIndex { key, value, i -> 
  println "${i} | ${key}: ${value}"
}

println("=" * 50)

employee.each { entry -> 
  println "${entry.key} : ${entry.value}"
}

println("=" * 50)

employee.eachWithIndex { entry -> 
  println "${entry.key} : ${entry.value}"
}

println("=" * 50)

employee.clear()
println employee

println("=" * 50)