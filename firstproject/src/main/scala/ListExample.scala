import ListExample.*

@main def listExampleTest: Unit = println(filteredList)
object ListExample {
	case class Destination(city: String, journeyTime: Int)
	val destinations: List[Destination] = List(
		Destination("Greece", 100),
		Destination("England", 200),
		Destination("Great Britain", 50),
		Destination("Africa", 400),
		Destination("Paris", 90))

	val filteredList = for
		destination <- destinations
		if destination.journeyTime > 200
	yield destination.city

	def combinations(xs: List[Int], ys: List[Int]): List[(Int, Int)] =
		for
			x <- xs
			y <- ys
		yield (x,y)
	end combinations

	def takeNames(names: List[String], hasThisStr: String): List[String] =
		for
			name <- names
			if name.toLowerCase().contains(hasThisStr.toLowerCase())
		yield name
	end takeNames
}
