import kotlinx.coroutines.experimental.*

// runBlocking starts a top-level coroutine that blocks until its inner coroutine is active
fun main(args: Array<String>) = runBlocking<Unit> {
    // create a lot of coroutines and list their jobs
    val jobs = List(100000) {
        launch(CommonPool) {
            delay(1000L)
            print(".")
        }
    }

    // wait for all jobs to complete
    jobs.forEach { it.join() }
}
