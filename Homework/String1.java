package Homework;

public class String1 {
    public static void main(java.lang.String[] args) {
        java.lang.String firstName = "Семён";
        java.lang.String middleName = "Семёнович";
        java.lang.String lastName = "Иванов";
        java.lang.String fullName = lastName + " " + middleName + " " + firstName;
        System.out.println("ФИО сотрудника -" + " " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + " " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника —" + " " + fullName.replace("ё", "е" ));
        System.out.println(firstName);
    }
}
