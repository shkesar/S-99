/*
  Reverse a list.
  Example:
    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
 */
 
def reverse[A](l: List[A]): List[A] = {
  def _reverse(acc: List[A], l: List[A]): List[A] = l match {
    case Nil => acc
    case head :: tail => _reverse(head :: acc, tail)
  }
  _reverse(List(), l)  
}
