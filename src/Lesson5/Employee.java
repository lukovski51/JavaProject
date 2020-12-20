package Lesson5;

public class Employee {
    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String phoneNumber;
    private String email;
    private float salary;
    private int birthYear;
    private static final int CURRENT_YEAR = 2020;

    Employee ( String surname,
               String name,
               String middleName,
               String position,
               String phoneNumber,
               String email,
               float salary,
               int birthYear) {
        this.surname =surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    String getSurname(){
        return surname;
    }
    String getName(){
        return name;
    }
    String getMiddleName(){
        return middleName;
    }
    String getPosition(){
        return position;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    String getEmail(){
        return email;
    }
    float getSalary(){
        return salary;
    }
    int getAge(){
        return CURRENT_YEAR - birthYear;
    }
    String getInfo(){
        return
                surname +
                        " " + name +
                        " " + middleName +
                        ", " + position +
                        ". Phone number: " + phoneNumber +
                        ". E-mail: " + email +
                        ". Salary: " + salary +
                        ". " + getAge() + " years old.";
    }

}
