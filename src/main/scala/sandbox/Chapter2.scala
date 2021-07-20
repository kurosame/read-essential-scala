package sandbox

object Chapter2 {
  // 2 Expressions, Types, and Values

  // 2.1 Your First Program

  // 2.1.1 Compile-time and Run-time

  // 2.1.2 Expressions, Types, and Values

  // 2.1.3 Take Home Points
  /**
   * 式（`2.min(3)`）は値（2）に評価されるプログラムの一部である
   * 式には型があり、コンパイル時に型がチェックされる
   * 値はメモリに保存され、実行中のプログラムが使用する
   * 値には型がない
   */

  // 2.1.4 Exercises

  // 2.1.4.1 Type and Value
  /**
   * 次の式の型と値を示せ
   */
//  def main(args: Array[String]): Unit = {
//    // 3, Int型
//    println(1 + 2)
//    // 3, Int型
//    println("3".toInt)
//    // エラー
//    println("foo".toInt)
//  }

  // 2.2 Interacting with Objects

  // 2.2.1 Objects

  // 2.2.2 Method Calls

  // 2.2.3 Operators

  // 2.2.4 Take home points
  /**
   * すべてのScala値はオブジェクトである
   * よって、IntやBooleanなどのプリミティブ型の関数を呼び出すこともできる
   * Javaのintやbooleanはオブジェクトではない
   */

  // 2.2.5 Exercises

  // 2.2.5.1 Operator Style
  /**
   * 以下をoperator-style（関数呼び出しスタイルではないやつ）で書き直せ
   * "foo".take(1)
   *
   * 以下を関数呼び出しスタイルで書き直せ
   * 1 + 2 + 3
   */
//  def main(args: Array[String]): Unit = {
//    // "foo" take 1 が答え（Intellijが勝手にメソッドスタイルに直しちゃう）
//    println("foo".take(1)) // f
//    println(1.+(2).+(3)) // 6
//  }

  // 2.2.5.2 Substitution
  /**
   * 以下の式の違いは何か、また類似点は何か
   * 1 + 2 + 3
   * 6
   */
  // 答え見た
  // 1 + 2 + 3も6もプログラムの意味は変わらないので、プログラム中の1 + 2 + 3を6に置換しても結果は変わらない（逆も同様）

  // 2.3 Literal Objects

  // 2.3.1 Numbers

  // 2.3.2 Booleans

  // 2.3.3 Characters

  // 2.3.4 Strings

  // 2.3.5 Null

  // 2.3.6 Unit

  // 2.3.7 Take home points

  // 2.3.8 Exercises

  // 2.3.8.1 Literally Just Literals
  /**
   * 以下のScalaリテラル値の型は何か
   * 42
   * true
   * 123L
   * 42.0
   */
//  def main(args: Array[String]): Unit = {
//    println(42) // Int
//    println(true) // Boolean
//    println(123L) // Long
//    println(42.0) // Double
//  }

  // 2.3.8.2 Quotes and Misquotes
  /**
   * 以下のリテラルの違いとそれぞれの型は何か
   * 'a'
   * "a"
   */
  // Char型とString型

  // 2.3.8.3 An Aside on Side-Effects
  /**
   * 以下の式の違いとそれぞれの型は何か
   * "Hello world!"
   * println("Hello world!")
   */
  // String型とUnit型

  // 2.3.8.4 Learning By Mistakes
  /**
   * 以下のリテラル値の型は何か
   * 'Hello world!'
   */
  // コンパイルエラー

  // 2.4 Object Literals

  // 2.4.1 Methods

  // 2.4.2 Fields

  // 2.4.3 Methods versus fields

  // 2.4.4 Take home points

  // 2.4.5 Exercises

