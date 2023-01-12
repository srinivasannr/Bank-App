public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withDraw(int amount,String password);
    double calculateInterest(int years);
}
