# Minimal Kotlin coroutine example [![Build Status](https://travis-ci.org/steverichey/kotlin-coroutine-minimal-example.svg?branch=master)](https://travis-ci.org/steverichey/kotlin-coroutine-minimal-example)

This is a minimal working example of using [Kotlin](http://kotlinlang.org/) [coroutines](https://blog.jetbrains.com/kotlin/2016/07/first-glimpse-of-kotlin-1-1-coroutines-type-aliases-and-more/). Kotlin is a neat language that offers simple, [Swift](https://swift.org/) style syntax while targeting the JVM, meaning it works everywhere that Java does. Kotlin's coroutines are experimental but, so far, offer a very promising approach to issues related to asynchronous programming. More information on the use and features of coroutines is available [here](https://github.com/Kotlin/kotlinx.coroutines/blob/master/coroutines-guide.md). The syntax should be very familiar to anyone who has worked with Swift's [Dispatch](https://developer.apple.com/videos/play/wwdc2016/720/) or `async`/`await` in [C#](https://msdn.microsoft.com/en-us/library/kx37x362.aspx).

# Setup

This project builds using the [Gradle Wrapper](https://docs.gradle.org/3.4.1/userguide/gradle_wrapper.html) which means that there is a small build script (`gradlew` or `gradlew.bat`) that will download and setup the proper version of [Gradle](https://gradle.org) when run, and use that version in the future. For this example, no setup is required.

# Build

Run the top-level file `run`. That's it. This is a tiny script that calls the Gradle Wrapper, which in turn will set up Gradle and run the provided example. In this case, we're just running [this example](https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/src/test/kotlin/guide/example-basic-03.kt) from the Kotlin coroutine documentation, which creates 100,000 coroutines which each wait one second and then print a dot.

# License

&copy; 2017 [Steve Richey](https://github.com/steverichey). Shared under an [MIT license](https://en.wikipedia.org/wiki/MIT_License). See [license.md](./license.md) for details.
