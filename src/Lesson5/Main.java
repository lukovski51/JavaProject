package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("Bychenkov","Evgeniy","Aleksandrovich",
                        "Developer","89257057583","lukovski51@gmail.com",
                        150000,1992),
                new Employee("Zubenko", "Mihail","Petrovich",
                        "mafioznik","89114564545","mafioznik@raion.ru",
                        100500, 1978),
                new Employee("Petrov","Aleksandr", "Evgenievich",
                        "Fitness-Trainer", "89153456215","yanefsb@fsb.ru",
                        70000, 1979),
                new Employee("Boshirov", "Ruslan","Sergeevich",
                        "Fitness-Trainer","89153456216", "yatozhenefsb@fsb.ru",
                        70000, 1980),
                new Employee("Ponasenkov", "Evgeniy", "Nikolaevich",
                        "Maestro", "89010000001","maestro@yandex.ru",
                        500000,1982)
        };

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                System.out.println(employees[i].getInfo());
            }

        }
    }
}
