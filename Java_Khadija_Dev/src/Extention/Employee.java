package Extention;

public class Employee {
    String name;
    String salary;
    void work(){
        System.out.println("Employee performs his duties");
    }
}
class Developer extends Employee {
    String language;
    void work(){
        System.out.println("Developer writes code in Java");
    }
}
class Manager extends Employee {
    String teamSize;
    void work(){
        System.out.println("Manager manages a team of N people");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Developer dev = new Developer();
        Manager man = new Manager();
        String[] employee = {"Employee", "Developer", "Manager"};
        for (String Empl : employee){
            if (Empl == "Employee"){
                emp.work();
            } else if (Empl == "Developer"){
                dev.work();
            } else {
                man.work();
            }
        }
    }
}
