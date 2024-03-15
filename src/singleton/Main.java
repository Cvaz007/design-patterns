package singleton;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("jairo", 1);
        Employee employee2 = new Employee("Maria", 2);


        AccessControlSystem system = AccessControlSystem.getInstance();


        system.registerEntry(employee1, new Date());
        system.registerExit(employee1, new Date());
        system.registerEntry(employee2, new Date());
        system.registerExit(employee2, new Date());

        system.generateReport();
    }
}