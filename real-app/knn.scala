import Math.scala

def distance (x: Int, y: Int): Int = {
  return (sqrt(pow(x, 2) + pow(y, 2))
}

def knn (data: Vector, unknown: Int){
  var top1 = 0
  var top2 = 0
  var top3 = 0
  for (num <- data){
    var dist = distance(num, unknown)
    if (dist > top1){
      top3 = top2
      top2 = top1
      top1 = dist
    }else if(dist > top2){
      top3 = top2
      top2 = dist
    }else if(dist > top3){
      top3 = dist
    }
  }
  return((top1+top2+top3)/3)
}

val data = Vector(3, 4, 6, 2, 2, 3, 1, 6, 9)
knn(data, 2)
