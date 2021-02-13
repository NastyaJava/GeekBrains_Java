public class Employee {
    String name;
    String position;
    String email;
    String  phone;
    int salary;
    int age;

    Employee( String name, String position, String email, String phone, int salary, int age ){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void infoAboutPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Position: "+this.position);
        System.out.println("Email: "+this.email);
        System.out.println("Phone number: "+this.phone);
        System.out.println("Salary: "+this.salary);
        System.out.println("Age: "+this.age);
    }
}
