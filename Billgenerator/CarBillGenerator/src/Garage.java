import java.util.*;

public class Garage {

    private Map<String,Customer> customersMap;
    private List<Service> avilableServices;

    public Garage(){
        this.customersMap=new HashMap<>();
        this.avilableServices=new ArrayList<>();
        loadservices();
    }
    public void loadservices(){
        avilableServices.add(new Service("Car Wash",500));
        avilableServices.add(new Service("Oil Change",700));
        avilableServices.add(new Service("Wheel Alignment",300));
        avilableServices.add(new Service("Puncture",50));
    }
    public void addCustomer(String name,String phone,String carNumber,String model){
        Car car=new Car(carNumber,model);
        Customer customer=new Customer(name,phone,car);
        customersMap.put(carNumber,customer);
        System.out.println("Customer added successfully");

    }
    public void createInvoice(String carNumber){
        if(!customersMap.containsKey(carNumber)){
            System.out.println("No customer found"+carNumber);
            return;
        }
        Scanner sc=new Scanner(System.in);
        Customer customer=customersMap.get(carNumber);
        Invoice invoice =new Invoice(customer);
        System.out.println("Available Services");
        for(int i=0;i<avilableServices.size();i++){
            System.out.println((i+1)+"."+avilableServices.get(i).getName()+"-₹"+avilableServices.get(i).getPrice());
        }
        while (true){
            System.out.println("Enter Services number to add:");
            int choice=sc.nextInt();
            if(choice==0) break;
            if(choice>0 && choice<=avilableServices.size()){
                invoice.addService((avilableServices.get(choice-1)));
                System.out.println("Service Done");
            }else{
                System.out.println("Invalid Service");
            }

        }
        invoice.printInvoice();
    }
}
