import java.util.Date;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class MtnMoMoClone {
static int number;
static String code;
static Scanner input = new Scanner(System.in);
static Date current = new Date();

public static void main(String[] args) {
System.out.println("\nTODAY :" + current + "\n");
exception();
}

public static void numberDisplay() {
System.out.println("\nMenu\n1)Transfer Money\n2)MoMopay & Pay Bill\n3)Airtime & Bundle\n4)Allow Cash Out\n5)Financial Service\n6)My Wallet
");
number = input.nextInt();
}

public static void myIfStatement() {
numberDisplay();
if (number == 1) {
System.out.println("Transfer Money\n1)MoMo User\n2)Non MoMo User\n3)Send with Care\n4)Favorite\n5)Other Network \n6)Bank Account\n0)Back");
System.out.println("select 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else if (number == 2) {
System.out.println("MoMoPay & PayBill\n1)MoMoPay\n2)Pay Bill\n3)GhQR\n0)Back\nselect 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else if (number == 3) {
System.out.println("Airtime & Bundles\n1)Airtime\n2)Internet Bundles\n3)Fixed Broadband\n4)Schedule Airtime\n0)Back");
System.out.println("select 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
}
} else if (number == 3) {
System.out.println("Airtime & Bundles\n1)Airtime\n2)Internet Bundles\n3)Fixed Broadband\n4)Schedule Airtime\n0)Back");
System.out.println("select 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else if (number == 4) {
System.out.println("Allow Cash Out\n1)Yes\n2)No\n0)Back\nselect 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else if (number == 5) {
System.out.println("Financial Service\n1)Bank Services\n2)Savings\n3)Loans\n4)Pensions and Investments\n5)Insurance\n6)Trade Shares\n0)Back");
System.out.println("select 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else if (number == 6) {
System.out.println("My Wallet\n1)Check Balance\n2)Allow Cash Out\n3)My Approvals\n4)Report Fraud\n5)Statements\n6)Change & Reset PIN\n7)Airtime\n0)Back");
System.out.println("select 0 to go back");
number = input.nextInt();
if(number==0){
numberDisplay();
}
} else {
System.out.print("Incorrect choice , try again");
numberDisplay();
}
}

public static void codeInput() {
System.out.println("Enter MTN MoMo code");
code = input.next();
if (Objects.equals(code, "*170#")) {
myIfStatement();
} else {
System.out.println("UNKNOWN APPLICATION");
System.out.println("Enter code again");
code = input.next();
if (Objects.equals(code, "*170#")) {
myIfStatement();
}
}
}

public static void exception() {
do {
try {
codeInput();
} catch (InputMismatchException ex) {
System.out.println("Expecting only integer values");
System.out.println("try again");
code = input.next();
}break;
} while (false);
myIfStatement();
}
}
