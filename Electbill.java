import java.util.Scanner;
public class Electbill {
public static void main(String[] args) {
Consumer ob = new Consumer();
ob.getData();
ob.calc();
ob.display();
}
}
class Consumer {
Scanner in = new Scanner(System.in);
int cno;
String cname, typeOfConn;
double preReading, currReading, unitConsumed, tbill;
void getData() {
System.out.print("\n\tEnter consumer number: ");
cno = in.nextInt();
in.nextLine();
System.out.print("\n\tEnter consumer name: ");
cname = in.nextLine();
System.out.print("\n\tEnter the type of connection (Domestic/Commercial): ");
typeOfConn = in.nextLine();
System.out.print("\n\tEnter previous month reading: ");
preReading = in.nextDouble();
System.out.print("\n\tEnter current month reading: ");
currReading = in.nextDouble();
}
void calc() {
unitConsumed = currReading - preReading;
if (typeOfConn.equalsIgnoreCase("Domestic")) {
if (unitConsumed <= 100)
tbill = 1 * unitConsumed;
else if (unitConsumed <= 200)
tbill = 2.50 * unitConsumed;
else if (unitConsumed <= 500)
tbill = 4 * unitConsumed;
else
tbill = 6 * unitConsumed;
} else if (typeOfConn.equalsIgnoreCase("Commercial")) {
if (unitConsumed <= 100)
tbill = 2 * unitConsumed;
else if (unitConsumed <= 200)
tbill = 4.50 * unitConsumed;
else if (unitConsumed <= 500)
tbill = 6 * unitConsumed;
else
tbill = 7 * unitConsumed;
} else {
System.out.println("Invalid connection type.");
}
}
void display() {
System.out.println("\n\tConsumer Name = " + cname);
System.out.println("\tUnits Consumed = " + unitConsumed);
System.out.println("\tTotal Bill = Rs. " + tbill);
}
}  
