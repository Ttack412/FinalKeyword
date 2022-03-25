final class Bank {
  static int amount = 5000;
  final int pin = 5489;

  final void withdraw(int amount){
    this.amount -= amount;
  }
}