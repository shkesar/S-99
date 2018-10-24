/*
  Find the number of elements of a list.
  
  Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
 */
 
def length[A](l: List[A]): Int = {
  def _length(acc: Int, l: List[A]): Int = l match {
    case Nil => acc
    case head :: tail => _length(acc + 1, tail)
  }
  _length(0, l)
}
