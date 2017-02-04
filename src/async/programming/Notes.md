package java.util.concurrent provides utility classes commonly useful in concurrent programming.

Interfaces:
Callable<V> a task that returns a result and may throw an exception.

Executor : An object that executes submitted Runnable tasks.

**Future<V>** : A future represents a result of an asynchronous computation.
The type parameter V is the result type of returned by this future's get method.

get() : return type V
Waits if necessary for the computation to complete, and then retrieves its result.

isDone(): return type V
Returns true if this task completed.

cancel(boolean mayInterrupt): return type boolean
Attempts to cancel execution of this task.

**CompletionStage<V>** A stage of a possibly asynchronous computation, that performs an action or computes a value
when another CompletionStage completes. The computation performed by a stage may be expressed as a Function, Consumer or 
Runnable (using methods with names including apply, accept and run respectively) depending on whether it requires arguments
and/or produce results.

Classes:

**CompletableFuture<T>** implements Future<T>, CompletionStage<T>
A future that may be explicitly completed by setting its value and status, and maybe used as a completionStage, 
supporting dependent functions and actions that trigger upon its completion.   

 
@GET
public void asyncGet(@Suspended final AsyncResponse asyncResponse) {
    CompletableFuture
        .runAsync(() -> service.veryExpensiveOperation())
        .thenApply((result) -> asyncResponse.resume(result));
}

static CompletableFuture<Void> 	runAsync(Runnable runnable)
- Returns a new CompletableFuture that is asynchronously completed by a task running in the ForkJoinPool.commonPool() after it runs the given action.
void run()  = accepts nothing returns nothing
-When an object implementing interface Runnable is used to create a thread, starting the thread causes the object's run method to be called in that separately executing thread.

<U> CompletableFuture<U> 	thenApply(Function<? super T,? extends U> fn)
- Returns a new CompletionStage that, when this stage completes normally, is executed with this stage's result as the argument to the supplied function.
Function<T,R>	
- Represents a function that accepts one argument and produces a result.
R apply(T t)
-Applies this function to the given argument.


CompletableFuture<T> whenComplete(BiConsumer<? super T,? super Throwable> action)
Returns a new CompletionStage with the same result or exception as this stage, that executes the given action when this stage completes.



