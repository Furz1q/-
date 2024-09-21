public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1, 2");
        String firstName = "Ivan";String lastName = "Ivanov";
        String middleName = "Ivanovich";

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s\n", fullNameUpperCase);

        System.out.println("Задание 3");

        fullName = "Иванов Семён Семёнович";
        String result = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s\n", result);
    }
}