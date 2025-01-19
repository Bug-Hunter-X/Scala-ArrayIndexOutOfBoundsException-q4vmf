```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Safe way to access elements using getOrElse
  println(list.lift(5).getOrElse(0)) //Prints 0 because index 5 is out of bounds
  //Alternatively, check the index bounds before accessing the element
  if(list.size > 5){
      println(list(5))
  }else{
      println("Index out of bounds")
  }
}
```