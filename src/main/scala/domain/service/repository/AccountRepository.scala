package domain.service.repository

import domain.model.{Account, Criteria}

trait AccountRepository {
  def query(accountNo: String): Option[Account]
  def query(criteria: Criteria[Account]): Seq[Account]// 条件みたいなやつで、それに従うものを取ってくる？
  def write(accounts: Seq[Account]): Boolean
  def delete(account: Account): Boolean
}