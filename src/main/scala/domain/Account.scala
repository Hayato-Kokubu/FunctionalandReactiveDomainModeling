package domain

import java.time.LocalDate

trait Account {
  def no: String
  def name: String
  def bank: Bank
  def address: Address
  def dateOfOpening: LocalDate,
  def dateOfClose: Option[LocalDate]
  //..
}

case class CheckingAccount(
  no: String,
  name: String,
  bank: Bank,
  address: Address,
  dateOfOpening: LocalDate,
  dateOfClose: Option[LocalDate],
) extends Account

case class SavingsAccount(
  no: String,
  name: String,
  bank: Bank,
  address: Address,
  dateOfOpening: LocalDate,
  dateOfClose: Option[LocalDate],
) extends Account

case class MoneyMarketAccount(
  no: String,
  name: String,
  bank: Bank,
  address: Address,
  dateOfOpening: LocalDate,
  dateOfClose: Option[LocalDate],
) extends Account

// trait で分けている。
// Account trait にaccountType みたいのをつけるのはどうなんだろう？

case class Address()

object Account {
  def apply(/* parameters */) = {
    // instantiate Checking, Savings or MoneyMarket account
    // depending on parameters
  }
}