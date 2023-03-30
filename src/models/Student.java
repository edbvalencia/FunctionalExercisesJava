package models;

public class Student {

    private Integer id;
    private String name;
    private Boolean isActive;
    private Integer age;
    private Double average;
    private String courseLetter;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.isActive = false;
    }

    public Student(Integer id, String name, Integer age, Double average, String courseLetter) {
        this(id, name);
        this.age = age;
        this.average = average;
        this.courseLetter = courseLetter;
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

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}
