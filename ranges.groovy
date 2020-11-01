println("=" * 50)

def range = 1..10
def range2 = 10..1

println range
println range.size()

println("=" * 50)

println range.getFrom()
println range.getTo()

println("=" * 50)

println range.get(3)
println range[3]

println("=" * 50)

println range.contains(6)

println("=" * 50)

println range.isReverse()
println range2.isReverse()

println("=" * 50)

def range3 = range.subList(3, 7)
println range3.getFrom()
println range3.getTo()

println("=" * 50)

for (i in range) {
  print "$i "
}

println()
println("=" * 50)

range.each { i ->
  print "$i "
}

println()
println("=" * 50)

println range instanceof java.util.List

println("=" * 50)