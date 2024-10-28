package Pz2.Task5;

public class Person {
    private String fullName;
    private Gender gender;
    private int age;
    private String country;
    private String city;
    private boolean citizenship;

    public enum Gender {
        MAN, WOMAN
    }

    public Person (String fullName, Gender gender, int age, String country, String city, boolean citizenship){
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.city = city;
        this.citizenship = citizenship;
    }

    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public boolean isCitizen() {
        return citizenship;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCitizenship(boolean citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public String toString() {
        return "Особа:" +
                "ПІБ: '" + fullName + '\'' +
                ", стать: " + gender +
                ", вік: " + age +
                ", країна проживання: '" + country + '\'' +
                ", місто проживання: '" + city + '\'' +
                ", громадянство: " + citizenship +
                '}';
    }
}

