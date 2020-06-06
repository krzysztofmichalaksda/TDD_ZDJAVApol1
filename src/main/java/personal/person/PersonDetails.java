package personal.person;

public class PersonDetails {
    String name;
    String lastName;
    int age;
    public PersonDetails(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String checkAge() {
        if (age < 11) {
            return "Dziecko";
        } else if (age < 18) {
            return "Nastolatek";
        } else {
            return "Dorosły";
        }
    }
}
