package ca.ubc.cs304.model;

public class CoachesModel {
    private final int clicensenumber;
    private String cname;
    private String gender;
    private int age;

    public CoachesModel(int clicensenumber, String cname, String gender, int age) {
        this.clicensenumber = clicensenumber;
        this.cname = cname;
        this.gender = gender;
        this.age = age;
    }

    public int getClicensenumber() {
        return clicensenumber;
    }

    public String getCname() {
        return cname;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
