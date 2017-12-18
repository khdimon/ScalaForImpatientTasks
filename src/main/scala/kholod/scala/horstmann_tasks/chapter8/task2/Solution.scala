package kholod.scala.horstmann_tasks.chapter8.task2

object Solution extends App {

  val savingsAccount = new SavingsAccount(100)
  savingsAccount.info()

  savingsAccount.deposit(50)
  savingsAccount.info()

  savingsAccount.withdraw(20)
  savingsAccount.info()

  savingsAccount.deposit(50)
  savingsAccount.info()

  savingsAccount.withdraw(20)
  savingsAccount.info()

  savingsAccount.earnMonthlyInterest()
  savingsAccount.info()

  savingsAccount.deposit(50)
  savingsAccount.info()
}
