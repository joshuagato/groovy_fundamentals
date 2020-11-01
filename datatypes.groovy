println ("=" * 100)

byte b = 10
println "byte ${Byte.MIN_VALUE} <= ${b} <= ${Byte.MAX_VALUE}"

def bb = (byte)11
println bb 

println ("=" * 100)

short s = 100
println "short ${Short.MIN_VALUE} <= ${s} <= ${Short.MAX_VALUE}"
println s.getClass().getName()

println ("=" * 100)

int i = 1000
println "int ${Integer.MIN_VALUE} <= ${i} <= ${Integer.MAX_VALUE}"
println i.getClass().getName()

println ("=" * 100)

long l = 100000L
println "long ${Long.MIN_VALUE} <= ${l} <= ${Long.MAX_VALUE}"
println l.getClass().getName()

println ("=" * 100)

float f = 100.002F
println "float ${Float.MIN_VALUE} <= ${f} <= ${Float.MAX_VALUE}"
println f.getClass().getName()

println ("=" * 100)

double d = 1000.0002D
println "double ${Double.MIN_VALUE} <= ${d} <= ${Double.MAX_VALUE}"
println d.getClass().getName()

println ("=" * 100)

char c = 'A'
println "char ${c}"

println ("=" * 100)

boolean flag = true
println "boolean ${flag}"

println ("=" * 100)