def name = "Joshua"

println name
println "My name is " + name
println "My name is ".concat(name)

println("=" * 50)

println "My name is ${name}"
println 'My name is ${name}'

println("=" * 50)

String language = "Groovy"

def doublelequotetripplestring = """This is a ${language} class
  and we are learning about strings"""

def singlequotetripplestring = '''This is a ${language} class
  and we are learning about strings'''

println doublelequotetripplestring

println("=" * 50)

println singlequotetripplestring

println("=" * 50)

println name.length()
println name[3]
println name[0..3]
println name[5..3]
println name[0,2,4]
println name.substring(2)
println name.subSequence(1, 4)

println("=" * 50)

def str = "This is a groovy class"
println str.split(" ")
println str.split(" ")[3]
println str.replace("class", "session")
println str.toLowerCase()
println str.toUpperCase()

println("=" * 50)

println str.toList()

println "Abc".equals("abc")
println "Abc".equalsIgnoreCase("abc")