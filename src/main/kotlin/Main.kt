fun main() {
    name()
    words(7)
    words(3)
    find(arrayOf(45, 78,94,31))
    classes()
    rest()
    identity()

    var crime = Book("We fly",443,320,2023)
    println(crime.author)
    println(crime.title)
    println(crime.pages)
    println(crime.published)
}
fun name(){
    var word = "November"
    println(word[2])
    println("${word[4]}${word[5]}${word[6]}")

  for (x in word)
       println(x)
    println(word.length)

    var sound = "boom"
    for (x in sound)
    println(sound.capitalize())

    val shoes = "Boots"
}
fun words(chemical: Int){

    if (chemical == 7){
        println("neutral")

    } else if(chemical != 7) {
        println("base")
         } else {
             println("acidic")
    }

}
fun find(found: Array<Int>) {
    println(found.max())

}
fun classes(){
    var come = arrayOf("anitab", "adalab","rwanda", "kenya","tanzania")
    print(come.sortedArray().contentToString())
}
class Human(var name: String, var gender: String, var color: String, var height: String, var weight: String){

}
fun rest(){
    println("sleep eight hours")
}
fun identity(){
    println("my name is Lucky")
}
data class Book(var author: String, var title: Int, var pages: Int, var published: Int) {

}
