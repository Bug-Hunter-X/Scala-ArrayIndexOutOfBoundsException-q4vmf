```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  //This will cause an error since you're trying to access the element at index 5 which is out of bounds for a list of size 5.
  println(list(5))
}
```