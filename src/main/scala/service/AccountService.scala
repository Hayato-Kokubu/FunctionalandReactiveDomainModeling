package service

import domain.{Account, Amount}

trait AccountService {
  def transfer(
    from: Account,
    to: Account,
    amount: Amount
  ): Option[Amount]
}
