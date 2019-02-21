
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// runBlocking starts a top-level coroutine that blocks until its inner coroutine is active
fun main() = runBlocking<Unit> {
    // create a lot of coroutines and list their jobs
    val jobs = List(100_000) {
        launch {
            delay(1_000L)
            print(".")
        }
    }

    // wait for all jobs to complete
    jobs.forEach { it.join() }
    println()
}
