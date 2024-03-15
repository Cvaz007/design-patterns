package singleton;

import java.util.Date;

class Record {
    private Employee employee;
    private Date entry;
    private Date exit;

    public Record(Employee employee, Date entry) {
        this.employee = employee;
        this.entry = entry;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getEntry() {
        return entry;
    }

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) {
        this.exit = exit;
    }
}
