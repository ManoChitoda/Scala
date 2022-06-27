
def partyAtHome(guest : Int, tentAvailable : Boolean) : Boolean =
	if guest < 15 then true
	else if tentAvailable && guest < 40 then true
	else false

partyAtHome(guest = 2, tentAvailable = true)