package ca.ubc.cs304.model;

public class PlayersModel {
    private int jerseynumber;
    private String tname;
    private String city;
    private final String pname;
    private final int height;
    private final int weight;
    private int age;
    private int clicencenumber;

    public PlayersModel(int jerseynumber, String tname, String city, String pname, int height, int weight, int age, int clicencenumber) {
        this.jerseynumber = jerseynumber;
        this.tname = tname;
        this.city = city;
        this.pname = pname;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.clicencenumber = clicencenumber;
    }

    public int getJerseynumber() {
        return jerseynumber;
    }

    public String getTname() {
        return tname;
    }

    public String getCity() {
        return city;
    }

    public String getPname() {
        return pname;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getClicencenumber() {
        return clicencenumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJerseynumber(int jerseynumber) {
        this.jerseynumber = jerseynumber;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setClicencenumber(int clicencenumber) {
        this.clicencenumber = clicencenumber;
    }
}
