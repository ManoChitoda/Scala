import Comprehension.*

@main def comprehensionTest: Unit = println(getFirstClassTicketPriceForComp(Some(TicketPrice(100, Some(200)))))

object Comprehension {
	case class Rating(googleRating: Option[Int], netflixRating: Option[Int])
	case class Film(name: String, rating: Option[Rating])
	case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])

	val mulan: Film = Film("Mulan", Some(Rating(Some(5), Some(2))))

	val avgRating: Option[Int] = for
		rating <- mulan.rating
		gRating <- rating.googleRating
		nRating <- rating.netflixRating
		avgRating = (gRating + nRating) / 2
	yield avgRating

	def getFirstClassTicketPriceFlatMap(ticketPrice: Option[TicketPrice]): Option[Int] = ticketPrice.flatMap(ticket => ticket.firstClassTicketPrice)
	def getFirstClassTicketPriceForComp(ticketPrice: Option[TicketPrice]): Option[Int] =
		for
			t <- ticketPrice
			firstClassTP <- t.firstClassTicketPrice
		yield firstClassTP
	end getFirstClassTicketPriceForComp
}