  // 2.4.5.1 Cat-o-matique
  /**
   * 猫の名前、色、好きな食べ物を猫ごとにオブジェクトに定義せよ
   *
   * Name      | Colour          | Food
   * Oswald    | Black           | Milk
   * Henderson | Ginger          | Chips
   * Quentin   | Tabby and white | Curry
   */
//  object Oswald {
//    val name = "Oswald"
//    val colour = "Black"
//    val food = "Milk"
//  }
//  object Henderson {
//    val name = "Henderson"
//    val colour = "Ginger"
//    val food = "Chips"
//  }
//  object Quentin {
//    val name = "Quentin"
//    val colour = "Tabby and white"
//    val food = "Curry"
//  }

  // 2.4.5.2 Square Dance!
  /**
   * Doubleを引数として受け入れる関数squareを使用して、calcオブジェクトを定義せよ
   * squareは入力を2乗する
   * また、入力squareをキューブ化するcube関数も追加せよ
   */
  // 答え見た
  // squareは解けた
  // cubeは問題がよく分からなかった
//  object calc {
//    def square(d: Double) = d * d
//    def cube(d: Double) = d * square(d)
//  }

  // 2.4.5.3 Precise Square Dance!
  /**
   * 前の演習のcalcを利用し、IntとDoubleで機能するように一般化されたcalc2を作成せよ
   */
  // 答え見た
  // 単純に2つ書けば良かったのか（オーバーロード）
//  object calc2 {
//    def square(value: Double) = value * value
//    def cube(value: Double) = value * square(value)
//
//    def square(value: Int) = value * value
//    def cube(value: Int) = value * square(value)
//  }

  // 2.4.5.4 Order of evaluation
  /**
   * 以下のプログラムは何を出力し、最終的な式の型と値は何か？
   *
   * object argh {
   *   def a = {
   *     println("a")
   *     1
   *   }
   *
   *   val b = {
   *     println("b")
   *     a + 2
   *   }
   *
   *   def c = {
   *     println("c")
   *     a
   *     b + "c"
   *   }
   * }
   *
   * argh.c + argh.b + argh.a
   */
//  def main(args: Array[String]): Unit = {
//    object argh {
//      def a = {
//        println("a")
//        1
//      }
//
//      val b = {
//        println("b")
//        a + 2
//      }
//
//      def c = {
//        println("c")
//        a
//        b + "c"
//      }
//    }
//
//    println(argh.c + argh.b + argh.a)
//    // println("b")
//    // println("a")
//    // println("c")
//    // println("a")
//    // println("3c31")
//
//    // 間違えた正解は以下
//    // println("b")
//    // println("a")
//    // println("c")
//    // println("a") -> def cの2行目のaでprintln("a")が実行される
//    // println("a")
//    // println("3c31")
//  }

  // 2.4.5.5 Greetings, human
  /**
   * firstNameとlastNameというフィールドを含むpersonオブジェクトを定義せよ
   * greet関数を含むalienオブジェクトを定義せよ
   * greet関数はpersonをパラメーターとして受け取り、personのfirstNameを使ってgreetingを返す
   */
////  object person {
////    val firstName = ""
////    val lastName = ""
////  }
////
////  object alien {
////    def greet(p: person): Unit = person.firstName
////  }
//
//  // 正解は以下
//  object person {
//    val firstName = "Dave"
//    val lastName = "Gurnell"
//  }
//
//  object alien {
//    def greet(p: person.type) =
//      "Greetings, " + p.firstName + " " + p.lastName
//  }

  // 2.4.5.6 The Value of Methods
  /**
   * 関数は値か？式か？なぜそうなるか？
   */
  // 値
  // 正解は以下
  // 関数の呼び出しは式だが、関数自体は値

  // 2.5 Writing Methods

  // 2.5.1 Identify the Input and Output

  // 2.5.2 Prepare Test Cases

  // 2.5.3 Write the Declaration

  // 2.5.4 Run the Code

  // 2.5.5 Write the Body

  // 2.5.5.1 Consider the Result Type

  // 2.5.5.2 Consider the Input Type

  // 2.5.6 Run the Code, Again

}
