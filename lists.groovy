println("=" * 50)

def fruits = ['Apples', 'Oranges', 'Grapes']

println fruits[1]
println fruits.get(2)

println("=" * 50)

def mylist = [1, 2, 3, ['A', 'B', "Groovy"], 4]

println mylist[2]
println mylist[3][2]
println mylist.get(3).get(2)

println("=" * 50)

println mylist.contains("Groovy")
println mylist[3].contains("Groovy")

println("=" * 50)

println mylist.size()
println mylist[3].size()

println("=" * 50)

mylist.add(10)
println mylist

println("=" * 50)

mylist.add(2, 33)
println mylist

println("=" * 50)

mylist.remove(1)
println mylist

println("=" * 50)

mylist = mylist + [60, 70]
println mylist

println("=" * 50)

mylist = mylist - [60, 70]
println mylist

println("=" * 50)

mylist.pop()
println mylist

println("=" * 50)

mylist.removeLast()
println mylist

println("=" * 50)

println mylist.intersect([1, 2, 4])

println("=" * 50)

println mylist.reverse()

println("=" * 50)

mylist.clear()
println mylist.isEmpty()

println("=" * 50)