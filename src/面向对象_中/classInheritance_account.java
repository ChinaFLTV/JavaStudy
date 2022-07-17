package 面向对象_中;


/*实验 类的继承，super
        1、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
        账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
        setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
        deposit()。
        Account
private int id
private double balance
private double annualInterestRate
public Account (int id, double balance, double annualInterestRate )
public int getId()
public double getBalance()
public double getAnnualInterestRate()
public void setId( int id)
public void setBalance(double balance)
public void setAnnualInterestRate(double annualInterestRate)
public double getMonthlyInterest()
public void withdraw (double amount)
public void deposit (double amount)
        写一个用户程序测试 Account 类。在用户程序中，创建一个账号为 1122、余额为 20000、
        年利率 4.5%的 Account 对象。使用 withdraw 方法提款 30000 元，并打印余额。
        再使用 withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额和月利
        率。
        提示：在提款方法 withdraw 中，需要判断用户余额是否能够满足提款数额的要求，如果不
        能，应给出提示。
        运行结果如图所示：
        2、创建 Account 类的一个子类 CheckAccount 代表可透支的账户，该账户中定义一个属性
        overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
        如果（取款金额<账户余额），
        可直接取款
        如果（取款金额>账户余额），
        计算需要透支的额度
        判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
        将账户余额修改为 0，冲减可透支金额
        如果不可以
        提示用户超过可透支额的限额
        要求：写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122、余
        额为 20000、年利率 4.5%，可透支限额为 5000 元的 CheckAccount 对象。
        使用 withdraw 方法提款 5000 元，并打印账户余额和可透支额。
        再使用 withdraw 方法提款 18000 元，并打印账户余额和可透支额。
        再使用 withdraw 方法提款 3000 元，并打印账户余额和可透支额。
        提示：
        （1） 子类 CheckAccount 的构造方法需要将从父类继承的 3 个属性和子类自己的属性全
        部初始化。
        （2） 父类Account的属性balance被设置为private，但在子类CheckAccount的withdraw
        方法中需要修改它的值，因此应修改父类的 balance 属性，定义其为 protected。
        运行结果如下图所示：*/


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class classInheritance_account {

    public static void main(String[] args) throws ParseException, InterruptedException {

        Account a = new Account((double) NumberFormat.getPercentInstance().parse("3.456%"));

        while (true) {
            System.out.println("Welcome to our 'The more you deposit,the richer you are' bank!");
            Thread.sleep(1000);
            System.out.println("Do you withdraw or deposit? Please input 1 for withdrawing,0 for deposit.");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {

                System.out.println("Please input your withdrawal amount: ");
                long withdraw = input.nextLong();
                if (withdraw > 0 && withdraw <= 999999 && (a.getBalance() - withdraw >= 0)) {

                    a.withdraw(withdraw);

                } else {

                    System.out.println("Your inputted withdrawal amount is deviant.");

                    return;

                }
            } else if (choice == 0) {

                System.out.println("Please input your deposit amount: ");
                long deposit = input.nextLong();
                if (deposit > 0) {

                    a.deposit(deposit);

                } else {

                    System.out.println("Your inputted deposit amount is deviant>.");
                    return;

                }
            } else {

                System.out.println("Your inputted num is deviant,please input it anew.");
                return;

            }
        }

    }


}

class Account {

    private long id;
    private long balance;
    private double annualInterestRate;

    public Account() {

        ;

    }

    public Account(long number) {

        this.id = number;

    }

    public Account(double annualInterestRate) {

        this();
        this.annualInterestRate = annualInterestRate;
        long number;
        number = (long) (ThreadLocalRandom.current().nextDouble() * 1000000000);
        this.id = number;
        this.balance = 0;

    }

    protected void setter(long id, double annualInterestRate, long balance) {

        this.id = id;
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;

    }

    long getID() {

        return this.id;

    }

    public double getAnnualInterestRate() {

        return this.annualInterestRate;

    }

    public long getBalance() {

        return this.balance;

    }

    public void setBalance(long balance) {

        this.balance = balance;

    }

    protected void setAnnualInterestRate(String percentage) throws ParseException {

        this.annualInterestRate = (double) (NumberFormat.getPercentInstance().parse(percentage));

    }

    public void withdraw(long amount) {

        if (this.balance - amount >= 0) {

            this.balance -= amount;
            System.out.println("----------------Successfully Withdraw " + amount + " CNY ----------------");
            System.out.println("The balance of the current amount is: " + this.balance + " CNY");

        } else {

            System.out.println("----------------Abortively Withdraw " + amount + " CNY ----------------");
            System.out.println("The balance of the current amount is: " + this.balance + " CNY");
            return;

        }


    }

    public void deposit(long amount) {

        this.balance += amount;
        System.out.println("----------------Successfully deposit " + amount + " CNY----------------");
        System.out.println("The balance of the current amount is: " + this.balance + " CNY");

    }


}
