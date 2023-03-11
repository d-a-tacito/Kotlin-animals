fun main() {
    var arr : Array<Animal> = arrayOf(Dog("meat","Europe",3),
        Cat("milk","Asia",8),
        Horse("grass","Africa", "titan"))
    var vet = Vet()
    for(i in 0..arr.size-1)
        vet.treatAnimal(arr[i])
}

open class Animal(f:String, l:String)
{
    var food=f
    var location =l

    open fun makeNoise ()
    {
        println("Такое-то животное издает звук")
    }
    open fun eat()
    {
        println("Такое-то животное ест")
    }
    open fun sleep()
    {
        println("Спит")
    }
}

class Dog(f:String, l:String, wpd:Int) : Animal(f,l)
{
    var walksPerDay:Int=wpd

    override fun makeNoise() {
        println("Собака лает")
    }
    override fun eat() {
        println("Собака ест")
    }
}

class Cat(f:String, l:String,mpd:Int) : Animal(f,l)
{
    var mausPerDay=mpd

    override fun makeNoise() {
        println("Кот мяукает")
    }
    override fun eat() {
        println("Кот ест")
    }
}

class Horse(f:String, l:String,hhType:String) : Animal(f,l)
{
    var horsesHoe:String = hhType

    override fun makeNoise() {
        println("Лошадь лает")
    }
    override fun eat() {
        println("Лошадь ест")
    }
}

class Vet()
{
    fun treatAnimal(animal: Animal)
    {
        println("${animal.javaClass}. Food - ${animal.food} Location - ${animal.location}")
    }
}