package Polymorphism;

public class Polymorphisms {

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.phonNo = "777777";
        driver.parentWelcome();
    }
}

class WoberUser {
    int id;
    String name;
    int age;
    String address;
    String phonNo;

    public void welcome() {
        System.out.println("welcome wober user");
    }
}

class User extends WoberUser {
    String pet_name;
    String pet_id;
}

class Driver extends WoberUser {
    String veichle_name;
    String veichle_number;

    // Method Overriding (Polymorphism)
    @Override
    public void welcome() {
        System.out.println("Have a safe journey");
    }

    public void parentWelcome() {
        super.welcome(); // Calling the parent class's welcome() method
    }
}