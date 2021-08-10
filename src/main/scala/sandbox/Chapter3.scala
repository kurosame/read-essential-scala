package sandbox

object Chapter3 {
  // 3 Objects and Classes

  // 3.1 Classes

  // 3.1.1 Defining a Class
  /**
   * Scalaクラスはすべてjava.lang.Objectのサブクラスになる
   */

  // 3.1.2 Constructors
  // Person1とPerson2は同等
  // Person2はPerson1の短縮形
//  class Person1(first: String, last: String) {
//    val firstName = first
//    val lastName = last
//    def name = firstName + " " + lastName
//  }
//
//  class Person2(val firstName: String, val lastName: String) {
//    def name = firstName + " " + lastName
//  }

  // 3.1.3 Default and Keyword Parameters

  // 3.1.4 Scala’s Type Hierarchy
  /**
   * プリミティブ型とオブジェクト型を区別するJavaとは異なり、Scalaはすべてがオブジェクト型である
   * Any型というスーパータイプがあり、その下にAnyVal型とAnyRef型がある
   * AnyValはすべての値型のスーパータイプであり、AnyRefはすべての参照型またはクラスのスーパータイプである
   * AnyValの下にInt型やBoolean型などがある
   * AnyRefの下にArray型やクラスがある
   * 最下層には、Nothing型とNull型がある
   */

  // 3.1.5 Take Home Points

  // 3.1.6 Exercises

  // 3.1.6.1 Cats, Again
  /**
   * クラスCatを定義し、以下の各猫のオブジェクトを作成せよ
   *
   * Name      | Colour          | Food
   * Oswald    | Black           | Milk
   * Henderson | Ginger          | Chips
   * Quentin   | Tabby and white | Curry
   */
//  class Cat(val name: String, val colour: String, val food: String)
//  val oswald = new Cat("Oswald", "Black", "Milk")
//  val henderson = new Cat("Henderson", "Ginger", "Chips")
//  val quentin = new Cat("Quentin", "Tabby and white", "Curry")

  // 3.1.6.2 Cats on the Prowl
  /**
   * willServe関数を持つChipShopオブジェクトを定義せよ
   * この関数は猫の好きな食べ物がChipsの場合はtrueを返し、それ以外の場合はfalseを返す
   */
//  object ChipShop {
//    def willServe(food: String) = food == "Chips"
//  }
//  // 上記で正解だが、模範解答は以下
//  class Cat(val name: String, val colour: String, val food: String)
//  object ChipShop2 {
//    def willServe(cat: Cat): Boolean =
//      if (cat.food == "Chips") true else false
//  }

  // 3.1.6.3 Directorial Debut
  /**
   * DirectorクラスとFilmクラスを定義せよ
   * 問題文は以下のリンク先の3.1.6.3を参照（問題文が長いので）
   * https://books.underscore.io/essential-scala/essential-scala.html
   */
  // 答え見た、directorsAgeやisDirectedByの関数の説明が少なすぎる
//  class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
//    def name: String = s"$firstName $lastName"
//
//    def copy(firstName: String = this.firstName,
//             lastName: String = this.lastName,
//             yearOfBirth: Int = this.yearOfBirth
//    ): Director =
//      new Director(firstName, lastName, yearOfBirth)
//  }
//
//  class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
//    def directorsAge = yearOfRelease - director.yearOfBirth
//
//    def isDirectedBy(director: Director) = this.director == director
//
//    def copy(name: String = this.name,
//             yearOfRelease: Int = this.yearOfRelease,
//             imdbRating: Double = this.imdbRating,
//             director: Director = this.director
//    ): Film =
//      new Film(name, yearOfRelease, imdbRating, director)
//  }
//
//  def main(args: Array[String]): Unit = {
//    val eastwood = new Director("Clint", "Eastwood", 1930)
//    val mcTiernan = new Director("John", "McTiernan", 1951)
//    val nolan = new Director("Christopher", "Nolan", 1970)
//    val someBody = new Director("Just", "Some Body", 1990)
//
//    val memento = new Film("Memento", 2000, 8.5, nolan)
//    val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
//    val inception = new Film("Inception", 2010, 8.8, nolan)
//
//    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
//    val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
//    val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
//    val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
//    val invictus = new Film("Invictus", 2009, 7.4, eastwood)
//
//    val predator = new Film("Predator", 1987, 7.9, mcTiernan)
//    val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
//    val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
//    val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
//
//    println(eastwood.yearOfBirth) // 1930
//    println(dieHard.director.name) // John McTiernan
//    println(invictus.isDirectedBy(nolan)) // false
//
//    println(highPlainsDrifter.copy(name = "L'homme des hautes plaines"))
//    println(thomasCrownAffair.copy(yearOfRelease = 1968, director = new Director("Norman", "Jewison", 1926)))
//    println(inception.copy().copy().copy())
//  }

  // 3.1.6.4 A Simple Counter
  /**
   * Counterクラスを実装せよ
   * ・コンストラクターはInt型を取る
   * ・inc関数とdec関数は、カウンターをインクリメント・デクリメントして、新しいカウンターを返す
   *
   * 以下が動くこと
   * new Counter(10).inc.dec.inc.inc.count
   */
//  class Counter(val count: Int) {
//    def inc = new Counter(count + 1)
//    def dec = new Counter(count - 1)
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(new Counter(10).inc.dec.inc.inc.count) // 12
//  }

  // 3.1.6.5 Counting Faster
  /**
   * 上記のCounterを拡張して、ユーザーがオプションでIntパラメーターをincおよびdecに渡せるようにせよ
   * パラメーターを省略した場合はデフォルト1となる
   */
//  class Counter(val count: Int) {
//    def inc(n: Int = 1) = new Counter(count + n)
//    def dec(n: Int = 1) = new Counter(count - n)
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(new Counter(10).inc(2).dec(3).inc(4).inc().count) // 14
//  }

  // 3.1.6.6 Additional Counting
  /**
   * 上記のCounterを拡張し、adjust関数を追加せよ
   * この関数は以下のAdderを受け入れ、Adderをカウントに適用した新しいカウンターを返す
   *
   * class Adder(amount: Int) {
   *   def add(in: Int) = in + amount
   * }
   */
//  class Adder(amount: Int) {
//    def add(in: Int) = in + amount
//  }
//
//  class Counter(val count: Int) {
//    def inc(n: Int = 1) = new Counter(count + n)
//    def dec(n: Int = 1) = new Counter(count - n)
//    def adjust(adder: Adder) = new Counter(count + adder.add(5))
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(new Counter(10).inc(2).dec(3).inc(4).inc().adjust(new Adder(6)).count) // 25
//  }

}
