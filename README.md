# effect-handlers
Use cases of different effect handlers in Jetpack Compose

**Effect Handlers**

<img src="https://github.com/raheemadamboev/effect-handlers/blob/master/jetpack-compose-banner.png" />

**• LaunchedEffect**

Gets a key and gives you a coroutine block to execute a piece of code that is safe from recomposition. Whenever key changes, it cancels the coroutine block and starts that block again.

**• rememberCoroutineScope**

It remembers and gives the coroutine scope. So we can launch coroutine and execute suspendable functions and others.

**• rememberUpdatedState**

This function is very handy when we execute piece of code in for examle LaunchedEffect and we fire up lambda. But it could fire up old instance of lambda not new instance of it. So we have to always want to fire up the latest instance of lambda and rememberUpdatedState() can help us in this situation.

**• DisposableEffect**

This is very special effect handler that gives us option to clean up after composition is destroyed or some lifecycle is over. It has onDispose lambda function that in there we can clean up our actions. For instance we can remove observers and others. Like LaunchedEffect it also gets a key and whenever key is changed it fires up again.

**• SideEffect**

SideEffect gives us a lambda that is executed after every successfull recomposition.

**• produceState**

With produceState function we can produce state.

**• derivedStateOf**

This function is very handy when we have a value that is created by calculation or some heavy work. If we create it by this function, it creates the object for the first time and then caches it, so that calcutaion is not executed in every recomposition. But if state that is used in calculation changes it recreates the object again and caches it, so efficient.

**• snapshotFlow**

snapshotFlow function gets the state and converts them to flow.
