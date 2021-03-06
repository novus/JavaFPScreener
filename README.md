This project contains an incomplete implementation of functions as first order objects in Java.
Within the project is a JUnit test suite (`src/test/java/com/novus/fp/FunctionTest.java`) that tests two properties
of functions: 1) application and 2) composition.

Your goal is to implement the functions and, where necessary, complete the base representation of functions such
that the tests pass. When you have completed the exercise, email the files `src/main/java/com/novus/fp/Functions.java` 
and `src/main/java/com/novus/fp/BaseF1.java` to cmuller [at] novus.com.

You will need an immediate block of 45 minutes to complete the exercise and will require a standard
Java development environment. Specifically, the compiler and jvm binaries should be in their system path
and their `JAVA_HOME` environment variable should be appropriately set (Windows users see [this](http://www.robertsindall.co.uk/blog/setting-java-home-variable-in-windows/)).

The tests can be run through [maven](http://maven.apache.org/download.cgi) via the usual `mvn test`. Maven is
included as part of the project, so as long as you are in the project's root directory you can run the bundled
version from there. For UNIX-like systems run `./mvn test`. On Windows, run `.\mvn test`.

You have 45 minutes. Good luck!
