
def greeting(name : String) : String = name match
	case "Suraj" => "Hello Suraj, Long Time!"
	case "Krushn" => "Wazzzzzzzaaaapppppppp!"
	case _ => "What's your name?"


def greeting2(name : String) : String = name match
	case "Suraj" | "Krushn" => "Wazzzzzzzaaaapppppppp!"
	case newFriend => s"Hello $newFriend! Nice to meet you!"

def comptition(result: Int): String = result match
	case 1 => "Gold"
	case 2 => "Silver"
	case 3 => "Bronze"
	case _ => "Well Done!"

greeting("Suraj")
greeting("Krushn")
greeting("Raj")

greeting2("Suraj")
greeting2("Krushn")
greeting2("Raj")

comptition(1)
comptition(2)
comptition(3)
comptition(4)