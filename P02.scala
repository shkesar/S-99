/*
  Find the last but one element of a list.
*/

def lastButOne[A](l: List[A]): Option[A] = l match {
  case Nil => None
  case head :: head2 :: Nil => Some(head)
  case head :: tail => lastButOne(tail)
}
