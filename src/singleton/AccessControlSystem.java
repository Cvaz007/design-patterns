package singleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class AccessControlSystem {
    private static AccessControlSystem instance;
    private List<Record> records;


    private AccessControlSystem() {
        this.records = new ArrayList<>();
    }


    public static AccessControlSystem getInstance() {
        if (instance == null) {
            instance = new AccessControlSystem();
        }
        return instance;
    }

    public void registerEntry(Employee employee, Date entry) {
        records.add(new Record(employee, entry));
        System.out.println("Entrada registrada para " + employee.getName() + " at " + entry);
    }

    public void registerExit(Employee employee, Date exit) {
        for (Record record : records) {
            if (record.getEmployee().getId() == employee.getId() && record.getExit() == null) {
                record.setExit(exit);
                System.out.println("Salida registrada para " + employee.getName() + " at " + exit);
                return;
            }
        }
        System.out.println("No se encontró un registro de entrada válido para " + employee.getName());
    }

    public void generateReport() {
        System.out.println("Informe de asistencia:");
        for (Record record : records) {
            System.out.println(record.getEmployee().getName() + " - Entrada: " + record.getEntry() + ", Salida: " + record.getExit());
        }
    }
}
