import Challenge.*
import UnitedKingdom.*

@main def caseEnoum: Unit = println(whereAmI(Wales))

object Challenge{
	case class Country(name: String, population: Int)
	def population(country: Country): Int = country.population

	population(Country("United States", 5000))

	enum UnitedKingdom:
		case England, NorthernIreland, Scotland, Wales

	import UnitedKingdom.*
	var country = England
	if country == Scotland then println("Scotland!")

	def whereAmI(country: UnitedKingdom): String = country match
		case England => "England!"
		case NorthernIreland => "NorthernIreland"
		case Scotland => "Scotland"
		case Wales => "Wales"
}

