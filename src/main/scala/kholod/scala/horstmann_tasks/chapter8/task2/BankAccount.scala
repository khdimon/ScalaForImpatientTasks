package kholod.scala.horstmann_tasks.chapter8.task2

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

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

  def getBalance: Double = {
    balance
  }
}
