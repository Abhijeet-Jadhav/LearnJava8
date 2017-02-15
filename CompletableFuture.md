#CompletableFuture

CompletableFuture<T> extends Future<T> by providing functional, monadic operations and promoting asynchronous, event-driven programming model, as opposed to blocking in older Java.

CompletableFuture has two major areas superior to Future<T> - asynchronous callback/transformations support and the ability to set value of CompletableFuture from any thread at any point in time. 

If you want to pass some exception further, there is CompletableFuture.completeExceptionally(ex)
completeExceptionally() also unlocks all waiting clients, but this time throwing an exception from get()

Methods that do not take an Executor as an argument but end with 'Async' will use ForkJoinPool.commonPool()
If some of the transformations are time-consuming, you can supply your own Executor to run them asynchronously.

**Creating and obtaining CompletableFuture - runAsync and supplyAsync**

````
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier);
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor);
static CompletableFuture<Void> runAsync(Runnable runnable);
static CompletableFuture<Void> runAsync(Runnable runnable, Executor executor);
````

**Transforming and acting on one CompletableFuture - thenApply** 

```` java
<U> CompletableFuture<U> thenApply(Function<? super T,? extends U> fn);
<U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn);
<U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn, Executor executor);
````

**Running code on completion -thenAccept/thenRun**
```` java
CompletableFuture<Void> thenAccept(Consumer<? super T> block);
CompletableFuture<Void> thenRun(Runnable action);
````
These two methods are typical "final" stages in future pipeline. They allow you to consume future value when it's ready. While thenAccept() provides the final value, thenRun executes Runnable which doesn't even have access to computed value. 

**Error handling of single CompletableFuture  - exceptionally/handle**
exceptionally() takes a function that will be invoked when original future throws an exception.
A more flexible approach is handle() that takes a function receiving either correct result or exception.
````
boolean	completeExceptionally(Throwable ex)
CompletableFuture<T> exceptionally(Function<Throwable,? extends T> fn)
<U> CompletableFuture<U> handle(BiFunction<? super T,Throwable,? extends U> fn)
CompletableFuture<T>	whenComplete(BiConsumer<? super T,? super Throwable> action)
````

**Combining two CompletableFuture together**
Sometimes you want to run some function on future's value (when it's ready). But this function returns future as well. Method thenCompose() is thus equivalent to flatMap in Scala.

Combining (chaining) two futures (thenCompose())
````
<U> CompletableFuture<U> thenCompose(Function<? super T,CompletableFuture<U>> fn);
````
thenCompose() is an essential method that allows building robust, asynchronous pipelines, without blocking or waiting for intermediate steps.

Transforming values of two futures (thenCombine())
thenCombine combines two independent futures when they are both done:
````
<U,V> CompletableFuture<V> thenCombine(CompletableFuture<? extends U> other, BiFunction<? super T,? super U,? extends V> fn)
````

**Waiting for both CompletableFutures to complete**

If instead of producing new CompletableFuture combining both results we simply want to be notified when they finish

````
<U> CompletableFuture<Void> thenAcceptBoth(CompletableFuture<? extends U> other, BiConsumer<? super T,? super U> block)
CompletableFuture<Void> runAfterBoth(CompletableFuture<?> other, Runnable a
````






