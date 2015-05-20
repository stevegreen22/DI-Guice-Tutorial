package student;

/**
 * Created by SteveGreen on 20/05/15.
 */
public class Student {

    private Integer id;
    private String name;
    private Integer credits;
    private Boolean registered;
    private String major;
    private String year;

    public Student(){}

    public Student(Integer id, Integer credits){
        this.id = id;
        this.credits = credits;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
