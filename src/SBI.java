import java.util.Objects;

public class SBI implements BankInterface{

    private String Name;
    private int AccountNO;
    private String Password;
    private int Balance;
    private int Rate;


    public SBI(String Name, int AccountNO, String Password, int Balance) {
        this.Name = Name;
        this.AccountNO = AccountNO;
        this.Password = Password;
        this.Balance = Balance;
        this.Rate=10;
    }

    @Override
    public double checkBalance() {
        return this.Balance;
    }

    @Override
    public String addMoney(int amount) {
        this.Balance=this.Balance+amount;
        return "Money successfully added";
    }

    @Override
    public String withDraw(int amount, String password) {
        if(Objects.equals(this.Password,password)){
            if(this.Balance>=amount){
                this.Balance=this.Balance-amount;
                return "withDraw success Balance is"+this.Balance;
            }
            else{
                return "Insufficient Balance";
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return ((this.Balance*years*Rate)/100.0)+this.Balance;
    }
}
