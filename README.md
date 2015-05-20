
# BetaMax + JUnit + Gradle works

This is just a quick demo of [BetaMax](http://freeside.co/betamax/), [Junit](http://junit.org/), and 
[Gradle](https://gradle.org/), working together.  [RetroFit](http://square.github.io/retrofit/) is also used.
  
It was easy to set up, my only problem was that I had to include groovy explicitly, and that version it had to be 
version 2.2.0 (rather than 2.3.3), due to a [bug](https://github.com/robfletcher/betamax/issues/141).


## Run the tests

`./gradlew build`