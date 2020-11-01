for (int i=1; i<=5; i++) {
  print "${i} "
}

println()
println("=" * 50)

for (a in 1..5) {
  print "${a} "
}

println()
println("=" * 50)

1.upto(5) { print "${it} " }

println()
println("=" * 50)

5.times { print "${it} " }

println()
println("=" * 50)

1.step(10, 2) { print "${it} " }


println()
println("=" * 50)

for (i in [0, 1, 2, 3, 4]) {
  print "${i} "
}

println()
println("=" * 50)

def map = ["name": "Groovy", "subject": "Automation"]

for (e in map) {
  println e
  println e.key
  println e.value
}

println()
println("=" * 50)
