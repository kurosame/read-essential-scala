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

  // 3.2 Objects as Functions

  // 3.2.1 The apply method
  /**
   * apply関数はオブジェクトを関数のように呼び出すことができる
   */
//  class Adder(amount: Int) {
//    def apply(in: Int): Int = in + amount
//  }
//
//  def main(args: Array[String]): Unit = {
//    val add3 = new Adder(3)
//
//    println(add3.apply(2)) // 5
//    // applyは省略できる
//    println(add3(4)) // 7
//  }

  // 3.2.2 Take home points

  // 3.2.3 Exercises

  // 3.2.3.1 When is a Function not a Function?
  /**
   * 関数apply構文は、計算を行うための再利用可能なオブジェクトとしてはどうか？また何が欠けているか
   */
  // 答え見た
  // Adderの型がInt型限定になっており、抽象化されていない

  // 3.3 Companion Object
  /**
   * クラスに属しているが、関数を独立させてシングルトンなオブジェクトに定義することができる
   * これをコンパニオンオブジェクトと呼ぶ
   * 以下はクラスに複数のコンストラクターを定義したい場合に、コンパニオンオブジェクトにapplyを定義している
   */
//  class Timestamp(val seconds: Long)
//
//  object Timestamp {
//    def apply(hours: Int, minutes: Int, seconds: Int): Timestamp =
//      new Timestamp(hours * 60 * 60 + minutes * 60 + seconds)
//  }

  /**
   * Scalaには2つの名前空間があり、それは型と値である
   * よって、クラスとコンパニオンオブジェクトで同じ名前を付けることが可能
   */

  // 3.3.1 Take home points

  // 3.3.2 Exercises

  // 3.3.2.1 Friendly Person Factory
  /**
   * 名前全体を受け入れるapply関数を含むPersonコンパニオンオブジェクトを実装せよ
   *
   * 以下のように文字列を配列に分割できる
   *
   * val parts = "John Doe".split(" ")
   * parts(0)
   */
  // 答え見た、問題が読み解けない
//  class Person(val firstName: String, val lastName: String) {
//    def name: String = s"$firstName $lastName"
//  }
//
//  object Person {
//    def apply(name: String): Person = {
//      val parts = name.split(" ")
//      new Person(parts(0), parts(1))
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(Person.apply("John Doe").firstName) // John
//    println(Person("John Doe").firstName) // John
//    println(Person("John Doe").name) // John Doe
//  }

  // 3.3.2.2 Extended Body of Work
  /**
   * 以下のDirectorとFilmのコンパニオンオブジェクトを実装せよ
   *
   * - Director
   *   - クラスのコンストラクターと同じパラメーターを受け入れ、新しいDirectorを返すapply関数を持つ
   *   - 2人のDirectorを受け入れ、2人のうち年齢が上の方を返すolder関数を持つ
   *
   * - Film
   *   - クラスのコンストラクターと同じパラメーターを受け入れ、新しいFilmを返すapply関数を持つ
   *   - 2つのFilmを受け入れ、2つのうち高いimdbRatingを返すhighestRating関数を持つ
   *   - 2つのFilmを受け入れ、それぞれの撮影時が古い方の監督を返すoldestDirectorAtTheTime関数を持つ
   */
//  class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {}
//
//  object Director {
//    def apply(firstName: String, lastName: String, yearOfBirth: Int) =
//      new Director(firstName, lastName, yearOfBirth)
//    // 年齢が同じ場合は？
//    def older(director1: Director, director2: Director) =
//      if (director1.yearOfBirth > director2.yearOfBirth) director1 else director2
//  }
//
//  class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {}
//
//  object Film {
//    def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) =
//      new Film(name, yearOfRelease, imdbRating, director)
//    // imdbRatingが同じ場合は？
//    def highestRating(film1: Film, film2: Film) =
//      if (film1.imdbRating > film2.imdbRating) film1 else film2
//    // yearOfReleaseが同じ場合は？
//    def oldestDirectorAtTheTime(film1: Film, film2: Film) =
//      if (film1.yearOfRelease < film2.yearOfRelease) film1.director else film2.director
//  }
//
//  // 以下が答え
////  class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
////    def name: String = s"$firstName $lastName"
////
////    def copy(firstName: String = this.firstName,
////             lastName: String = this.lastName,
////             yearOfBirth: Int = this.yearOfBirth
////    ) = new Director(firstName, lastName, yearOfBirth)
////  }
////
////  object Director {
////    def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
////      new Director(firstName, lastName, yearOfBirth)
////
////    def older(director1: Director, director2: Director): Director =
////      if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
////  }
////
////  class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
////    def directorsAge = director.yearOfBirth - yearOfRelease
////
////    def isDirectedBy(director: Director) = this.director == director
////
////    def copy(name: String = this.name,
////             yearOfRelease: Int = this.yearOfRelease,
////             imdbRating: Double = this.imdbRating,
////             director: Director = this.director
////    ) = new Film(name, yearOfRelease, imdbRating, director)
////  }
////
////  object Film {
////    def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film =
////      new Film(name, yearOfRelease, imdbRating, director)
////
////    def newer(film1: Film, film2: Film): Film =
////      if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2
////
////    def highestRating(film1: Film, film2: Film): Double = {
////      val rating1 = film1.imdbRating
////      val rating2 = film2.imdbRating
////      if (rating1 > rating2) rating1 else rating2
////    }
////
////    def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
////      if (film1.directorsAge > film2.directorsAge) film1.director else film2.director
////  }

  // 3.3.2.3 Type or Value?
  /**
   * 以下は型と値のどちらであるか
   *
   * val prestige: Film = bestFilmByChristopherNolan()
   */
  // 答え見た
  // 型、Film型を返しているから

  /**
   * 以下は型と値のどちらであるか
   *
   * new Film("Last Action Hero", 1993, mcTiernan)
   */
  // 型、Filmをnewしているから

  /**
   * 以下は型と値のどちらであるか
   *
   * Film("Last Action Hero", 1993, mcTiernan)
   */
  // 型
  // 間違い、正解は以下
  // 値、これはFilm.applyの省略形で関数だから

  /**
   * 以下は型と値のどちらであるか
   *
   * Film.newer(highPlainsDrifter, thomasCrownAffair)
   */
  // 値、Filmのnewerは関数だから

  /**
   * 以下は型と値のどちらであるか
   *
   * Film.type
   */
  // 型
  // 間違い、正解は以下
  // 値、Film.typeは自体は値、Film.typeの結果は型みたいな？

  /**
   * 【考察】
   * 全体的に値を返すものはシングルトンオブジェクトで定義して、型を返すものはクラスに定義するのが良さそう
   */

  // 3.4 Case Classes
  /**
   * ケースクラスを宣言すると、Scalaはクラスとコンパニオンオブジェクトを自動的に生成する
   */
