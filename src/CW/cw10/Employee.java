package CW.cw10;

public class Employee {
    int id;
    String name;
    String surname;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    int departmentId;

    public Employee(int id, String name, String surname, int departmentId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.departmentId = departmentId;
    }
}
