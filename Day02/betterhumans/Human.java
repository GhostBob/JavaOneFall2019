package betterhumans;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.Locale;

public class Human {

    private String name;
    private int age;
    private Date birthday;
    private String hairColor;
    private String eyeColor;
    private String nationality;
    private String sex;
    private String gender;
    private String favFood;

    //Default Constructor
    public Human() {
        this.name = "Bob";
        this.age = 1;
        this.hairColor = "Brown";
        this.eyeColor = "Brown";
        this.nationality = "Argentinian";
        this.sex = "Female";
        this.gender = "Female";
        this.favFood = "Pizza";
    }

    public Human(String name) {
        this();
        this.name = name;
    }

    public Human(String name, int age, String hairColor, String eyeColor,
            String nationality, String sex, String gender) {
        this(); //Should be the first thing you do in non-default Constructors
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
        this.sex = sex;
        this.gender = gender;
    }
    
        public static int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH)
                || (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    // ** Standard Getters and Setters from here on out **
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
        this.age = getDiffYears(new Date(), birthday);
    }
}
