package kholod.scala.horstmann_tasks.chapter8.task1

class BankAccount(initialBalansce: Double) {
  private var balance = initialBalansce

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }

  def info(): Unit = {
    println("[" + this.getClass.getSimpleName + "]: balanse = " + balance)
  }
}
