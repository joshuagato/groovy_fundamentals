def num = 11

if (num == 10) {
  println "Num is ${num} => if"
} else if (num == 11) {
  println "Num is ${num} => else if"
} else {
  println "Num is ${num} => else"
}

if (num == 10) println "Num is ${num} => if"
else if (num == 11) println "Num is ${num} => else if"
else println "Num is ${num} => else"


switch(num) {
  case 10:
    println "Num is ${num} => case ${num}"
    break
  case {num == 11}:
    println "Num is ${num} => case ${num}"
    break
  default:
    println "Num is ${num} => break ${num}"
    break
}