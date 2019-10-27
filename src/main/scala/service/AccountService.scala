package service

import domain.model.{Account, Amount}

trait AccountService {
  def transfer(
    from: Account,
    to: Account,
    amount: Amount
  ): Option[Amount]
}
