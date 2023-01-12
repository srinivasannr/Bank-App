import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter Details");

        String name=sc.next();

        String password=sc.next();

        int balance=sc.nextInt();

        int accountNum=1234;




        SBI ref=new SBI(name,accountNum,password,balance);

        System.out.println(ref.checkBalance());
        System.out.println(ref.addMoney(100));
        System.out.println(ref.withDraw(1000,"pass"));
        System.out.println(ref.calculateInterest(10));

    }
}