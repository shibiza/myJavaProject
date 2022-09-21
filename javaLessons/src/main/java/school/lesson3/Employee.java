package school.lesson3;

public class Employee {

    private String surname;
    private String name;
    private String patronymic;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String surname, String name, String patronymic,
                    String jobTitle, String email, String phoneNumber, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeData() {
        System.out.println(" Фамилия: " + surname + " Имя: " + name + " Отчество: " + patronymic + " Должность: " + jobTitle
                + " email: " + email + " телефон: " + phoneNumber + " зарплата: " + salary + " возраст: " + age);
    }

    public static void main(String[] args) {

        Employee[] persEmployee = new Employee[5];
        persEmployee[0] = new Employee("Иванов", "Олег", "Егорович", "Генеральный директор",
                "ivanov@gmail.com", "80291111111", 50000, 52);
        persEmployee[1] = new Employee("Петров", "Илья", "Петрович", "Главный бухгалтер",
                "petrovSila@gmail.com", "80292222222", 23000, 39);
        persEmployee[2] = new Employee("Сидоров", "Семен", "Денисович", "Водитель",
                "sidorSemen@gmail.com", "80293333333", 9500, 41);
        persEmployee[3] = new Employee("Кулибин", "Николай", "Иванович", "Менеджер по продажам",
                "kylib@gmail.com", "80294444444", 14000, 34);
        persEmployee[4] = new Employee("Додиков", "Илья", "Георгиевич", "Кладовщик",
                "dodykov1@gmail.com", "80295555555", 5000, 22);

        for (Employee employee : persEmployee) {
            if (employee.age > 40) {
                employee.printEmployeeData();
            }
        }
    }
}
