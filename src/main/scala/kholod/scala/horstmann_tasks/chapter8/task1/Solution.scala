package kholod.scala.horstmann_tasks.chapter8.task1

object Solution extends App {

  val bankAccount = new BankAccount(100)
  bankAccount.info()

  bankAccount.deposit(50)
  bankAccount.info()

  bankAccount.withdraw(20)
  bankAccount.info()
  println()

  val checkingAccount = new CheckingAccount(100)
  checkingAccount.info()

  checkingAccount.deposit(50)
  checkingAccount.info()

  checkingAccount.withdraw(20)
  checkingAccount.info()
}
