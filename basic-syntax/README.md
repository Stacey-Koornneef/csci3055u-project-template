_Comments_
```Scala
#This is a comment
```

_Mutable Values_
```Scala
#create a mutable integer
var num: int = 5
#create a mutable string
var name: String = "Stacey"
```

_Immutable Values_
```Scala
#create an immutable integer
val num: int = 5
#create an immutable string
val name: String = "Stacey"
```

_Detemining Type by Inference_
```Scala
#create an integer by inference
val num = 5
```

_String Interpolation_
```Scala
val name: String = "Stacey"
#print "My name is Stacey"
println(s"My name is $name")
```

_If/Else If/Else_
```Scala
var x = 5
if(x > 10) {
  println("x is greater than 10")
} else if (x < 0) {
  println("x is negative")
} else {
  println("x is between 0 and 10")
}
```

_For Loop_
```Scala
for(i < -1 until 6){
  println(i)
}
```

_While Loop_
```Scala
var x = 0
while ( x < 5){
  println(s"Number: $x")
  x += 1
}
```

_Functions_
```Scala
#create a function that adds 2 integers together
def add( x:Int, y:Int) : Int = {
  var sum = 0
  sum = x + y
  return sum
}

#call the above function
add(1, 2)
```
