/*
  Find the Kth element of a list.
    By convention, the first element in the list is element 0.
    
    Example:
    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
  */

def nth[A](n: Int, l: List[A]): Option[A] = {
  if (n == 0) l.headOption
  else l match {
    case Nil => None
    case head :: tail => nth(n-1, tail)
  }
}
