Java 8 : lambda Basics

Lambdas enable functional programming.
They eliminate boiler plate code and make code concise.
Enable support for parallel processing.

what problem does functional programming solve ?


we pass a behavior(class implementation of interface) to a method.
using lambdas we can pass actions(methods directly) to a method.

lambads are methods existing in isolation, not a method of particular class.

Data acts as a value to variables, you can assign it to primitive types.

Java 8:
inline value/ Function as a value,
 block of code can be a value and assigned to a variable. not the value of code after execution  but the block itself can be treated as a variable.
encapsulating a function in a variable that can be passed around.

you can pass an inline lambda expression too i.e. without using a variable name to hold the expression.

Lambdas in Java 8 are basically a special case of anonymous classes (namely, an anonymous class which implements an interface
with exactly one method (a "functional interface"), and which has no instance variables, and which does not refer to itself
(using this explicitly or implicitly)).
Any lambda can be re-written into an equivalent anonymous class expression. So what is said above also apply to lambdas.

examples of lambda expressions:

greetingFunction = () -> System.out.println();

doubleTheNumber = (int a) -> a * 2;

addNumbers = (int a, int b) -> a + b;

safeDivide = (int a, int b) -> {
    if(b == 0)
        return 0;
    else
        a / b;
};

strLength = (String s) -> s.length();

When you are using an interface for lambda expression type, that interafce should have only one method.
i.e that interace should be a functional interface.

TypeInferenceExample
With Java 8 compiler can do Type inference:

RunnableExample:
You need an instance of Runnable to create a new thread.
Anonymous inner class to create an instance and call run() method.

Functional Interface:

In java 8 you can have interfaces having implementation methods.
Functional Interface are interfaces having one and only one abstract method.
This property can be enfored on interface usign @FunctionalInterface annotation.
For Lambda expression types we use Functional interfaces.

Functional Interface:
functional interface used as the assignment target for a lambda expression or method reference.

Standard Functional interfaces:
java.util.functions provides out the box functional interface which can be used for lambda expression type.

Predicate
Represents a predicate (boolean-valued function) of one argument.
This is a functional interface whose functional method is test(Object).
boolean test(T t)
Evaluates this predicate on the given argument.
Used in if-conditions

Consumer
Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces,
This is a functional interface whose functional method is accept(Object).
void accept(T t)
Performs this operation on the given argument.

* Exception Handling in Lambdas

* closures in java - conjunction with  lambda
Implementing procedure contexts as first-class objects (i.e. closures) requires that the lifetime of certain local
variables extends beyond the return of the declaring method call.

A "closure" is something (a function or object or other thing that can be run in some way like having methods)
that captures ("closes over") a local variable from its enclosing scope, and which can use that variable in its code,
even when the function or object's method is run at a later time, including when the enclosing scope no longer exists.
By this definition, Java anonymous classes (which have been there since Java 1.1) are closures, since they can refer
to local variables from its enclosing scope.

Difference between lambda and anon inner class?
anon inner class overrides the this reference while lambda refers to the instance of class where lambda belongs to.
demonstrated in ThisReferenceExample.java

* Method references
alternative way for writing lambdas

forEach iteration:
The conventional for loop and for-in loop were external iterators. 
In external iterators you write code to perform the operation imperatively and your code is controlling the iteration.
Internal iterator, forEach loop is introduced in Java 8. you are telling runtime to iterate any way.
These iterators leverage multi-threading and parallelism







