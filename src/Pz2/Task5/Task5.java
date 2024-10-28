package Pz2.Task5;


public class Task5 {
    public static void main(String[] args) {
        Person Vladyslav = new Person("Василенко Владислав Олегович", Person.Gender.MAN,
                20, "Чехія", "Прага", false);
        Person Oleg = new Person("Данилевський Олег Петрович", Person.Gender.MAN,
                30, "Німеччина", "Гамбург", true);

        System.out.println("Дані першої особи: " + Vladyslav.getFullName() + " " + Vladyslav.getAge() + " " + Vladyslav.getCountry() + " " + Vladyslav.getCity() + " " + Vladyslav.getGender() + " " + Vladyslav.isCitizen());
        System.out.println("Дані другої особи: " + Oleg.getFullName() + " " + Oleg.getAge() + " " + Oleg.getCountry() + " " + Oleg.getCity() + " " + Oleg.getGender() + " " + Oleg.isCitizen());
    }
}
