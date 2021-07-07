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

}
