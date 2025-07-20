import java.util.Scanner;

public class Garagebillingapp {
    //Driver--Abstraction
    public static void main(String[] args) {
        Garage garageService=new Garage();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("--------New Car Service------------");
            System.out.println("1.Add customer");
            System.out.println("2.Create Invoice");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Customer Name:");
                    sc.nextLine();
                    String name=sc.nextLine();
                    System.out.println("Enter Phone Number");
                    String phone=sc.next();
                    System.out.println("Enter Car Number");
                    String carNum=sc.next();
                    System.out.println("Enter car Model");
                    sc.nextLine();
                    String model=sc.nextLine();
                    garageService.addCustomer(name,phone,carNum,model);
                    break;
                case 2:
                    System.out.println("Enter car number");
                    String carNo=sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting....Thank you");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice,Try Again");
            }

        }
    }
}
