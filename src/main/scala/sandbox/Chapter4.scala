package sandbox

object Chapter4 {
  // 4 Modelling Data with Traits
  /**
   * クラスの抽象化はtraitと呼ばれるメカニズムで実現される
   */

  // 4.1 Traits
  /**
   * クラスがオブジェクトを作成するためのテンプレートであるのと同じように、トレイトはクラスを作成するためのテンプレートである
   * Javaのインターフェイスに非常によく似ている
   */

  // 4.1.1 An Example of Traits
  /**
   * 以下の例は、Visitorトレイトを作成し、2つのクラスに継承させている
   * Visitorトレイトは2つのサブクラスが必ず実装する必要があるインターフェイスを表す（idとcreatedAt）
   * ageは初期値が自動で初期値が設定されているので、クラスで実装しなくてもそのまま使える
   */
//  import java.util.Date
//
//  trait Visitor {
//    def id: String
//    def createdAt: Date
//    def age: Long = new Date().getTime - createdAt.getTime
//  }
//
//  case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
//
//  case class User(id: String, email: String, createdAt: Date = new Date()) extends Visitor

  // 4.1.2 Traits Compared to Classes
  /**
   * ・トレイトはコンストラクタを持てない
   * ・トレイトから直接オブジェクトを作成できない
   *  ⇒ トレイトをクラスに継承させて、オブジェクトを作成する
   */
  /**
   * トレイト内のフィールドはvalではなく、defで定義するのがおすすめ
   * （トレイトを継承したクラスで実装するから、トレイトでvalでキャッシュしても意味ないから？）
   * （よって、トレイトのフィールドはdefでクラスのフィールドはvalにするのが良い）
   */

  // 4.1.3 Take Home Points

  // 4.1.4 Exercises

  // 4.1.4.1 Cats, and More Cats
  /**
   * 以下のFelineトレイトとそれを継承したCat、Tiger、Lion、Pantherクラスを作成せよ
   * ・Stringのcolourフィールドを持つ
   * ・Stringのsoundフィールドを持ち、猫はmeow、猫以外はroar
   * ・CatのみString型のfoodを持つ
   * ・LionのみInt型のmaneSizeを持つ
   */
//  trait Feline {
//    def colour: String
//    def sound: String
//  }
//
//  case class Cat(colour: String, sound: String = "meow", food: String) extends Feline
//  case class Tiger(colour: String, sound: String = "roar") extends Feline
//  case class Lion(colour: String, sound: String = "roar", maneSize: Int) extends Feline
//  case class Panther(colour: String, sound: String = "roar") extends Feline

  // 4.1.4.2 Shaping Up With Traits
  /**
   * 以下のShapeトレイトを作成せよ
   * ・sides関数は辺の数を返す
   * ・perimeter関数は辺の全長を返す
   * ・area関数は面積を返す
   *
   * Circle、Rectangle、SquareでShapeトレイトの上記を実装せよ
   */
  // 答え見た
//  trait Shape {
//    def sides: Int
//    def perimeter: Double
//    def area: Double
//  }
//
//  case class Circle(radius: Double) extends Shape {
//    val sides = 1
//    val perimeter = 2 * math.Pi * radius
//    val area = math.Pi * radius * radius
//  }
//
//  case class Rectangle(width: Double, height: Double) extends Shape {
//    val sides = 4
//    val perimeter = 2 * width + 2 * height
//    val area = width * height
//  }
//
//  case class Square(size: Double) extends Shape {
//    val sides = 4
//    val perimeter = 4 * size
//    val area = size * size
//  }

  // 4.1.4.3 Shaping Up 2 (Da Streets)
  /**
   * Squareは幅と高さが同じRectangleの一種でもある
   * Rectangularトレイトで共通化し、SquareとRectangleをリファクタリングせよ
   */
  // 答え見た
//  trait Shape {
//    def sides: Int
//    def perimeter: Double
//    def area: Double
//  }
//
//  // sealed trait使ってるじゃん
//  sealed trait Rectangular extends Shape {
//    def width: Double
//    def height: Double
//    val sides = 4
//    override val perimeter = 2 * width + 2 * height
//    override val area = width * height
//  }
//
//  case class Square(size: Double) extends Rectangular {
//    val width = size
//    val height = size
//  }
//
//  case class Rectangle(val width: Double, val height: Double) extends Rectangular

  // 4.2 This or That and Nothing Else: Sealed Traits
  /**
   * sealed traitにすると、そのトレイトは同一ファイル内からのみ継承可能になる
   * また、サブクラスもfinal case classにして、継承させないようにすることでコンパイラーが検知できるレベルで制御でき堅牢になる
   */

  // 4.2.1 Take home points
}
