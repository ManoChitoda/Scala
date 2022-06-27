import Example.*
import TrafficLight.*
import Triathlon.*

@main def hello: Unit = println(howManyMeters(Cycle))

object Example {
  enum TrafficLight:
    case Red, Amber, Green

  enum Triathlon(val meters: Int):
    case Swim extends Triathlon(400)
    case Cycle extends Triathlon(5000)
    case Run extends Triathlon(2500)

  import TrafficLight.*
  def drivingSignal(light: TrafficLight): String = light match
    case TrafficLight.Red => "Stop"
    case TrafficLight.Amber => "Get Ready"
    case TrafficLight.Green => "Go"

  import Triathlon.*
  def howManyMeters(tri: Triathlon): Int = tri match
    case swim @ Swim => swim.meters
    case cycle @ Cycle => cycle.meters
    case run @ Run => run.meters
}