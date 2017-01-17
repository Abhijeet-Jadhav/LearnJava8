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


