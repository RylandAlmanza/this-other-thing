/** This generates a bunch of pounds and periods. Some people don't like
  * pounding during periods, but I'm pretty okay with it. I'm also too drunk
  * to give this project a good name. That'll probably change later (er, at
  * least the "name" part. The "good" part probably won't change.)
  */

object ThisOtherThing {
    def main (args: Array[String]) {
        var ab = ""
        var x = 0
        var y = 0
        for (y <- 0 to 23) {
            for (x <- 0 to 79) {
                ab = ab + (if (new scala.util.Random().nextBoolean()) "#" else ".")
            }
            ab = ab + "\n"
        }

        println(ab)
    }
}
