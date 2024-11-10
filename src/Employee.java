public class Employee {

    private String name; // Имя сотрудника
    private Customer.Gender gender; // Пол сотрудника

    public Employee(String name, Customer.Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer.Gender getGender() {
        return gender;
    }

    public void setGender(Customer.Gender gender) {
        this.gender = gender;
    }
}
