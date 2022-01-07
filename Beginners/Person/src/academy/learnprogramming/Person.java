package academy.learnprogramming;

public class Person {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        this.age = 0<=age && age<=100 ? age : 0;
    }

    public boolean isTeen() {
        return 12<age && age<20;
    }

    public String getFullName() {
        if (firstName.equals("")) return lastName;
        else if (lastName.equals("")) return firstName;
        else return firstName + " " + lastName;
    }

}
