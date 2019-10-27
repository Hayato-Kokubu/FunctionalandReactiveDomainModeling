trait Account {

}

case class CheckingAccount(/* parameters */) extends Account
case class SavingsAccount(/* parameters */) extends Account
case class MoneyMarketAccount(/* parameters */) extends Account

// trait で分けている。
// Account trait にaccountType みたいのをつけるのはどうなんだろう？


object Account {
  def apply(/* parameters */) = {
    // instantiate Checking, Savings or MoneyMarket account
    // depending on parameters
  }
}