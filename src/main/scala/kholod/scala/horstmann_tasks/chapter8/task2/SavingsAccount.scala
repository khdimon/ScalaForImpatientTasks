package kholod.scala.horstmann_tasks.chapter8.task2

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private var countOperations = 0

  override def deposit(amount: Double): Double = {
    super.deposit(amount)
    countOperations += 1
    if (countOperations > SavingsAccount.freeOperations) super.withdraw(1)
    super.getBalance
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount)
    countOperations += 1
    if (countOperations > SavingsAccount.freeOperations)  super.withdraw(1)
    super.getBalance
  }

  def earnMonthlyInterest(): Unit = {
    println("Month ended")
    super.deposit(super.getBalance * SavingsAccount.monthlyInterest / 100)
    countOperations = 0
  }
}

object SavingsAccount {
  private val freeOperations = 3
  private val monthlyInterest = 1.0
}
