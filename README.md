This is a small pre-screening exercise for Java candidates before a phone conversation with one of the engineers
will be given. Following are the instructions to be sent to the candidates. Note that it is important to tell the
candidates beforehand that they will need an immediate block of 45 minutes to complete the exercise, and that it
will be advantageous to work on a computer with a standard Java development environment. Specifically, the compiler
and jvm binaries should be in their system path and their `JAVA_HOME` environment variable should be appropriately
set (this is standard for java developers).

---

The attached project contains an incomplete implementation of functions as first order objects in Java.
Within the project is a JUnit test suite (`src/test/java/com/novus/fp/FunctionTest.java`) that tests two properties
of functions: 1) application and 2) composition.

Your goal is to implement the functions and, where necessary, complete the base representation of functions such
that the tests pass. When the tests pass, zip up your code and email it to us.

The tests can be run through [maven](http://maven.apache.org/download.cgi) via the usual `mvn test`. Maven is
included as part of the project, so as long as you are in the project's root directory you can run the bundled
version from there. For UNIX-like systems run `./mvn test`. On Windows, run `.\mvn test`.

You have 45 minutes. Good luck!
