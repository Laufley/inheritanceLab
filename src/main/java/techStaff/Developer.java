package techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, int niNumber, int salary){
        super(name, niNumber, salary);
    }

    public String complain() {
        return "I haaaate JavaScript!";
    }
}
