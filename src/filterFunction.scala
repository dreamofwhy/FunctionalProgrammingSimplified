// Write a filter function from scratch 

def filter[A](f: A => Boolean, list: Seq[A]): Seq[A] = {
  for {
    x <- list
    if f(x)
  } yield x
}

val myNums = List(1, 2, 3, 4, 5, 6)
def odd(i: Int): Boolean = i % 2 == 1
def even(i: Int): Boolean = i % 2 == 0

// After writing all this out in vi on a terminal, I realized I should be using vs code 
// or some other light weight ide, just for the highlighting and auto indenting.
// ...and spelling check. 
