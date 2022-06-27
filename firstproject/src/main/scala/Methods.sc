val favoriteDessert = "IceCream"

def sum(x : Int, y : Int) : Int = x + y
def product(x : Int, y : Int) : Int = x * y
def greeting(name : String = "Stranger") : String = s"Hey $name!"

sum(sum(sum(1, 2), 3), 4)
product(product(product(1, 2), 3), 4)
greeting()
greeting(name = "Manohar")