//  case class Person(firstName: String, lastName: String) {
//    def name = firstName + " " + lastName
//  }
//
//  // Personクラス
//  val dave = new Person("Dave", "Gurnell")
//
//  // Personコンパニオンオブジェクト
//  Person

  // 3.4.1 Features of a case class

  // 3.4.2 Features of a case class companion object

  // 3.4.3 Case objects
//  case object Citizen {
//    def firstName = "John"
//    def lastName = "Doe"
//    def name = firstName + " " + lastName
//  }

  // 3.4.4 Take Home Points

  // 3.4.5 Exercises

  // 3.4.5.1 Case Cats
  /**
   * それぞれString型のcolourとfoodを持つCatケースクラスを作成せよ
   */
//  case class Cat(colour: String, food: String)

  // 3.4.5.2 Roger Ebert Said it Best…
  /**
   * DirectorとFilmのケースクラスを作成せよ
   */
  // 答え見た
//  case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
//    def name: String = s"$firstName $lastName"
//  }
//
//  object Director {
//    def older(director1: Director, director2: Director): Director =
//      if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
//  }
//
//  case class Film(name: String, yearOfRelease: Int, imdbRating: Double, director: Director) {
//    def directorsAge = yearOfRelease - director.yearOfBirth
//    def isDirectedBy(director: Director) = this.director == director
//  }
//
//  object Film {
//    def newer(film1: Film, film2: Film): Film =
//      if (film1.yearOfRelease < film2.yearOfRelease) film1 else film2
//
//    def highestRating(film1: Film, film2: Film): Double = {
//      val rating1 = film1.imdbRating
//      val rating2 = film2.imdbRating
//      if (rating1 > rating2) rating1 else rating2
//    }
//
//    def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
//      if (film1.directorsAge > film2.directorsAge) film1.director else film2.director
//  }

  // 3.4.5.3 Case Class Counter
  /**
   * copy関数を使ってCounterケースクラスを再実装せよ
   * また、countをデフォルト値の0に初期化せよ
   */
  // 答え見た
//  case class Counter(count: Int = 0) {
//    def dec = copy(count = count - 1)
//    def inc = copy(count = count + 1)
//  }

  // 3.4.5.4 Application, Application, Application
  /**
   * 前のセクションのPersonクラスをケースクラスに変換せよ
   * その際にapply関数を持つコンパニオンオブジェクトがあることを確認せよ
   * （ケースクラスを作成するとコンパニオンオブジェクトが自動的に作られる）
   */
  // 答え見た
//  case class Person(firstName: String, lastName: String) {
//    def name = firstName + " " + lastName
//  }
//
//  object Person {
//    def apply(name: String): Person = {
//      val parts = name.split(" ")
//      apply(parts(0), parts(1))
//    }
//  }

  // 3.5 Pattern Matching

  // 3.5.1 Pattern Syntax

  // 3.5.2 Take Home Points

  // 3.5.3 Exercises

  // 3.5.3.1 Feed the Cats
  /**
   * willServe関数を持つChipShopオブジェクトを定義せよ
   * この関数は、Catを引数にとり、猫の好きな食べ物がチップスの場合trueを返し、それ以外はfalseを返す
   * その実装はパターンマッチングを使用せよ
   */
//  class Cat(val name: String, val colour: String, val food: String)
//
//  object ChipShop {
//    def willServe(c: Cat) = c.food match {
//      case "Chips" => true
//      case _       => false
//    }
//  }
//
//  // 模範解答は以下
////  object ChipShop {
////    def willServe(cat: Cat): Boolean =
////      cat match {
////        case Cat(_, _, "Chips") => true
////        case Cat(_, _, _)       => false
////      }
////  }

  // 3.5.3.2 Get Off My Lawn!
  /**
   * Doubleを返すrate関数を持つDadオブジェクトをパターンマッチングで実装せよ
   * rate関数はFilmを引数にとり、Clint Eastwoodの映画は10.0、John McTiernanは7.0、それ以外は3.0を返す
   */
//  class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director)
//
//  object Dad {
//    def rate(f: Film) = f.name match {
//      case "Clint Eastwood" => 10.0
//      case "John McTiernan" => 7.0
//      case _                => 3.0
//    }
//  }
//
//  // 模範解答は以下
////  // nameは映画名だった、Directorに監督名を保持してる
////  object Dad {
////    def rate(film: Film): Double =
////      film match {
////        case Film(_, _, _, Director("Clint", "Eastwood", _)) => 10.0
////        case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
////        case _                                               => 3.0
////      }
////  }

  // 3.6 Conclusions
}
