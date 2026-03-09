# Functional Programming in Java
## First-Class and Higher-Order Functions
Higher-order functions are capable of receiving functions as arguments and returning a function as a result.
This further enables several techniques in functional programming such as function composition and currying.

Kinda can be achieved implementing Functional Interfaces, Lambda Expressions and Method References.

Behind the syntactic sugar of lambda expressions, Java still wraps these into functional interfaces. 
So, Java treats a lambda expression as an Object, which is the true first-class citizen in Java.

### Functional Interfaces
Fundamental Functional Interfaces:
* Consumer // takes and argument and doesn't return anything
* Supplier // Takes no arguments and returns something
* Function // Takes arguments and returns something. Useful for passing functions as arguments
* Predicate // Returns a boolean

// Same as the ones above, but take 2 arguments
* BiConsumer
* BiFunction
* BiPredicate

* UnaryOperator
* BinaryOperator


//Specializations for Types
* IntConsumer
* DoubleSupplier
* ToIntFunction
* IntPredicate


* Runnable // Takes no args and doesn't return anything

## Pure Functions
A pure function should return a value based only on the arguments and should have no side effects.


## Immutability
it refers to the property that an entity can’t be modified after being instantiated.

* Objects: By using Records in Java or Tuples https://www.javatuples.org/index.html
* Collections: PCollections (Persistent and Immutable Collections) https://pcollections.org/

## Referential Transparency
We call an expression referentially transparent if replacing it with its corresponding value 
has no impact on the program’s behavior.

This enables some powerful techniques in functional programming such as higher-order functions and lazy evaluation.

So, for referential transparency, we need our functions to be pure and immutable. 
These are the two preconditions we discussed earlier.

As an interesting outcome of referential transparency, we produce context-free code. 
In other words, we can run them in any order and context, which leads to different optimization possibilities.


## Libraries
<b>Paguro</b>: https://github.com/GlenKPeterson/Paguro/tree/main
Type-safe, null-safe versions of Clojure's immutable/persistent collections, an immutable alternative to Java 8 Streams
that handles checked exceptions in lambdas, and other tools to make functional programming in Java easier.


<b>Vavr (Waver)</b>: https://github.com/vavr-io/vavr
object-functional extension for Java that reduces boilerplate code and enhances code quality.
Vavr seamlessly combines object-oriented programming with the elegance and robustness of functional programming.

It provides:
* persistent collections
* functional abstractions for error handling, concurrent programming
* pattern matching
* ...and more


<b>Lambda</b>: https://github.com/palatable/lambda
Lambda was born out of a desire to use some of the same canonical functions (e.g. unfoldr, takeWhile, zipWith) 
and functional patterns (e.g. Functor and friends) that are idiomatic in other languages and make them available for Java.

Some things a user of lambda most likely values:
* Lazy evaluation
* Immutability by design
* Composition
* Higher-level abstractions
* Parametric polymorphism


TODO: Dig deeper into functional programming with Java