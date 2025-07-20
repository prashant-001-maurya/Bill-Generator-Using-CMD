public class Customer {

    //Attributes for the customers

    private String name;
    private String phone;
    private Car car;
    //we can create the class Customer object when
    //we are having the car object--Constructor

    public Customer(String name, String phone, Car car) {
        this.name = name;
        this.phone = phone;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }


    public Car getCar() {
        return car;
    }

}
