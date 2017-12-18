package kholod.scala.horstmann_tasks.chapter8.task1

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  override def deposit(amount: Double): Double = {
    super.deposit(amount)
    super.withdraw(1)
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount)
    super.withdraw(1)
  }
}
