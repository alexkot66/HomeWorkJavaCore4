public class Customer {

    public enum Gender {
        MALE,  // Мужской пол
        FEMALE // Женский пол
    }

    private String name; // Имя покупателя
    private Gender gender; // Пол покупателя

    public Customer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
