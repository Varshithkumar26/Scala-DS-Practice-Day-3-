object maxProfit extends App{
  def solve(prices: Array[Int], minsofar: Int, ans: Int): Int = {
    if (prices.isEmpty) return ans
    val mini = math.min(minsofar, prices.head)
    val profit = math.max(ans,prices.head - mini)
    solve(prices.tail,mini,profit)
  }
  def maxProfit(prices: Array[Int]): Int = {
    solve(prices,Int.MaxValue,0)
  }
  val ls = Array(7,1,5,3,6,4)
  println(maxProfit(ls))
}

