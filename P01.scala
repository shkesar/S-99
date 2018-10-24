/*
  (P01) Find the last element of a list.
*/

def last[A](l: List[A]): Option[A] = l match {
  case Nil => None
  case head :: Nil => Some(head) // Order is important
  case head :: tail => last(tail)
}
