try {
  int i = 1 / 0
} catch(ArithmeticException exp) {
  println "Catch block to catch Arithmetic exp"
} catch(Exception exp) {
  println "I am inside exception block"
  println exp.getCause()
  println exp.getMessage()
  exp.printStackTrace()
} finally {
  println "I'm in the finally block."
}

// The finally block will always be executed whether a catch block is triggered or not